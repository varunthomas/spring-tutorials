package com.tutorialspoint;

public class TextEditor {

	public SpellChecker spellChecker;
	public TextEditor(){
		System.out.println("Inside TextEditor constructor");
	}
	public void setSpellChecker(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	public void textEditor(){
		spellChecker.checkSpelling();
	}
}
