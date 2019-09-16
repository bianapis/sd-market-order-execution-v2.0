package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionControlOutputModel
 */
public class BQPositionControlOutputModel   {
  private String positionControlActionTaskReference = null;

  private Object positionControlActionTaskRecord = null;

  private String positionControlActionResponse = null;

  private String positionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Position instance control processing service call 
   * @return positionControlActionTaskReference
  **/

  public String getPositionControlActionTaskReference() {
    return positionControlActionTaskReference;
  }

  public void setPositionControlActionTaskReference(String positionControlActionTaskReference) {
    this.positionControlActionTaskReference = positionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return positionControlActionResponse
  **/

  public String getPositionControlActionResponse() {
    return positionControlActionResponse;
  }

  public void setPositionControlActionResponse(String positionControlActionResponse) {
    this.positionControlActionResponse = positionControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Position instance (e.g. initialised, pending, active) 
   * @return positionInstanceStatus
  **/

  public String getPositionInstanceStatus() {
    return positionInstanceStatus;
  }

  public void setPositionInstanceStatus(String positionInstanceStatus) {
    this.positionInstanceStatus = positionInstanceStatus;
  }


}

