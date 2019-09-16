/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketOrderExecutionApiService {

	SDMarketOrderExecutionActivateOutputModel activate(SDMarketOrderExecutionActivateInputModel request);
	
	SDMarketOrderExecutionConfigureOutputModel configure(String sdReferenceId, SDMarketOrderExecutionConfigureInputModel request);
	
	BQPositionControlOutputModel controlPosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionControlInputModel request);
	
	BQPositionExchangeOutputModel exchangePosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionExchangeInputModel request);
	
	BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request);
	
	BQTradeInitiationExecuteOutputModel executeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExecuteInputModel request);
	
	SDMarketOrderExecutionFeedbackOutputModel feedback(String sdReferenceId, SDMarketOrderExecutionFeedbackInputModel request);
	
	CRMarketTradeTransactionInitiateOutputModel initiate(String sdReferenceId, CRMarketTradeTransactionInitiateInputModel request);
	
	BQQuoteInitiateOutputModel initiateQuote(String sdReferenceId, String crReferenceId, BQQuoteInitiateInputModel request);
	
	BQTradeInitiationInitiateOutputModel initiateTradeinitiation(String sdReferenceId, String crReferenceId, BQTradeInitiationInitiateInputModel request);
	
	BQPositionRequestOutputModel requestPosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionRequestInputModel request);
	
	BQTradeInitiationRequestOutputModel requestTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationRequestInputModel request);
	
	CRMarketTradeTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMarketTradeTransactionRequestInputModel request);
	
	CRMarketTradeTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQPositionRetrieveOutputModel retrievePosition(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQuoteRetrieveOutputModel retrieveQuote(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDMarketOrderExecutionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRMarketTradeTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMarketTradeTransactionUpdateInputModel request);
	
	BQTradeInitiationUpdateOutputModel updateTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationUpdateInputModel request);
	
}
