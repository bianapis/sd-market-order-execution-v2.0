package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateInputModel
 */
public class BQTradeInitiationInitiateInputModel   {
  private BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String marketTradeTransactionInstanceReference = null;

  private Object tradeInitiationInitiateActionRecord = null;

  private BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(BQTradeInitiationInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
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
   * @return tradeInitiationInitiateActionRecord
  **/

  public Object getTradeInitiationInitiateActionRecord() {
    return tradeInitiationInitiateActionRecord;
  }

  public void setTradeInitiationInitiateActionRecord(Object tradeInitiationInitiateActionRecord) {
    this.tradeInitiationInitiateActionRecord = tradeInitiationInitiateActionRecord;
  }


  /**
   * Get tradeInitiationInstanceRecord
   * @return tradeInitiationInstanceRecord
  **/

  public BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord getTradeInitiationInstanceRecord() {
    return tradeInitiationInstanceRecord;
  }

  public void setTradeInitiationInstanceRecord(BQTradeInitiationInitiateInputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord) {
    this.tradeInitiationInstanceRecord = tradeInitiationInstanceRecord;
  }


}

