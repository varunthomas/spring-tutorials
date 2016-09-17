package com.tutorialspoint;

public class TextEditor {

	private SpellChecker spellChecker;
	private KeyBoard keyBoard;
	public void setspellChecker(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}
	public void getspellChecker(){
		spellChecker.checkSpelling();
	}
	public void setKeyBoard(KeyBoard keyBoard){
		this.keyBoard = keyBoard;
	}
	public void getKeyBoard(){
		keyBoard.checkKey();
	}
}
