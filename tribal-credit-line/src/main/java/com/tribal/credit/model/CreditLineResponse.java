package com.tribal.credit.model;

import com.tribal.credit.enums.CreditLineResult;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Credit Line Response
 * 
 * @author cm_ol
 *
 */
@Schema(description = "Response Model ")
public class CreditLineResponse {

	private CreditLineResult result;
	private double requestedCreditLine;

	/**
	 * 
	 * @return result
	 */
	public CreditLineResult getResult() {
		return result;
	}

	/**
	 * 
	 * @param result
	 */
	public void setResult(CreditLineResult result) {
		this.result = result;
	}

	/**
	 * 
	 * @return requestedCreditLine
	 */
	public double getRequestedCreditLine() {
		return requestedCreditLine;
	}

	/**
	 * 
	 * @param requestedCreditLine
	 */
	public void setRequestedCreditLine(double requestedCreditLine) {
		this.requestedCreditLine = requestedCreditLine;
	}
}
