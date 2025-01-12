public class RemoveSpaces {
    public static String removeSpaces(String s) {
        return s.replace(" ", "");
    }

    public static void main(String[] args) {
        String inputStr = "hello world";
        System.out.println(removeSpaces(inputStr));  // Output: "helloworld"
    }
}
