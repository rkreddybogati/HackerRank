package algorithms.strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AlternatingCharacters {
	public static void main(String[] args) {
		String str = "AAAA";
		char[] charArray = str.toCharArray(); 
		int count = 0;
		for(int i=1; i<charArray.length; i++){
			if(charArray[i] == charArray[i-1])
				count++;
			
		}
		System.out.println(count);

	}

}
