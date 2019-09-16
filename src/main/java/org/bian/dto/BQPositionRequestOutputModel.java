package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRequestOutputModelPositionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPositionRequestOutputModel
 */
public class BQPositionRequestOutputModel   {
  private BQPositionRequestOutputModelPositionInstanceRecord positionInstanceRecord = null;

  private String positionRequestActionTaskReference = null;

  private Object positionRequestActionTaskRecord = null;

  private String positionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQPositionRequestOutputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQPositionRequestOutputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Position instance request service call 
   * @return positionRequestActionTaskReference
  **/

  public String getPositionRequestActionTaskReference() {
    return positionRequestActionTaskReference;
  }

  public void setPositionRequestActionTaskReference(String positionRequestActionTaskReference) {
    this.positionRequestActionTaskReference = positionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return positionRequestActionTaskRecord
  **/

  public Object getPositionRequestActionTaskRecord() {
    return positionRequestActionTaskRecord;
  }

  public void setPositionRequestActionTaskRecord(Object positionRequestActionTaskRecord) {
    this.positionRequestActionTaskRecord = positionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Position service request record 
   * @return positionRequestRecordReference
  **/

  public String getPositionRequestRecordReference() {
    return positionRequestRecordReference;
  }

  public void setPositionRequestRecordReference(String positionRequestRecordReference) {
    this.positionRequestRecordReference = positionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

