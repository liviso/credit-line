package com.tribal.credit.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.tribal.credit.enums.BusinessType;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Credit Line model
 * 
 * @author cm_ol
 *
 */
@Schema(description = "Model for determine the credit line that better suits your customers.")
public class CreditLineRequest {

	@NotBlank
	@Schema(description = "Kind of business type [STARTUP, SME]")
	private BusinessType businessType;

	@NotBlank
	@Schema(description = "The customer's bank account balance")
	private double cashBalance;

	@NotBlank
	@Schema(description = "The total sales revenue for the month")
	private double montlyRevenue;

	@NotBlank
	@Schema(description = "The amount of the credit line requested")
	private double requestedCreditLine;

	@NotBlank
	@Schema(description = "The day and time the request was made")
	private Date requestedDate;

	/**
	 * 
	 * @return businessType
	 */
	public BusinessType getBusinessType() {
		return businessType;
	}

	/**
	 * 
	 * @param businessType
	 */
	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	/**
	 * 
	 * @return cashBalance
	 */
	public double getCashBalance() {
		return cashBalance;
	}

	/**
	 * 
	 * @param cashBalance
	 */
	public void setCashBalance(double cashBalance) {
		this.cashBalance = cashBalance;
	}

	/**
	 * 
	 * @return montlyRevenue
	 */
	public double getMontlyRevenue() {
		return montlyRevenue;
	}

	/**
	 * 
	 * @param montlyRevenue
	 */
	public void setMontlyRevenue(double montlyRevenue) {
		this.montlyRevenue = montlyRevenue;
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

	/**
	 * 
	 * @return requestedDate
	 */
	public Date getRequestedDate() {
		return requestedDate;
	}

	/**
	 * 
	 * @param requestedDate
	 */
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	@Override
	public String toString() {
		return "CreditLine [businessType=" + businessType + ", cashBalance=" + cashBalance + ", montlyRevenue="
				+ montlyRevenue + ", requestedCreditLine=" + requestedCreditLine + ", requestedDate=" + requestedDate
				+ "]";
	}

}
