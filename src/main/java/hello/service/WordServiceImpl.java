package hello.service;

import org.springframework.stereotype.Service;

import hello.bean.WordResponse;
import hello.util.WordUtils;

@Service
public class WordServiceImpl implements WordService {

	@Override
	public WordResponse checkAnagramPalindrome(String word) throws InvalidWordException {
		
		if(word == null || word.isEmpty()){
			throw new InvalidWordException("Entered Word "+ word +" is not valid");
		}
		
		boolean palindrome = WordUtils.isPalindrome(word);
		boolean anagramPalindrome = WordUtils.inAnagramPalindrome(word);
		
		WordResponse wordResponse = new WordResponse(word, palindrome, anagramPalindrome);
		
		return wordResponse;
		
	}

}
