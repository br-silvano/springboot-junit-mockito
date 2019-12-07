package com.silvano.springbootjunitmockito.service;

import org.springframework.stereotype.Service;

@Service
public class TextService {
	public static final String ORIGINAL_OUTPUT = "Texto original do serviço";
	
	public String getText() {
		return ORIGINAL_OUTPUT;
	}
}
