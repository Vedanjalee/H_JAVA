public class ReplaceSubstring {
    public static String replaceSubstring(String s, String oldStr, String newStr) {
        return s.replace(oldStr, newStr);
    }

    public static void main(String[] args) {
        String inputStr = "I love apples";
        System.out.println(replaceSubstring(inputStr, "Apples", "Oranges")); }
}
