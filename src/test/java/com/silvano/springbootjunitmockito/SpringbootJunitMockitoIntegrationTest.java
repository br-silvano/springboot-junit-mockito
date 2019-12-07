package com.silvano.springbootjunitmockito;

import static com.silvano.springbootjunitmockito.service.TextService.ORIGINAL_OUTPUT;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.silvano.springbootjunitmockito.service.ShowService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DisplayName("Teste de Integração")
class SpringbootJunitMockitoIntegrationTest {
	@Autowired
	private ShowService showService;
	
	@Test
	@DisplayName("Teste de integração que obterá a saída real do serviço de texto")
	void contextLoads() {
		assertEquals(showService.getShowLable(), ORIGINAL_OUTPUT);
	}
}
