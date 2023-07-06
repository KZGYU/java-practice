package test002;

public class Main {
	 
    public static void main(String[] args) {
        int result;
        result = div(5, 0);
        System.out.println("戻り値 = " + result);
    }
 
    public static int div(int num1, int num2) {
        try {
            int result = num1 / num2;
            
            return result;
 
        } catch (ArithmeticException e) {
            System.out.println("例外が発生しました。");
            System.out.println(e);
 
            return 0;
        }
    }
    
    
    

}