import java.util.Arrays;

import static project_utils.Utils.isBlankStr;
import static project_utils.Utils.isEmptyStr;

public class StringMethods {

    // Custom algorithms and methods to work with String

    // 1. Algorithms to remove leading and trailing spaces
    public static String removeSpaces(String str) {

        if (!isEmptyStr(str) || !str.trim().isBlank()) {

            String strTrimmed = str.trim();

            if (str.length() - strTrimmed.length() == 0) {

                return "No extra whitespaces";
            }

            return strTrimmed;
        }

        return "String is empty or blank";
    }

    // 2. Algorithms to remove all "a" and "A" in the given String
    public static String removeAllAs(String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            return str.trim().replace("a", "").replace("A", "");
        }

        return "String is empty or blank";
    }

    // 3. Algorithms to remove All the zeros from a given string
    public static String removeAllZeros(String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            if (str.contains("0")) {

                return str.trim().replace(" ", "").replace("0", "");
            }

            return "This is not a valid string";
        }

        return "String is empty or blank";
    }

    // 4. Algorithms to remove All the spaces from a given string
    public static String removeAllSpaces(String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            return str.replace(" ", "");
        }
        return "String is empty or blank";
    }

    // 5. Algorithms to count occurrences of a/A chars and other symbols
    public static String countAs(String str) {

        String s = "s";
        boolean a = isBlankStr(s);
        System.out.println(a);

        if (!str.isEmpty() && !str.isBlank()) {

            int countA = 0;
            int coumtNotA = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c == 'a') {
                    countA++; // count total A
                } else {
                    coumtNotA++; // count total notA
                }
            }

            return (countA + ", " + coumtNotA);
        }

        return "String is empty or blank";
    }

    // 6. Algorithms to count words Java in given String
    public static boolean countJava(String str) {

        if ((str != null) && !str.isEmpty() && !str.isBlank()) {
            if (str.contains("Java")) {

                return true;
            }
        }
        return false;
    }

    // 7. Algorithms to add quotes to string
    public static String addQuotes (String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            return "".concat("\"").concat(str).concat("\"");
        }

        return "String is empty or blank";
    }

    // 8. Algorithms to insert quotes into reported speech
    public static String insertQuotesIntoReportedSpeech (String str1, String str2) {

        if ((!str1.trim().isEmpty() && !str1.trim().isBlank())
                && (!str2.trim().isEmpty() && !str2.trim().isBlank())) {
            str1 = str1.trim();
            str2 = str2.trim();

            if (str1.endsWith(" wrote")) {

                return str1.concat(": \"").concat(str2).concat("\"")
                        .replace("U+00AB", "\"")
                        .replace("U+00BB", "\"");
            }

            return "No correct string to join";
        }

        return "String is empty or blank";
    }

    // 9.1 Algorithms to capitalize the First Character // one word name
    public static String capitalizeFirstChar(String str) {

        if ((!str.trim().isEmpty() && !str.trim().isBlank())) {

            String [] wordsArr = str.trim().split(" ");
            String newSentence = "";

            for (String word : wordsArr) {
                for (int i = 0; i < word.length(); i++) {
                    newSentence = newSentence + ((i == 0)
                            ? word.substring(i, i + 1).toUpperCase()
                            : (i != word.length() - 1)
                            ? word.substring(i, i + 1).toLowerCase()
                            : word.substring(i, i + 1).toLowerCase().toLowerCase()
                            + " ");
                }

                return newSentence.trim();
            }
        }

        return "String is empty or blank";
    }

    // 9.2. Algorithms to capitalize the First Character // one word name
    public static String toTitleCase(String str) {
        if ((!str.trim().isEmpty() && !str.trim().isBlank())) {
            String[] arr = str.trim().toLowerCase().split(" ");
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < arr.length; i++) {
                sb.append(Character.toUpperCase(arr[i].charAt(0)))
                        .append(arr[i].substring(1)).append(" ");
            }
            return sb.toString().trim();
        }

        return "String is empty or blank";
    }

    // 10. Algorithms to get substring between occurrences of given char
    public static String getSubstringFromCharTillChar (String str, char ch) {

        if (ch == ' ' || ch == '\0' ) {
            return "Error: empty character constant";
        }
        str = str.trim();

        if (!isEmptyStr(str) || !str.trim().isBlank()) {
            String s = str.trim();
            if (s.indexOf(ch) >= 0) {
                int startIndex = str.indexOf(ch);
                int endIndex = s.lastIndexOf(ch) ;
                
                // endIndex + 1 - because end index is not inclusive
                return str.substring(startIndex, endIndex + 1);
            }

            return "No such char in the string";
        }

        return "Invalid input or string is empty or blank";
    }

    // 11. Algorithms to verify if First And Last Char Equal
    public static boolean areFirstAndLastCharEqual (String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank() && !str.trim().contains(" ")) {
            String s = str.trim().toLowerCase();

            return s.charAt(0) == s.charAt(s.length()-1);
//            return str.lastIndexOf(str.charAt(0)) == (str.length() - 1);  // the same result
        }

        return false;
    }

    // 12. Algorithms to get last word of sentence
    public static String lastWord (String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

        String[] words = str.trim().split(" ");
        String lastWord = words[words.length - 1];

                return lastWord;
        }

       return "String is empty or blank";
    }

    // 13.1. Algorithms to extract substring between given indexes

    public static String extractSubstring (String str, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex > str.length()) {
            return "Index Out Of Bounds";   // throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > str.length() || endIndex < 0 || startIndex > endIndex) {
            return "Index Out Of Bounds";   // throw new StringIndexOutOfBoundsException(endIndex);
        }

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            return str.substring(startIndex, endIndex);
        }

        return "String is empty or blank";
    }

    // 13.2. Algorithms to remove substring between given indexes
    public static String removeSubstring(String str, int startIndex, int endIndex) {

        if (isEmptyStr(str) && str.trim().isBlank()) {
            return "String is empty or blank";
        }
        if (startIndex < 0 || startIndex > str.length()) {
            return "Index Out Of Bounds";   // throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex >= str.length() || endIndex < 0 || startIndex > endIndex) {
            return "Index Out Of Bounds";   // throw new StringIndexOutOfBoundsException(endIndex);
        }

        String a = str.trim().substring(0, startIndex);
        String b = str.trim().substring(endIndex + 1);

        return a.concat(b);
    }

    // 14. Algo to split string into array
    public static String [] splitIntoWordsArray (String str) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            // remove punctuation and leading and trailing whitespaces
            str = str.replaceAll("\\p{Punct}","").trim();

            // String to array
            String [] wordsArray = str.split(" ");

            return wordsArray;
        }
        return new String[]{"String is empty or blank"};
    }

    // 15. Algorithm to represent name
    public static String printName (String str) {

        if (!str.trim().isEmpty() && !str.trim().isBlank()) {

            // remove punctuation and leading and trailing whitespaces
            str = str.replaceAll("\\p{Punct}","").trim();

            String [] nameArray = str.split(" ");

            // New array of keywords;
            String [] firstMiddleLastArr = {"First name: ", "Middle name: ", "Last name: "};
            // result string for name
            String personalData = "";

            for (int i = 0; i < firstMiddleLastArr.length; i++) {
                if (nameArray.length > i) {
                    personalData += firstMiddleLastArr[i] + nameArray[i] + "\n";
                } else {
                personalData += firstMiddleLastArr[i] + "" + "\n";
                }
            }
            if (personalData.endsWith("\n")) {

                return personalData.substring(0, personalData.length() - 1);
            }
        }

        return "String is empty or blank";
    }

    // 16. Method to repeat a given string N times
    public static String repeatWord (String str, int n) {

        if (!isEmptyStr(str) && !str.trim().isBlank()) {

            if (n >= 0) {
                return str.trim().repeat(n);
            } else if (n < 0) {
                return "Invalid number";
            }

            return str;
        }

        return "String is empty or blank";
    }

    // 17. Algorithm to get numeric value of given char index
    public static int intChar (String str, int n) {

        if (n < 0 || n >= str.length()) {
            return -1;  // throw new StringIndexOutOfBoundsException(beginIndex);
        }

        if (!isEmptyStr(str) && !str.trim().isBlank() ) {

            return str.charAt(n);
        }

        return -1;
    }

    // 18 Method to compare three strings, ignoring case
    public static boolean equalWords (String str1, String str2, String str3) {

        if (!isEmptyStr(str1) || !isEmptyStr(str2) || !isEmptyStr(str3)) {
            str1 = str1.trim();
            str2 = str2.trim();
            str3 = str3.trim();

            return str1.equalsIgnoreCase(str2) && str1.equalsIgnoreCase(str3);
        }

        return false;
    }
}
