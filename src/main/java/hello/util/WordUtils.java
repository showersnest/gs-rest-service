package hello.util;

public class WordUtils {

	private static final int SIZE = 256;
	public static boolean isPalindrome(String word){
		
		int startIndex = 0, endIndex = word.length()-1;
		
		while(startIndex < endIndex){
			if(word.charAt(startIndex) == word.charAt(endIndex)){
				startIndex++;
				endIndex--;
			}else{
				return false;
			}
		}
		return true;
	}
	
	public static boolean inAnagramPalindrome(String word){
		
		int[] charCountArray = new int[SIZE];
		for(int i = 0; i < word.length(); i++){
			charCountArray[word.charAt(i)]++;
		}
		
		int oddCounts = 0;
		
		for(int i = 0; i < SIZE; i++){
			if(charCountArray[i]%2 != 0){
				oddCounts++;
			}
			if(oddCounts > 1){
				return false;
			}
		}
		return true;
	}
}
