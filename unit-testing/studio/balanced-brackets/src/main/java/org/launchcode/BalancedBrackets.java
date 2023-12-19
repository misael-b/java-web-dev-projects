package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str, String balancingCharacter) {
        char openingChar = balancingCharacter.charAt(0);
        char closingChar = balancingCharacter.charAt(1);

        int bracketsOpening = 0;
        int bracketsClosing = 0;

        int bracketsOpeningIndex = 0;
        int bracketsClosingIndex = 0;
        int i = 0;
        for (char ch : str.toCharArray()) {
            if (ch == openingChar) {
                bracketsOpening++;
                bracketsOpeningIndex =+ i;
            } else if (ch == closingChar) {
                bracketsClosing++;
                bracketsClosingIndex =+ i;
            }
            i++;
        }

        if (bracketsClosing == bracketsOpening){
            if (bracketsOpening == 0){
                return true;
            }

            if (str.indexOf(openingChar) < str.indexOf(closingChar)){ //checks that strings starts with opening bracket
                if (bracketsOpeningIndex <= bracketsClosingIndex){
                    return true;
                }

            }

        } else{
            return false;
    }
        return false;
    }
}
