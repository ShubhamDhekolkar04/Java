
class calculator{
    

    public int addition(int n1 , int n2){
      
        int r = n1 + n2;
        return r;
    }

    public int subtraction(int s1,int s2){

        return s1 - s2;
    }
}

public class classAndObject {
   public static void main(String[] args) {

    int num1 =4;
    int num2 =5;

    calculator calc = new calculator();
 
    int res = calc.addition(num1 , num2);
    
    int resSubstract = calc.subtraction(num2,num1);

    System.out.println(res);
    System.out.println(resSubstract);
   }    
}

