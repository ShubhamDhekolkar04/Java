public class conditionalStatements {
   public static void main(String[] args) {
    
    int x = 10;
    int y = 18;
    int z = 20;

    if (x > y && x > z) {
    System.out.println(x);
    }
    else if(y > z ){
        System.out.println(y);
    }
    else{
        System.out.println(z);
    }
   }
}
