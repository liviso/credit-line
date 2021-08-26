package com.tribal.credit.service;

import com.tribal.credit.model.CreditLineRequest;
import com.tribal.credit.model.CreditLineResponse;

/**
 * Credit Line Service
 * 
 * @author cm_ol
 *
 */
public interface CreditLineService {
	/**
	 * Validate if credit line was accepted
	 * 
	 * @param creditLine
	 * @return
	 */
	boolean isCreditLineAccepted(CreditLineRequest creditLine);

	/**
	 * Builds credit line response
	 * 
	 * @param creditLineRequest
	 * @return
	 */
	CreditLineResponse buildCreditLineResponse(CreditLineRequest creditLineRequest);
}
