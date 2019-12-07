package com.silvano.springbootjunitmockito.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Teste de Unidade")
class ShowServiceTests {
	private static final String MOCK_OUTPUT = "Texto simulado usando mockito";

	@Mock
	private TextService textService;

	@InjectMocks
	private ShowService showService;

	@BeforeEach
	void setMockOutput() {
		when(textService.getText()).thenReturn(MOCK_OUTPUT);
	}

	@Test
	@DisplayName("Teste de unidade que simula a saída do serviço de texto usando mockito")
	public void contextLoads() {
		assertEquals(showService.getShowLable(), MOCK_OUTPUT);
	}
}
