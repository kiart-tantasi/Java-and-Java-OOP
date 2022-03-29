import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegEx {
    public static void main(String[] args) {
        String sentence = "I Love CaT So Much !";

        System.out.println("Searching 'cat' from 'I Love CaT So Much !'...\n");

        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher(sentence);
        System.out.println("REGULAR SEARCHING: " + matcher.find());

        Pattern patternTwo = Pattern.compile("cat", Pattern.CASE_INSENSITIVE);
        Matcher matcherTwo = patternTwo.matcher(sentence);
        System.out.println("CASE_INSENSITVE SEARCHING: " + matcherTwo.find());

        System.out.println("\nmatcher object: " + matcher);
        System.out.println("matcherTwo object: " + matcherTwo);

        // find from characters

        String word = "Abstract";
        Pattern wordPattern = Pattern.compile("[xyz]");
        Matcher wordMatcher = wordPattern.matcher(word);
        System.out.println("\nsearch '[xyz]' from 'Abstract': " + wordMatcher.find());

        Pattern wordPatternTwo = Pattern.compile("[axyz]");
        Matcher wordMatcherTwo = wordPatternTwo.matcher(word);
        System.out.println("\nsearch '[axyz]' from 'Abstract': " + wordMatcherTwo.find());

        Pattern wordPatternThree = Pattern.compile("[^abstrc]", Pattern.CASE_INSENSITIVE);
        Matcher wordMatcherThree = wordPatternThree.matcher(word);
        System.out.println("\nsearch '[^abstrc]' from 'Abstract': " + wordMatcherThree.find());

        Pattern wordPatternFour = Pattern.compile("[0-9]");
        Matcher wordMatcherFour = wordPatternFour.matcher(word);
        System.out.println("\nsearch '[0-9]' from 'Abstract': " + wordMatcherFour.find());

        String numStr = "51sad798sad";
        Pattern wordPatternFive = Pattern.compile("[0-9]");
        Matcher wordMatcherFive = wordPatternFive.matcher(numStr);
        System.out.println("\nsearch '[0-9]' from '51sad798sad': " + wordMatcherFive.find());
    }
}

// from W3Schools

//Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
//Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet


// ------------ !!! LEARN MORE !!! ------------ //
// https://www.w3schools.com/java/java_regex.asp

