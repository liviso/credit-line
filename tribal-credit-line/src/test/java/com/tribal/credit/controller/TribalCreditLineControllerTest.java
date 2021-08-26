package com.tribal.credit.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tribal.credit.enums.BusinessType;
import com.tribal.credit.model.CreditLineRequest;

/**
 * TribalCreditLineController Test
 * @author cm_ol
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TribalCreditLineControllerTest {
	
	@InjectMocks
	private TribalCreditLineController creditLineController;
	
	/**
	 * Validates credit line response
	 */
	@Test
	public void validateCreditLineResponse() {
		CreditLineRequest request = new CreditLineRequest();
		request.setBusinessType(BusinessType.STARTUP);
		request.setCashBalance(435.30);
		request.setMontlyRevenue(4235.45);
		request.setRequestedCreditLine(100);
		request.setRequestedDate(new Date());
		ResponseEntity<Object> response = creditLineController.validateCreditLine(request);
		
		assertThat(response).isNotNull();
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
