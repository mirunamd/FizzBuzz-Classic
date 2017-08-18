import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
                
            if(three && five)
                 System.out.println("FizzBuzz");
            else if(three)
                 System.out.println("Fizz");
            else if(five)
                 System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
