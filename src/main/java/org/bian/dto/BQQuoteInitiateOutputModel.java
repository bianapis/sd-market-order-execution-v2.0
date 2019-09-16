package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuoteInitiateOutputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.BQQuoteInitiateOutputModelQuoteInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuoteInitiateOutputModel
 */
public class BQQuoteInitiateOutputModel   {
  private BQQuoteInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String quoteInstanceReference = null;

  private String quoteInitiateActionReference = null;

  private Object quoteInitiateActionRecord = null;

  private String quoteInstanceStatus = null;

  private BQQuoteInitiateOutputModelQuoteInstanceRecord quoteInstanceRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public BQQuoteInitiateOutputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(BQQuoteInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Quote instance 
   * @return quoteInstanceReference
  **/

  public String getQuoteInstanceReference() {
    return quoteInstanceReference;
  }

  public void setQuoteInstanceReference(String quoteInstanceReference) {
    this.quoteInstanceReference = quoteInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return quoteInitiateActionReference
  **/

  public String getQuoteInitiateActionReference() {
    return quoteInitiateActionReference;
  }

  public void setQuoteInitiateActionReference(String quoteInitiateActionReference) {
    this.quoteInitiateActionReference = quoteInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return quoteInitiateActionRecord
  **/

  public Object getQuoteInitiateActionRecord() {
    return quoteInitiateActionRecord;
  }

  public void setQuoteInitiateActionRecord(Object quoteInitiateActionRecord) {
    this.quoteInitiateActionRecord = quoteInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Quote instance (e.g. initialised, pending, active) 
   * @return quoteInstanceStatus
  **/

  public String getQuoteInstanceStatus() {
    return quoteInstanceStatus;
  }

  public void setQuoteInstanceStatus(String quoteInstanceStatus) {
    this.quoteInstanceStatus = quoteInstanceStatus;
  }


  /**
   * Get quoteInstanceRecord
   * @return quoteInstanceRecord
  **/

  public BQQuoteInitiateOutputModelQuoteInstanceRecord getQuoteInstanceRecord() {
    return quoteInstanceRecord;
  }

  public void setQuoteInstanceRecord(BQQuoteInitiateOutputModelQuoteInstanceRecord quoteInstanceRecord) {
    this.quoteInstanceRecord = quoteInstanceRecord;
  }


}

