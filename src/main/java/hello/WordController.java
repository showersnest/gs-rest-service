package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.bean.WordResponse;
import hello.service.InvalidWordException;
import hello.service.WordService;

@RestController
public class WordController {
	
	@Autowired
	WordService wordService;
	
	@RequestMapping("/words/{word}")
	public WordResponse checkPalindrome(@PathVariable(name="word")String word) throws InvalidWordException{
		
		return wordService.checkAnagramPalindrome(word);
	}
}
