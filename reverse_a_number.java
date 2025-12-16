public class reverse_a_number {
    public int reverseNumber(int n){
        int reversed =0;
        while(n!=0){
            int digit = n %10;
            reversed = reversed *10 + digit;
            n /=10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        reverse_a_number ran = new reverse_a_number();
        int number =234897;
        int reversedNumber = ran.reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
    
}
