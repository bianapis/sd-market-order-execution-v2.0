package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRetrieveOutputModelPositionInstanceAnalysis;
import org.bian.dto.BQPositionRetrieveOutputModelPositionInstanceRecord;
import org.bian.dto.BQPositionRetrieveOutputModelPositionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveOutputModel
 */
public class BQPositionRetrieveOutputModel   {
  private BQPositionRetrieveOutputModelPositionInstanceRecord positionInstanceRecord = null;

  private String positionRetrieveActionTaskReference = null;

  private Object positionRetrieveActionTaskRecord = null;

  private String positionRetrieveActionResponse = null;

  private BQPositionRetrieveOutputModelPositionInstanceReport positionInstanceReport = null;

  private BQPositionRetrieveOutputModelPositionInstanceAnalysis positionInstanceAnalysis = null;


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQPositionRetrieveOutputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQPositionRetrieveOutputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Position instance retrieve service call 
   * @return positionRetrieveActionTaskReference
  **/

  public String getPositionRetrieveActionTaskReference() {
    return positionRetrieveActionTaskReference;
  }

  public void setPositionRetrieveActionTaskReference(String positionRetrieveActionTaskReference) {
    this.positionRetrieveActionTaskReference = positionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return positionRetrieveActionTaskRecord
  **/

  public Object getPositionRetrieveActionTaskRecord() {
    return positionRetrieveActionTaskRecord;
  }

  public void setPositionRetrieveActionTaskRecord(Object positionRetrieveActionTaskRecord) {
    this.positionRetrieveActionTaskRecord = positionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return positionRetrieveActionResponse
  **/

  public String getPositionRetrieveActionResponse() {
    return positionRetrieveActionResponse;
  }

  public void setPositionRetrieveActionResponse(String positionRetrieveActionResponse) {
    this.positionRetrieveActionResponse = positionRetrieveActionResponse;
  }


  /**
   * Get positionInstanceReport
   * @return positionInstanceReport
  **/

  public BQPositionRetrieveOutputModelPositionInstanceReport getPositionInstanceReport() {
    return positionInstanceReport;
  }

  public void setPositionInstanceReport(BQPositionRetrieveOutputModelPositionInstanceReport positionInstanceReport) {
    this.positionInstanceReport = positionInstanceReport;
  }


  /**
   * Get positionInstanceAnalysis
   * @return positionInstanceAnalysis
  **/

  public BQPositionRetrieveOutputModelPositionInstanceAnalysis getPositionInstanceAnalysis() {
    return positionInstanceAnalysis;
  }

  public void setPositionInstanceAnalysis(BQPositionRetrieveOutputModelPositionInstanceAnalysis positionInstanceAnalysis) {
    this.positionInstanceAnalysis = positionInstanceAnalysis;
  }


}

