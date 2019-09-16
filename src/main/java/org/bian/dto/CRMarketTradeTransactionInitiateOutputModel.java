package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionInitiateOutputModelMarketTradeTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionInitiateOutputModel
 */
public class CRMarketTradeTransactionInitiateOutputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String marketTradeTransactionInitiateActionReference = null;

  private Object marketTradeTransactionInitiateActionRecord = null;

  private String marketTradeTransactionInstanceStatus = null;

  private CRMarketTradeTransactionInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Trade Transaction instance 
   * @return marketTradeTransactionInstanceReference
  **/

  public String getMarketTradeTransactionInstanceReference() {
    return marketTradeTransactionInstanceReference;
  }

  public void setMarketTradeTransactionInstanceReference(String marketTradeTransactionInstanceReference) {
    this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return marketTradeTransactionInitiateActionReference
  **/

  public String getMarketTradeTransactionInitiateActionReference() {
    return marketTradeTransactionInitiateActionReference;
  }

  public void setMarketTradeTransactionInitiateActionReference(String marketTradeTransactionInitiateActionReference) {
    this.marketTradeTransactionInitiateActionReference = marketTradeTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return marketTradeTransactionInitiateActionRecord
  **/

  public Object getMarketTradeTransactionInitiateActionRecord() {
    return marketTradeTransactionInitiateActionRecord;
  }

  public void setMarketTradeTransactionInitiateActionRecord(Object marketTradeTransactionInitiateActionRecord) {
    this.marketTradeTransactionInitiateActionRecord = marketTradeTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Market Trade Transaction instance (e.g. initialised, pending, active) 
   * @return marketTradeTransactionInstanceStatus
  **/

  public String getMarketTradeTransactionInstanceStatus() {
    return marketTradeTransactionInstanceStatus;
  }

  public void setMarketTradeTransactionInstanceStatus(String marketTradeTransactionInstanceStatus) {
    this.marketTradeTransactionInstanceStatus = marketTradeTransactionInstanceStatus;
  }


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionInitiateOutputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionInitiateOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


}

