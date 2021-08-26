package com.tribal.credit.factory;

import com.tribal.credit.model.CreditLineRequest;

/**
 * Startup Credit Line Adapter
 * 
 * @author cm_ol
 *
 */
public class StartupCreditLineAdapter extends CreditLineAdapter {

	/**
	 * Calculate cash balance
	 * One third of the cash balance (3:1 ratio)
	 * @param cashBalance
	 * @return
	 */
	public double calculateCashBalance(double cashBalance) {
		return cashBalance / 5;
	}

	/**
	 * Calculates the line of credit according to the rules defined by the business
	 * 
	 * @param creditLine
	 * @return double
	 */
	@Override
	public double calculateCreditLine(CreditLineRequest creditLine) {
		double creditLineRecommended = Math.max(calculateCashBalance(creditLine.getCashBalance()),
				calculateMonthlyRevenue(creditLine.getMontlyRevenue()));
		return creditLineRecommended;
	}

}
