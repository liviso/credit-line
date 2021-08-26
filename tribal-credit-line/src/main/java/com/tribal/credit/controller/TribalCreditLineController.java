package com.tribal.credit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tribal.credit.model.CreditLineRequest;
import com.tribal.credit.service.CreditLineService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Microservice to speed up the process of determining the credit line that
 * better suits our customers.
 * 
 * @author cm_ol
 *
 */
@RestController
@RequestMapping("/tribal")
@Tag(name = "Tribal Credit Line")
@Validated
public class TribalCreditLineController {

	@Autowired
	CreditLineService creditLineService;

	private static final Logger logger = LoggerFactory.getLogger(TribalCreditLineController.class);

	/**
	 * Validate credit line of the customer.
	 * 
	 * @param creditLineRequest
	 * @return ResponseEntity
	 */
	@PostMapping("/validate")
	@Operation(summary = "Request new credit")
	@ApiResponse(responseCode = "200", description = "Sucess")
	public ResponseEntity<Object> validateCreditLine(@RequestBody CreditLineRequest creditLineRequest) {
		logger.debug("Request:", creditLineRequest);
		return ResponseEntity.ok(creditLineService.buildCreditLineResponse(creditLineRequest));
	}
}
