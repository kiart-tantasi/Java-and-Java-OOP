import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String str = "abc";

        // basic
        str.length(); // 3
        str.indexOf("b"); // 1
        str.charAt(1); // b
        str.indexOf("bc"); // same as above

        // compare
        ("a").compareTo("b"); // -1
        ("b").compareTo("a"); // 1

        // replace
        String toReplace = "dag dag";
        String replaced = toReplace.replace("a", "o"); // dog dog

        // replaceFirst
        String toReplaceFirst = "dag dag";
        String replacedFirst = toReplaceFirst.replaceFirst("a", "o"); // dog dag

        // replaceAll
        String toReplaceAll = "dag dag";
        String replacedAll = toReplaceAll.replaceAll("a", "o"); // dog dog

        // substring
        String mainString = "getOnlySubstringPlease";
        String mySubstring = mainString.substring(7, 16); // Substring (includes first index and not include last index)
                                                          // !

        // trim
        String notTrimmed = " a b c "; // ' a b c '
        String trimmed = notTrimmed.trim(); // 'a b c'

        // split
        String dummySentence = "I live in Thailand";
        String[] splitSentence = dummySentence.split(" "); // [I, live, in, Thailand]

        // transform to array to ArrayList
        ArrayList<String> sentenceArrayList = new ArrayList<>();
        for (String element : splitSentence) {
            sentenceArrayList.add(element);
        }
        // System.out.println(sentenceArrayList); // [I, live, in, Thailand]

        String toBeCharArray = "I am going to be char array";
        char[] charArray = toBeCharArray.toCharArray(); // same as above
        char[] dummyCharArray = { 'a', 'b', 'c' }; // abc

    }
}
