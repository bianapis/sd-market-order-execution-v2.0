package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRetrieveInputModelPositionInstanceAnalysis;
import org.bian.dto.BQPositionRetrieveInputModelPositionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveInputModel
 */
public class BQPositionRetrieveInputModel   {
  private Object positionRetrieveActionTaskRecord = null;

  private String positionRetrieveActionRequest = null;

  private BQPositionRetrieveInputModelPositionInstanceReport positionInstanceReport = null;

  private BQPositionRetrieveInputModelPositionInstanceAnalysis positionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return positionRetrieveActionRequest
  **/

  public String getPositionRetrieveActionRequest() {
    return positionRetrieveActionRequest;
  }

  public void setPositionRetrieveActionRequest(String positionRetrieveActionRequest) {
    this.positionRetrieveActionRequest = positionRetrieveActionRequest;
  }


  /**
   * Get positionInstanceReport
   * @return positionInstanceReport
  **/

  public BQPositionRetrieveInputModelPositionInstanceReport getPositionInstanceReport() {
    return positionInstanceReport;
  }

  public void setPositionInstanceReport(BQPositionRetrieveInputModelPositionInstanceReport positionInstanceReport) {
    this.positionInstanceReport = positionInstanceReport;
  }


  /**
   * Get positionInstanceAnalysis
   * @return positionInstanceAnalysis
  **/

  public BQPositionRetrieveInputModelPositionInstanceAnalysis getPositionInstanceAnalysis() {
    return positionInstanceAnalysis;
  }

  public void setPositionInstanceAnalysis(BQPositionRetrieveInputModelPositionInstanceAnalysis positionInstanceAnalysis) {
    this.positionInstanceAnalysis = positionInstanceAnalysis;
  }


}

