public class factorial {
    public int factorial_using_recursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial_using_recursion(n-1);
    }
    public int factorialIterative(int n){

        int result = 1;
        for(int i=2;i<=n;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        factorial fact = new factorial();
        int number = 5; 
        int result = fact.factorial_using_recursion(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    
}
