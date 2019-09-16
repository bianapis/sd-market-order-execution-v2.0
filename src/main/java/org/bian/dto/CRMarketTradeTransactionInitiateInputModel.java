package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionInitiateInputModel
 */
public class CRMarketTradeTransactionInitiateInputModel   {
  private String marketOrderExecutionServicingSessionReference = null;

  private Object marketTradeTransactionInitiateActionRecord = null;

  private String marketTradeTransactionInstanceStatus = null;

  private CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketOrderExecutionServicingSessionReference
  **/

  public String getMarketOrderExecutionServicingSessionReference() {
    return marketOrderExecutionServicingSessionReference;
  }

  public void setMarketOrderExecutionServicingSessionReference(String marketOrderExecutionServicingSessionReference) {
    this.marketOrderExecutionServicingSessionReference = marketOrderExecutionServicingSessionReference;
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

  public CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


}

