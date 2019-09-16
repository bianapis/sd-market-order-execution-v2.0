package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateOutputModel
 */
public class BQTradeInitiationInitiateOutputModel   {
  private BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String tradeInitiationInstanceReference = null;

  private String tradeInitiationInitiateActionReference = null;

  private Object tradeInitiationInitiateActionRecord = null;

  private String tradeInitiationInstanceStatus = null;

  private BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(BQTradeInitiationInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation instance 
   * @return tradeInitiationInstanceReference
  **/

  public String getTradeInitiationInstanceReference() {
    return tradeInitiationInstanceReference;
  }

  public void setTradeInitiationInstanceReference(String tradeInitiationInstanceReference) {
    this.tradeInitiationInstanceReference = tradeInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return tradeInitiationInitiateActionReference
  **/

  public String getTradeInitiationInitiateActionReference() {
    return tradeInitiationInitiateActionReference;
  }

  public void setTradeInitiationInitiateActionReference(String tradeInitiationInitiateActionReference) {
    this.tradeInitiationInitiateActionReference = tradeInitiationInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Trade Initiation instance (e.g. initialised, pending, active) 
   * @return tradeInitiationInstanceStatus
  **/

  public String getTradeInitiationInstanceStatus() {
    return tradeInitiationInstanceStatus;
  }

  public void setTradeInitiationInstanceStatus(String tradeInitiationInstanceStatus) {
    this.tradeInitiationInstanceStatus = tradeInitiationInstanceStatus;
  }


  /**
   * Get tradeInitiationInstanceRecord
   * @return tradeInitiationInstanceRecord
  **/

  public BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord getTradeInitiationInstanceRecord() {
    return tradeInitiationInstanceRecord;
  }

  public void setTradeInitiationInstanceRecord(BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord tradeInitiationInstanceRecord) {
    this.tradeInitiationInstanceRecord = tradeInitiationInstanceRecord;
  }


}

