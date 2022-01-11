package com.example.tata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StringSize {
	
	private Integer minWord;
	private Integer maxWord;
	public Integer getMinWord() {
		return minWord;
	}
	public void setMinWord(Integer minWord) {
		this.minWord = minWord;
	}
	public Integer getMaxWord() {
		return maxWord;
	}
	public void setMaxWord(Integer maxWord) {
		this.maxWord = maxWord;
	}
	
	
	
	

}
