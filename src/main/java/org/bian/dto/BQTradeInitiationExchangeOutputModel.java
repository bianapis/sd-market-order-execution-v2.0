package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationExchangeOutputModel
 */
public class BQTradeInitiationExchangeOutputModel   {
  private String tradeInitiationExchangeActionTaskReference = null;

  private Object tradeInitiationExchangeActionTaskRecord = null;

  private String tradeInitiationExchangeActionResponse = null;

  private String tradeInitiationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trade Initiation instance exchange service call 
   * @return tradeInitiationExchangeActionTaskReference
  **/

  public String getTradeInitiationExchangeActionTaskReference() {
    return tradeInitiationExchangeActionTaskReference;
  }

  public void setTradeInitiationExchangeActionTaskReference(String tradeInitiationExchangeActionTaskReference) {
    this.tradeInitiationExchangeActionTaskReference = tradeInitiationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return tradeInitiationExchangeActionTaskRecord
  **/

  public Object getTradeInitiationExchangeActionTaskRecord() {
    return tradeInitiationExchangeActionTaskRecord;
  }

  public void setTradeInitiationExchangeActionTaskRecord(Object tradeInitiationExchangeActionTaskRecord) {
    this.tradeInitiationExchangeActionTaskRecord = tradeInitiationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return tradeInitiationExchangeActionResponse
  **/

  public String getTradeInitiationExchangeActionResponse() {
    return tradeInitiationExchangeActionResponse;
  }

  public void setTradeInitiationExchangeActionResponse(String tradeInitiationExchangeActionResponse) {
    this.tradeInitiationExchangeActionResponse = tradeInitiationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Trade Initiation instance (e.g. accepted, rejected, verified) 
   * @return tradeInitiationInstanceStatus
  **/

  public String getTradeInitiationInstanceStatus() {
    return tradeInitiationInstanceStatus;
  }

  public void setTradeInitiationInstanceStatus(String tradeInitiationInstanceStatus) {
    this.tradeInitiationInstanceStatus = tradeInitiationInstanceStatus;
  }


}

