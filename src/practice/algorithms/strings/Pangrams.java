package algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Pangrams {
	
public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        String pangramStr = "We promptly judged antique ivory buckles for the next prize  ";
        String[] lowerAlpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v", "w","x","y","z"};
        String[] upperAlpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V", "W","X","Y","Z"}; 
        String space = " ";
        boolean pangram = false; 
        int pangramCount = 0;
        for(String lower : lowerAlpha){
            pangram = pangramStr.contains(lower);
            if(!pangram){
                    String upper = upperAlpha[pangramCount]; 
                    pangram = pangramStr.contains(upper);
            }
            if(pangram){
                pangramCount++; 
            }            
            pangram = false;
        }
        
        System.out.println("pangramCount : "+pangramCount);
        
        if(pangramCount==26){
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

}
