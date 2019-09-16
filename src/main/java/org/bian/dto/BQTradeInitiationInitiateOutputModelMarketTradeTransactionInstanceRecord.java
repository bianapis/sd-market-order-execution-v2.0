package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord
 */
public class BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord   {
  private String marketOrderTransactionInstanceReference = null;

  private String customerMarketOrderProcessingInstruction = null;

  private BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction marketOrderTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the market order that is to be executed in the markets 
   * @return marketOrderTransactionInstanceReference
  **/

  public String getMarketOrderTransactionInstanceReference() {
    return marketOrderTransactionInstanceReference;
  }

  public void setMarketOrderTransactionInstanceReference(String marketOrderTransactionInstanceReference) {
    this.marketOrderTransactionInstanceReference = marketOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any customer specific processing preferences or requirements 
   * @return customerMarketOrderProcessingInstruction
  **/

  public String getCustomerMarketOrderProcessingInstruction() {
    return customerMarketOrderProcessingInstruction;
  }

  public void setCustomerMarketOrderProcessingInstruction(String customerMarketOrderProcessingInstruction) {
    this.customerMarketOrderProcessingInstruction = customerMarketOrderProcessingInstruction;
  }


  /**
   * Get marketOrderTransaction
   * @return marketOrderTransaction
  **/

  public BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction getMarketOrderTransaction() {
    return marketOrderTransaction;
  }

  public void setMarketOrderTransaction(BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction marketOrderTransaction) {
    this.marketOrderTransaction = marketOrderTransaction;
  }


}

