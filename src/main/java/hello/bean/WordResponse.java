package hello.bean;

public class WordResponse {

	private String word;
	
	private boolean palindrome;
	
	private boolean anagramOfPalindrome;

	public WordResponse(String word, boolean palindrome, boolean anagramOfPalindrome) {
		super();
		this.word = word;
		this.palindrome = palindrome;
		this.anagramOfPalindrome = anagramOfPalindrome;
	}

	public String getWord() {
		return word;
	}

	public boolean isPalindrome() {
		return palindrome;
	}

	public boolean isAnagramOfPalindrome() {
		return anagramOfPalindrome;
	}
}
