package com.silvano.springbootjunitmockito.service;

import org.springframework.stereotype.Service;

@Service
public class ShowService {
	private final TextService textService;
	
	public ShowService(TextService textService) {
		this.textService = textService;
	}
	
	public String getShowLable() {
		return textService.getText();
	}
}
