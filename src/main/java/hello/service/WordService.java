package hello.service;

import hello.bean.WordResponse;

public interface WordService {

	WordResponse checkAnagramPalindrome(String word) throws InvalidWordException;

}
