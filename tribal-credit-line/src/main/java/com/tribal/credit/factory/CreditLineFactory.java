package com.tribal.credit.factory;

import com.tribal.credit.enums.BusinessType;
/**
 * Credit Line Factory Pattern.
 * @author cm_ol
 *
 */
public class CreditLineFactory {

	/**
	 * According to the business type, the corresponding rules 
	 * are applied to calculate the credit line.
	 * 
	 * @param businessType
	 * @return CreditLineAdapter
	 */
	public static CreditLineAdapter validateBusinessType(BusinessType businessType) {
		switch (businessType) {
		case STARTUP:
			return new StartupCreditLineAdapter();
		case SME:
			return new SMECreditLineAdapter();
		}
		throw new IllegalArgumentException("Business Type not supported.");
	}
}
