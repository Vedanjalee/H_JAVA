public class ReverseInteger {
    public static int reverse(int num) {
        int reversed = 0;
        
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(num )); 
}
}
