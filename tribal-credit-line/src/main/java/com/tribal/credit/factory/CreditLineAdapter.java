package com.tribal.credit.factory;

import com.tribal.credit.model.CreditLineRequest;

/**
 * Defines the shared methods between the different business type.
 * @author cm_ol
 *
 */
public abstract class CreditLineAdapter {

	/**
	 * Calculates the line of credit according to the rules defined by the business
	 * 
	 * @param creditLine
	 * @return
	 */
	public abstract double calculateCreditLine(CreditLineRequest creditLine);

	/**
	 * The same rule apply for different business type. Calculate Monthly revenue.
	 * One fifth of the monthly revenue (5:1 ratio)
	 * @param montlyRevenue
	 * @return
	 */
	protected double calculateMonthlyRevenue(double montlyRevenue) {
		return montlyRevenue / 5;
	}

}
