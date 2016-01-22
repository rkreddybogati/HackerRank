package algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {
	
	public static void main(String[] args) {
    
		/*String str = "acxz";
		String[] lowerAlpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v", "w","x","y","z"};
		
		List<String> list = Arrays.asList(lowerAlpha);

		String[] strArray = str.split("");
		int forwardDiff = 0;
		int revDiff = 0;
		boolean funny = false;
		for(int i=0; i<strArray.length-1; i++){
			forwardDiff =  Math.abs(list.indexOf(strArray[i])-list.indexOf(strArray[i+1]));
			revDiff =  Math.abs(list.indexOf(strArray[strArray.length-i-1])-list.indexOf(strArray[strArray.length-i-2]));
			if(!(forwardDiff==revDiff)){
				break;
			}
			if(i == strArray.length-2){
				funny = true;				
			}
		}
		
		if(funny){
			System.out.println("Funny");
		} else {
			System.out.println("Not Funny");
		}*/
		
		String str = "acxz"; 
        System.out.println("str:"+str);
        String[] lowerAlpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v", "w","x","y","z"};
	
        List<String> list = Arrays.asList(lowerAlpha);

        String[] strArray = str.split("");
        int forwardDiff = 0;
        int revDiff = 0;
        boolean funny = false;
        for(int i=0; i<strArray.length-1; i++){
            forwardDiff =  Math.abs(list.indexOf(strArray[i])-list.indexOf(strArray[i+1]));
            revDiff =  Math.abs(list.indexOf(strArray[strArray.length-i-1])-list.indexOf(strArray[strArray.length-i-2]));
            if(!(forwardDiff==revDiff)){
                break;
            }
            if(i == strArray.length-2){
                funny = true;				
            }
        }

        if(funny){
            System.out.println("Funny");
        } else {
            System.out.println("Not Funny");
        }
		
    }

}
