package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuoteInitiateInputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.BQQuoteInitiateInputModelQuoteInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuoteInitiateInputModel
 */
public class BQQuoteInitiateInputModel   {
  private BQQuoteInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String marketTradeTransactionInstanceReference = null;

  private Object quoteInitiateActionRecord = null;

  private BQQuoteInitiateInputModelQuoteInstanceRecord quoteInstanceRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public BQQuoteInitiateInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(BQQuoteInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Market Trade Transaction instance 
   * @return marketTradeTransactionInstanceReference
  **/

  public String getMarketTradeTransactionInstanceReference() {
    return marketTradeTransactionInstanceReference;
  }

  public void setMarketTradeTransactionInstanceReference(String marketTradeTransactionInstanceReference) {
    this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
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
   * Get quoteInstanceRecord
   * @return quoteInstanceRecord
  **/

  public BQQuoteInitiateInputModelQuoteInstanceRecord getQuoteInstanceRecord() {
    return quoteInstanceRecord;
  }

  public void setQuoteInstanceRecord(BQQuoteInitiateInputModelQuoteInstanceRecord quoteInstanceRecord) {
    this.quoteInstanceRecord = quoteInstanceRecord;
  }


}

