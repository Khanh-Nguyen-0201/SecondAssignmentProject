 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer sum = 1;
          for(int i = 1; i <= number; i++){
            sum *=i;
          }
          return sum;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          if(phrase == null)
          return phrase;
          char[] charArray = phrase.toCharArray();
          result += Character.toUpperCase(charArray[0]);
          for(int i = 0; i <= phrase.length()-1;i++){
              if(charArray[i] == ' ')
              result += Character.toUpperCase(charArray[i+1]);
          }
          return result;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          /*
           * only handle lower case characters
           */
          String lower = word.toLowerCase();
          char[] result = lower.toCharArray();
          for(int i = 0; i < word.length(); i++){
              if(Character.isLetter(result[i])){
                  result[i] = (char)(result[i] + 3);
                  if(result[i] > 'z' || result[i] > 'y' || result[i] > 'x')
                  result[i] = (char)(result[i] + 26);
                  else if(result[i] < 'a' || result[i] < 'b' || result[i] < 'c')
                  result[i] = (char)(result[i] - 26);
              }
          }
          String returnString = new String(result);
          return returnString;
              
      }
}
