package algorithms.strings;

public class GameofThronesOne {

	public static void main(String[] args) {
		
		
		String str = "aaabbbb";
		
		char[] palindromeArray = str.toCharArray();
		boolean polindrom = false;
		for(int i=0; i<palindromeArray.length-1; i++){
			
			for(int j=i+1; j<palindromeArray.length; j++){
				
				if(String.valueOf(palindromeArray[i]).equals(String.valueOf(palindromeArray[j]))){
					polindrom = true;
				}
				
			}
			
		}
		
		if(polindrom){
			System.out.println("YES");
			
		}else {
			System.out.println("NO");
		}
		

	}

}
