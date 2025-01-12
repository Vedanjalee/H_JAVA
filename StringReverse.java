public class StringReverse {
    public static String reverseString(String s) {
        String reversedStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String inputStr = "hello";
        System.out.println(reverseString(inputStr));  // Output: "olleh"
    }
}
