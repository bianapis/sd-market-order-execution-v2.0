package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionControlInputModelPositionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQPositionControlInputModel
 */
public class BQPositionControlInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String positionInstanceReference = null;

  private Object positionControlActionTaskRecord = null;

  private BQPositionControlInputModelPositionControlActionRequest positionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return positionControlActionTaskRecord
  **/

  public Object getPositionControlActionTaskRecord() {
    return positionControlActionTaskRecord;
  }

  public void setPositionControlActionTaskRecord(Object positionControlActionTaskRecord) {
    this.positionControlActionTaskRecord = positionControlActionTaskRecord;
  }


  /**
   * Get positionControlActionRequest
   * @return positionControlActionRequest
  **/

  public BQPositionControlInputModelPositionControlActionRequest getPositionControlActionRequest() {
    return positionControlActionRequest;
  }

  public void setPositionControlActionRequest(BQPositionControlInputModelPositionControlActionRequest positionControlActionRequest) {
    this.positionControlActionRequest = positionControlActionRequest;
  }


}

