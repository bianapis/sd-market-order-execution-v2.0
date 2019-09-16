package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionUpdateInputModel
 */
public class CRMarketTradeTransactionUpdateInputModel   {
  private String marketOrderExecutionServicingSessionReference = null;

  private String marketTradeTransactionInstanceReference = null;

  private CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private Object marketTradeTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return marketTradeTransactionUpdateActionTaskRecord
  **/

  public Object getMarketTradeTransactionUpdateActionTaskRecord() {
    return marketTradeTransactionUpdateActionTaskRecord;
  }

  public void setMarketTradeTransactionUpdateActionTaskRecord(Object marketTradeTransactionUpdateActionTaskRecord) {
    this.marketTradeTransactionUpdateActionTaskRecord = marketTradeTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

