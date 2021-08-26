package com.tribal.credit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tribal.credit.enums.CreditLineResult;
import com.tribal.credit.factory.CreditLineFactory;
import com.tribal.credit.model.CreditLineRequest;
import com.tribal.credit.model.CreditLineResponse;

@Service
public class CreditLineServiceImpl implements CreditLineService {

	private static final Logger logger = LoggerFactory.getLogger(CreditLineServiceImpl.class);

	/**
	 * Validates if credit line was accepted
	 * @param creditLineRequest
	 * @return boolean
	 */
	@Override
	public boolean isCreditLineAccepted(CreditLineRequest creditLineRequest) {
		double creditLine = CreditLineFactory.validateBusinessType(creditLineRequest.getBusinessType())
				.calculateCreditLine(creditLineRequest);
		logger.debug("CreditLine", creditLine);
		if (creditLine > creditLineRequest.getRequestedCreditLine()) {
			return true;
		}
		return false;
	}

	/**
	 * Builds credit line response
	 * @param creditLineRequest
	 * @return CreditLineResponse
	 */
	@Override
	public CreditLineResponse buildCreditLineResponse(CreditLineRequest creditLineRequest) {
		CreditLineResponse creditLineResponse = new CreditLineResponse();
		creditLineResponse.setRequestedCreditLine(creditLineRequest.getRequestedCreditLine());
		if (isCreditLineAccepted(creditLineRequest)) {
			creditLineResponse.setResult(CreditLineResult.ACCEPTED);
		} else {
			creditLineResponse.setResult(CreditLineResult.REJECTED);
		}
		logger.debug("CreditLineResponse", creditLineResponse);
		return creditLineResponse;
	}

}
