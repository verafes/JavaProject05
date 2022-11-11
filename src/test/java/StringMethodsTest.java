import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
     //Custom algorithms and methods to work with String

    // --- 1-Algorithms to remove leading and trailing spaces
    // 1. Positive testing Happy path
    // String With Leading And Trailing Spaces
    @Test
    public void testStringWithLeadingAndTrailingSpases_HappyPath() {
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // String Without Leading And Trailing Spaces
    @Test
    public void testStringWithoutLeadingAndTrailingSpaces_HappyPath() {
        String str = "Red Rover School";
        String expectedResult = "No extra whitespaces";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing
    // Empty String
    @Test
    public void testEmptyString_Negative() {
        String str = "";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeSpaces(str);
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Blank String
    @Test
    public void testOneWhiteSpaceString_Negative() {
        String str = " ";
        String expectedResult = "";

        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 2-Testing algorithm removeAllAs ---
    // 1. Positive testing
    // “    Red Rover School   “ →  “Red Rover School“
    @Test
    public void testStringWithLeadingAndTrailingAndNoAs_HappyPath() {
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // “panda   “ → “pnd”
    @Test
    public void testStringWithLeadingAndTrailingAndSomeAs_HappyPath() {
        String str = "panda   ";
        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // “taramasalata” → “trmslt”
    @Test
    public void testNoSpacesAndSomeAs_HappyPat() {
        String str = "taramasAlata";
        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // string contains a or A only
    @Test
    public void testNoSpacesAndSomeAs2_HappyPat() {
        String str = "AAaA";
        String expectedResult = "";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing
    // Blank String
    @Test
    public void testOneWhiteSpacesString2_Negative() {
        String str = "  ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Empty String
    @Test
    public void testEmptyString2_Negative() {
        String str = "";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 3 - Testing removeAllZeros ---
    // 1. Positive testing
    // mixed digits string with zeros
    @Test
    public void testStringWithLeadingOrTrailingSpacesAndNums_HappyPath() {
        String str = "3504209706040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // “0000000111“ → “111”
    @Test
    public void testStringWithSpacesNumsAndZeros_HappyPath() {
        String str = "0000000111";
        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // some zeros and spaces (in between) along with other digits
    @Test
    public void testStringWithSpacesNumsAndZeros2_HappyPath() {
        String str = "35042097 06040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // No 0 in String
    @Test
    public void testNoZeros_Positive() {
        String str = "-123";
        String expectedResult = "This is not a valid string";

        String actualResult = new StringMethods().removeAllZeros(str);

       Assert.assertEquals(actualResult, expectedResult);
    }

    // Two zeros String
    @Test
    public void testZerosOnly_Positive() {
        String str = "00";
        String expectedResult = "";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing // Blank String
    @Test
    public void testSomeSpaces_Postive() {
        String str = "  ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Empty String
    @Test
    public void testEmptyString3_Negative() {
        String str = "";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 4 -- Testing Algorithms to remove All the spaces from a given string ---
    // 1. Positive testing --- valid string
    @Test
    public void testRemoveSpacesValidStr_HappyPath() {
        String str = "  R e d   Ro ve  r Sc  h ool  ";
        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing --- blank string
    @Test
    public void testBlankString_HappyPath() {
        String str = "  ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 5 -Testing Testing Algorithms to count occurrences of a/A chars and other symbols  ---
    // 1. Positive testing
    // count occurrences of a/A chars and other symbols
    @Test
    public void testOneWordWithAandMix_HappyPath() {
        String str = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // count occurrences of a/A chars and other symbols
    @Test
    public void testStringMixAndSpacesNoA_HappyPath() {
        String str = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // count occurrences of a/A chars and other symbols
    @Test
    public void testStringLettersAndDigits_HappyPath() {
        String str = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing. --- blank string
    @Test
    public void testStringSpacesNoA_HappyPath() {
        String str = "   ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 6-Testing Algorithms to count words Java in given String ---
    // 1. Positive testing - contains Java
    @Test
    public void testContainsJava_HappyPath() {
        String str = "\"As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released " +
                "the last zero-cost public update for the legacy version Java 8 LTS in January 2019 " +
                "for commercial use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds " +
                "of OpenJDK 8 and 11 that are still receiving security and other upgrades.\"" ;
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNotContainsJava_HappyPath() {
        String str = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code." ;
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing --- empty string
    @Test
    public void testNoJavaEmptyStr_HappyPath() {
        String str = "";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 7-Testing  to add quotes to string ---
    // 1. Positive testing
    @Test
    public void testAddingQuotesValidStr_HappyPath() {
        String str = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().addQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing --- blank string
    @Test
    public void testAddingQuotesSpaces_HappyPath() {
        String str = "  ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().addQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // empty string
    @Test
    public void testQuatesEmptyStr_HappyPath() {
        String str = "";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().addQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 8-Testing Algorithm to insert quotes into reported speech
    // 1. Positive testing
    @Test
    public void testPushkin_HappyPath() {
        String str1 = "Fiodor Dostoevsky wrote";
        String str2 = "Love life more than the meaning of it.";
        String expectedResult = "Fiodor Dostoevsky wrote: \"Love life more than the meaning of it.\"";

        String actualResult = new StringMethods().insertQuotesIntoReportedSpeech(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAddigAndChangeQuotes_HappyPath() {
        String str1 = "Napoleon Bonaparte wrote";
        String str2 = "The word U+00ABimpossibleU+00AB is not in my dictionary.";
        String expectedResult = "Napoleon Bonaparte wrote: \"The word \"impossible\" is not in my dictionary.\"";

        String actualResult = new StringMethods().insertQuotesIntoReportedSpeech(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing --- No word wrote
    @Test
    public void testNoWordWrote_Negative() {

        String str1 = "Napoleon Bonaparte";
        String str2 = "The word U+00ABimpossibleU+00AB is not in my dictionary.";
        String expectedResult = "No correct string to join";

        String actualResult = new StringMethods().insertQuotesIntoReportedSpeech(str1, str2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 9.2 - Algorithm to Capitalize the First Character
    // One word city
    @Test
    public void testAllLettersAreLowerCase_HappyPath() {
        String str = "chicago";
        String expectedResult = "Chicago";

        String actualResult = new StringMethods().toTitleCase(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // upper and lower case letters
    @Test
    public void testSomeLettersAreUpperCase_HappyPath() {
        String str = "sAn fraNsisCO";
        String expectedResult = "San Fransisco";

        String actualResult = new StringMethods().toTitleCase(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Two words city
    @Test
    public void testTwoWordName_HappyPath() {
        String str = "sAn fraNsisCO";
        String expectedResult = "San Fransisco";

        String actualResult = new StringMethods().toTitleCase(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 10 - Testing algorithm getSubstringFromCharTillChar
    // 1. Positive testing - Happy path
    @Test
    public void testTwoWordStringTwoChars_HappyPath() {
        String str = " Abracadabra  ";
        char ch = 'b';
        String expectedResult = "bracadab";

        String actualResult = new StringMethods().getSubstringFromCharTillChar(str, ch);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoWordStringOneChar_HappyPath() {
        String str = " Whippersnapper";
        char ch = 'p';
        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().getSubstringFromCharTillChar(str, ch);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // there is only char in string
    @Test
    public void testOneChar_HappyPath() {
        String str = " Whippersnapper";
        char ch = 'i';
        String expectedResult = "i";

        String actualResult = new StringMethods().getSubstringFromCharTillChar(str, ch);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing --- blank string
    @Test
    public void testBlankChar_HappyPath() {
        String str = "Abracadabra";
        char ch = ' ';
        String expectedResult = "Error: empty character constant";

        String actualResult = new StringMethods().getSubstringFromCharTillChar(str, ch);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // null char
    @Test
    public void testNullChar_Negative() {
        String str = "Abracadabra";
        char ch = '\0';
        String expectedResult = "Error: empty character constant";

        String actualResult = new StringMethods().getSubstringFromCharTillChar(str, ch);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 11 - Testing algorithm verify if First And Last Char are Equal
    // 1. Positive testing - Happy path
    // First And Last Char are Equal
    @Test
    public void testFirstLastAreEqual_HappyPath() {
        String str = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().areFirstAndLastCharEqual(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // First and last chars are not equal
    @Test
    public void testFirstLastAreNotEqual_HappyPath() {
        String str = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().areFirstAndLastCharEqual(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 12 - Testing algorithm to get last word of sentence
    // 1. Positive testing - Happy path
    @Test
    public void testMultipleWordsStr_HappyPath() {
        String str = " Red Rover ";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().lastWord(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOneWordsStr_HappyPath() {
        String str = " Red ";
        String expectedResult = "Red";

        String actualResult = new StringMethods().lastWord(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // -- 13.2 - Remove Substring between given indexes
    // 1. Positive Testing - Happy Path
    // startIndex > 0 && endIndex > 0
    @Test
    public void testValidInputsStartEndIndeces_HappyPath() {
        String str = "Red rover";
        int startIndex = 1;
        int endIndex = 4;
        String expectedResult = "Rover";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // startIndex > 0 && endIndex > 0 && startIndex == endIndex
    @Test
    public void testStartIndexEqualsEndIndex_HappyPath() {
        String str = "Red rover";
        int startIndex = 1;
        int endIndex = 1;
        String expectedResult = "Rd rover";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative // startIndex < 0 && endIndex > 0
    @Test
    public void testStartIndexIsNegative_Negative() {
        String str = "Red rover";
        int startIndex = -1;
        int endIndex = 4;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // startIndex > str.length
    @Test
    public void testStartIndexGreaterStrLengthq_Positive() {
        String str = "Red rover";
        int startIndex = 10;
        int endIndex = 4;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // endIndex > str.length()
    @Test
    public void testStartIndexIsNegative2_Negative() {
        String str = "Red rover";
        int startIndex = 1;
        int endIndex = 9;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // endIndex < 0
    @Test
    public void testStartIndexIsNegative3_Negative() {
        String str = "Red rover";
        int startIndex = 1;
        int endIndex = -1;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // startIndex > endIndex
    @Test
    public void testStartIndexGreaterStrLength_Positive() {
        String str = "Red rover";
        int startIndex = 5;
        int endIndex = 4;

        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Empty String, startIndex > 0, endIndex > 0
    @Test
    public void testEmptyStringIndexesNotZeros_Negative() {
        String str = "";
        int startIndex = 1;
        int endIndex = 3;
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Empty String, , startIndex = 0, endIndex = 0
    @Test
    public void testEmptyStringIndexesAreZeros_Negative() {
        String str = "";
        int startIndex = 0;
        int endIndex = 0;
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Blank String, startIndex > 0, endIndex > 0
    @Test
    public void testBlankStringIndecesAreNotZeros_Negative() {
        String str = " ";
        int startIndex = 1;
        int endIndex = 4;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Blank String, startIndex = 0, endIndex = 1
    @Test
    public void testBlankStringIndecesAreZeros_Negative() {
        String str = " ";
        int startIndex = 0;
        int endIndex = 1;
        String expectedResult = "Index Out Of Bounds";

        String actualResult = new StringMethods().removeSubstring(str, startIndex, endIndex);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // -- 14 splitIntoWordsArray
    // 1. Positive Testing - Happy Path
    // 3 words string
    @Test
    public void testValidInputs3Words_HappyPath() {
        String str = "Alexander Sergeyevich Pushkin";
        String[] expectedResult = {"Alexander", "Sergeyevich", "Pushkin"};

        String[] actualResult = new StringMethods().splitIntoWordsArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testValidInputsTwoWords_HappyPath() {
        String str = "QA Everyone";
        String[] expectedResult = {"QA", "Everyone"};

        String[] actualResult = new StringMethods().splitIntoWordsArray(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 15 - Algorithm to check
    // 1. Positive testing --- 3 words string
    @Test
    public void testValidInputs2WordsStr_HappyPath() {
        String str = "Alexander Sergeyevich Pushkin";
        String expectedResult = "First name: Alexander\nMiddle name: Sergeyevich\nLast name: Pushkin";

        String actualResult = new StringMethods().printName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // No Middle Word
    @Test
    public void testNoMiddleWordStr_HappyPath() {
        String str = "Alexander - Pushkin";
        String expectedResult = "First name: Alexander\nMiddle name: \nLast name: Pushkin";

        String actualResult = new StringMethods().printName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // One Word Str
    @Test
    public void testOneWordStr_HappyPath() {
        String str = "Alexander";
        String expectedResult = "First name: Alexander\nMiddle name: \nLast name: ";

        String actualResult = new StringMethods().printName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing --- blank string
    @Test
    public void testBlankStr_HappyPath() {
        String str = " ";
        String expectedResult = "String is empty or blank";

        String actualResult = new StringMethods().printName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 16 - Algorithm to check Method to repeat a given string N times
    // 1. Positive testing --- n >= 0
    @Test
    public void testValidStrToRepeat_HappyPath() {
        String str = "one";
        int n = 5;
        String expectedResult = "oneoneoneoneone";

        String actualResult = new StringMethods().repeatWord(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }
    // 2. Negative testing - n = 0
    @Test
    public void testZeroNum_Negative() {
        String str = "one";
        int n = 0;
        String expectedResult = "";

        String actualResult = new StringMethods().repeatWord(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing - n < 0
    @Test
    public void testNegativeNum_Negative() {
        String str = "one";
        int n = -1;
        String expectedResult = "Invalid number";

        String actualResult = new StringMethods().repeatWord(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 17 - Algorithm to get numeric value of given char index
    // 1. Positive testing ---
    @Test
    public void testValidStrToRe_HappyPath() {
        String str = "Alexander";
        int n = 5;
        int expectedResult = 110;

        int actualResult = new StringMethods().intChar(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing - n < 0
    @Test
    public void testNegativeNumberValidChar_Negative() {
        String str = "one";
        int n = -1;
        int expectedResult = -1;

        int actualResult = new StringMethods().intChar(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing - 0 < n < str.length()
    @Test
    public void testPositiveNumberValidChar_Negative() {
        String str = "anaconda";
        int n = -1;
        int expectedResult = -1;

        int actualResult = new StringMethods().intChar(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing - n > 0 and n > str.length()
    @Test
    public void testNumberGreaterStrLength_Negative() {
        String str = "anaconda";
        int n = 8;
        int expectedResult = -1;

        int actualResult = new StringMethods().intChar(str, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // --- 18 - Algorithm to compare three strings, ignoring case
    // 1. Positive testing ---
    @Test
    public void test3ValidStrings_HappyPath() {
        String str1 = "one";
        String str2 = "One";
        String str3 = "ONE";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().equalWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Negative testing ---
    @Test
    public void test1InvalidStrings_Negative() {
        String str1 = "one";
        String str2 = "1";
        String str3 = "ONE";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().equalWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }
    // one empty string
    @Test
    public void testOneEmptyStrings_Negative() {
        String str1 = " ";
        String str2 = "one";
        String str3 = "ONE";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().equalWords(str1, str2, str3);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
