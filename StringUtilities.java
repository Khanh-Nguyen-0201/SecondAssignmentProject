
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        if(valueToBeReversed == null)
        return valueToBeReversed;
        String output = "";
        for(int i = valueToBeReversed.length()-1; i >=0; i--){
            output += valueToBeReversed.charAt(i);
        }
        return output;
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length = word.length();
        if(length % 2 == 0)
        return word.charAt(length/2 -1);
        else
        return word.charAt(length/2);
        
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String result = value;
        for(int i = 0; i < value.length();i++){
            if(value.charAt(i) == charToRemove)
                result = result.substring(0,i) + result.substring(i+1);
        }
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int l = sentence.length()-1;
        String result = "";
        while(Character.isWhitespace(sentence.charAt(l)) != true && l >= 0){
            result = result + sentence.charAt(l);
            l--;
        }
        String returnString = reverse(result);
        return returnString;
    }
}
