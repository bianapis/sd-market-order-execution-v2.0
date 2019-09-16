package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationUpdateInputModel
 */
public class BQTradeInitiationUpdateInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private Object tradeInitiationUpdateActionTaskRecord = null;

  private String tradeInitiationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return tradeInitiationUpdateActionTaskRecord
  **/

  public Object getTradeInitiationUpdateActionTaskRecord() {
    return tradeInitiationUpdateActionTaskRecord;
  }

  public void setTradeInitiationUpdateActionTaskRecord(Object tradeInitiationUpdateActionTaskRecord) {
    this.tradeInitiationUpdateActionTaskRecord = tradeInitiationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return tradeInitiationUpdateActionRequest
  **/

  public String getTradeInitiationUpdateActionRequest() {
    return tradeInitiationUpdateActionRequest;
  }

  public void setTradeInitiationUpdateActionRequest(String tradeInitiationUpdateActionRequest) {
    this.tradeInitiationUpdateActionRequest = tradeInitiationUpdateActionRequest;
  }


}

