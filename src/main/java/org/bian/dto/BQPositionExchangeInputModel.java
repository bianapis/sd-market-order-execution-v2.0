package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPositionExchangeInputModel
 */
public class BQPositionExchangeInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String positionInstanceReference = null;

  private Object positionExchangeActionTaskRecord = null;

  private BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest positionExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Position instance 
   * @return positionInstanceReference
  **/

  public String getPositionInstanceReference() {
    return positionInstanceReference;
  }

  public void setPositionInstanceReference(String positionInstanceReference) {
    this.positionInstanceReference = positionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return positionExchangeActionTaskRecord
  **/

  public Object getPositionExchangeActionTaskRecord() {
    return positionExchangeActionTaskRecord;
  }

  public void setPositionExchangeActionTaskRecord(Object positionExchangeActionTaskRecord) {
    this.positionExchangeActionTaskRecord = positionExchangeActionTaskRecord;
  }


  /**
   * Get positionExchangeActionRequest
   * @return positionExchangeActionRequest
  **/

  public BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest getPositionExchangeActionRequest() {
    return positionExchangeActionRequest;
  }

  public void setPositionExchangeActionRequest(BQTradeInitiationExchangeInputModelTradeInitiationExchangeActionRequest positionExchangeActionRequest) {
    this.positionExchangeActionRequest = positionExchangeActionRequest;
  }


}

