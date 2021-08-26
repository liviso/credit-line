package com.tribal.credit.factory;

import com.tribal.credit.model.CreditLineRequest;

/**
 * SME Credit Line Adapter
 * 
 * @author cm_ol
 *
 */
public class SMECreditLineAdapter extends CreditLineAdapter {

	/**
	 * Calculates the line of credit according to the rules defined by the business
	 * 
	 * @param creditLine
	 * @return double
	 */
	@Override
	public double calculateCreditLine(CreditLineRequest creditLine) {
		return calculateMonthlyRevenue(creditLine.getMontlyRevenue());
	}
}
