public class CountCharacter {
    public static int countChar(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputStr = "hello";
        System.out.println(countChar(inputStr, 'l'));  // Output: 2
    }
}
