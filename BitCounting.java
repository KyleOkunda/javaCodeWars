package codeWars;
class BitCounting {

    /*
        Write a function that takes an integer as input,
         and returns the number of bits that are equal 
         to one in the binary representation of that number.
         You can guarantee that input is non-negative.

        Example: The binary representation of 1234 is 10011010010,
         so the function should return 5 in this case
     */

    public static int countBits(int n){
		// Show me the code!
    int remainder, counter = 0, newNum = n;
    while(newNum > 0){

        remainder = newNum % 2;
        newNum = newNum / 2;
        System.out.println(remainder);
        if(remainder == 1){
            counter++;
        }
        
        

    }
    System.out.println("The ones are: " + counter);
    return counter;
	}

    public static void main(String[] args) {
        countBits(1234);
    }
    
}
