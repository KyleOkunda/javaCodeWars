package codeWars;

/*
   Write a function, persistence, that takes in a
   positive parameter num and returns its 
   multiplicative persistence, which is the number 
   of times you must multiply the digits in num until
    you reach a single digit.

    39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
 */

public class Persist {
    static int counter = 0;

    public static int persistence(int num){

        String strNum = Integer.toString(num);
        int result = 1;
        
        if(strNum.length() == 1){
            System.out.println(counter);
            return 0;
        } else{
            for(int i = 0; i < strNum.length(); i++){
                String myChar = Character.toString(strNum.charAt(i));
                result *= Integer.parseInt(myChar);
            }
            counter++;
            String strResult = Integer.toString(result);
            if(strResult.length() > 1){
                
                return persistence(result);

            } else {
                System.out.println(counter);
                return counter;
            }
        }
       

    }
    public static void main(String[] args) {
        persistence(13);
    }
}
