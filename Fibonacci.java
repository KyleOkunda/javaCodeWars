package codeWars;
import java.util.*;
public class Fibonacci {
    
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        
        myArr.add(1);
        myArr.add(1);
        myArr.add(1);


        int startingPoint, sum = 0;
        
       while(sum < 100){
        startingPoint = myArr.size() - 2;
        sum = myArr.get(startingPoint) + myArr.get(startingPoint + 1);
        myArr.add(sum);
        
        
       }
       for(int e: myArr){
        System.out.println(e);
       }
        
    }

}
