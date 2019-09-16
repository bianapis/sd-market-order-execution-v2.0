/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketOrderExecutionApiServiceImpl implements MarketOrderExecutionApiService {

	public SDMarketOrderExecutionActivateOutputModel activate(SDMarketOrderExecutionActivateInputModel request){
		return JsonReader.read("activate-SDMarketOrderExecutionActivateOutputModel.json",new TypeReference<SDMarketOrderExecutionActivateOutputModel>(){});
	}
	
	public SDMarketOrderExecutionConfigureOutputModel configure(String sdReferenceId, SDMarketOrderExecutionConfigureInputModel request){
		return JsonReader.read("configure-SDMarketOrderExecutionConfigureOutputModel.json",new TypeReference<SDMarketOrderExecutionConfigureOutputModel>(){});
	}
	
	public BQPositionControlOutputModel controlPosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionControlInputModel request){
		return JsonReader.read("control-BQPositionControlOutputModel.json",new TypeReference<BQPositionControlOutputModel>(){});
	}
	
	public BQPositionExchangeOutputModel exchangePosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionExchangeInputModel request){
		return JsonReader.read("exchange-BQPositionExchangeOutputModel.json",new TypeReference<BQPositionExchangeOutputModel>(){});
	}
	
	public BQTradeInitiationExchangeOutputModel exchangeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQTradeInitiationExchangeOutputModel.json",new TypeReference<BQTradeInitiationExchangeOutputModel>(){});
	}
	
	public BQTradeInitiationExecuteOutputModel executeTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationExecuteInputModel request){
		return JsonReader.read("execute-BQTradeInitiationExecuteOutputModel.json",new TypeReference<BQTradeInitiationExecuteOutputModel>(){});
	}
	
	public SDMarketOrderExecutionFeedbackOutputModel feedback(String sdReferenceId, SDMarketOrderExecutionFeedbackInputModel request){
		return JsonReader.read("feedback-SDMarketOrderExecutionFeedbackOutputModel.json",new TypeReference<SDMarketOrderExecutionFeedbackOutputModel>(){});
	}
	
	public CRMarketTradeTransactionInitiateOutputModel initiate(String sdReferenceId, CRMarketTradeTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRMarketTradeTransactionInitiateOutputModel.json",new TypeReference<CRMarketTradeTransactionInitiateOutputModel>(){});
	}
	
	public BQQuoteInitiateOutputModel initiateQuote(String sdReferenceId, String crReferenceId, BQQuoteInitiateInputModel request){
		return JsonReader.read("initiate-BQQuoteInitiateOutputModel.json",new TypeReference<BQQuoteInitiateOutputModel>(){});
	}
	
	public BQTradeInitiationInitiateOutputModel initiateTradeinitiation(String sdReferenceId, String crReferenceId, BQTradeInitiationInitiateInputModel request){
		return JsonReader.read("initiate-BQTradeInitiationInitiateOutputModel.json",new TypeReference<BQTradeInitiationInitiateOutputModel>(){});
	}
	
	public BQPositionRequestOutputModel requestPosition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPositionRequestInputModel request){
		return JsonReader.read("request-BQPositionRequestOutputModel.json",new TypeReference<BQPositionRequestOutputModel>(){});
	}
	
	public BQTradeInitiationRequestOutputModel requestTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationRequestInputModel request){
		return JsonReader.read("request-BQTradeInitiationRequestOutputModel.json",new TypeReference<BQTradeInitiationRequestOutputModel>(){});
	}
	
	public CRMarketTradeTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMarketTradeTransactionRequestInputModel request){
		return JsonReader.read("request-CRMarketTradeTransactionRequestOutputModel.json",new TypeReference<CRMarketTradeTransactionRequestOutputModel>(){});
	}
	
	public CRMarketTradeTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRMarketTradeTransactionRetrieveOutputModel.json",new TypeReference<CRMarketTradeTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPositionRetrieveOutputModel retrievePosition(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPositionRetrieveOutputModel.json",new TypeReference<BQPositionRetrieveOutputModel>(){});
	}
	
	public BQQuoteRetrieveOutputModel retrieveQuote(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQuoteRetrieveOutputModel.json",new TypeReference<BQQuoteRetrieveOutputModel>(){});
	}
	
	public BQTradeInitiationRetrieveOutputModel retrieveTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTradeInitiationRetrieveOutputModel.json",new TypeReference<BQTradeInitiationRetrieveOutputModel>(){});
	}
	
	public SDMarketOrderExecutionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMarketOrderExecutionRetrieveOutputModel.json",new TypeReference<SDMarketOrderExecutionRetrieveOutputModel>(){});
	}
	
	public CRMarketTradeTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMarketTradeTransactionUpdateInputModel request){
		return JsonReader.read("update-CRMarketTradeTransactionUpdateOutputModel.json",new TypeReference<CRMarketTradeTransactionUpdateOutputModel>(){});
	}
	
	public BQTradeInitiationUpdateOutputModel updateTradeinitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTradeInitiationUpdateInputModel request){
		return JsonReader.read("update-BQTradeInitiationUpdateOutputModel.json",new TypeReference<BQTradeInitiationUpdateOutputModel>(){});
	}
	
}
