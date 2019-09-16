/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class MarketOrderExecutionApiController {

	@Autowired
	MarketOrderExecutionApiService service;
	
	@Transact.Activate
	public BianResponse<SDMarketOrderExecutionActivateOutputModel> activate(@RequestBody BianRequest<SDMarketOrderExecutionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDMarketOrderExecutionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketOrderExecutionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("position")
	@Transact.Control
	public BianResponse<BQPositionControlOutputModel> controlPosition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPositionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlPosition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("position")
	@Transact.Exchange
	public BianResponse<BQPositionExchangeOutputModel> exchangePosition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPositionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePosition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("tradeinitiation")
	@Transact.Exchange
	public BianResponse<BQTradeInitiationExchangeOutputModel> exchangeTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTradeInitiationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTradeinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("tradeinitiation")
	@Transact.Execute
	public BianResponse<BQTradeInitiationExecuteOutputModel> executeTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTradeInitiationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeTradeinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDMarketOrderExecutionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDMarketOrderExecutionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRMarketTradeTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRMarketTradeTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("quote")
	@Transact.Initiate
	public BianResponse<BQQuoteInitiateOutputModel> initiateQuote(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQQuoteInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateQuote(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("tradeinitiation")
	@Transact.Initiate
	public BianResponse<BQTradeInitiationInitiateOutputModel> initiateTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTradeInitiationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTradeinitiation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("position")
	@Transact.Request
	public BianResponse<BQPositionRequestOutputModel> requestPosition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPositionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPosition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("tradeinitiation")
	@Transact.Request
	public BianResponse<BQTradeInitiationRequestOutputModel> requestTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTradeInitiationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTradeinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Request
	public BianResponse<CRMarketTradeTransactionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMarketTradeTransactionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRMarketTradeTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("position")
	@Transact.Retrieve
	public BianResponse<BQPositionRetrieveOutputModel> retrievePosition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePosition(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("quote")
	@Transact.Retrieve
	public BianResponse<BQQuoteRetrieveOutputModel> retrieveQuote(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuote(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("tradeinitiation")
	@Transact.Retrieve
	public BianResponse<BQTradeInitiationRetrieveOutputModel> retrieveTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTradeinitiation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDMarketOrderExecutionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRMarketTradeTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRMarketTradeTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("tradeinitiation")
	@Transact.Update
	public BianResponse<BQTradeInitiationUpdateOutputModel> updateTradeinitiation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTradeInitiationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTradeinitiation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
