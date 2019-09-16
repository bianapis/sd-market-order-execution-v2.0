package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionExchangeOutputModel
 */
public class BQPositionExchangeOutputModel   {
  private String positionExchangeActionTaskReference = null;

  private Object positionExchangeActionTaskRecord = null;

  private String positionExchangeActionResponse = null;

  private String positionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Position instance exchange service call 
   * @return positionExchangeActionTaskReference
  **/

  public String getPositionExchangeActionTaskReference() {
    return positionExchangeActionTaskReference;
  }

  public void setPositionExchangeActionTaskReference(String positionExchangeActionTaskReference) {
    this.positionExchangeActionTaskReference = positionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return positionExchangeActionResponse
  **/

  public String getPositionExchangeActionResponse() {
    return positionExchangeActionResponse;
  }

  public void setPositionExchangeActionResponse(String positionExchangeActionResponse) {
    this.positionExchangeActionResponse = positionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Position instance (e.g. accepted, rejected, verified) 
   * @return positionInstanceStatus
  **/

  public String getPositionInstanceStatus() {
    return positionInstanceStatus;
  }

  public void setPositionInstanceStatus(String positionInstanceStatus) {
    this.positionInstanceStatus = positionInstanceStatus;
  }


}

