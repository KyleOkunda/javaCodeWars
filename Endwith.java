package codeWars;
/*
 Complete the solution so that it returns true 
 if the first argument(string) passed in ends 
 with the 2nd argument (also a string).

 solution('abc', 'bc') --> returns true
solution('abc', 'd') --> returns false
 */
public class Endwith {
    public static boolean solution(String str1, String str2){

        if(str1.length() < str2.length()){
            System.out.println("False");
            return false;
           
        } else{
            int diff;
            String newStr = "";
            for ( diff = str1.length() - str2.length(); diff <= (str1.length() - 1); diff++){
                char posChar = str1.charAt(diff);
                newStr += Character.toString(posChar);
            }
            if(str2.equals(newStr)){
                System.out.println("True");
                return true;
            } else{
                System.out.println("False");
                return false;
            }
        }

    }
    public static void main(String[] args) {
        solution("ninja", "ja");
    }
}
