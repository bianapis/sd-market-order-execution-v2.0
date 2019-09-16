package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveOutputModelPositionInstanceReport
 */
public class BQPositionRetrieveOutputModelPositionInstanceReport   {
  private Object positionInstanceReportRecord = null;

  private String positionInstanceReportType = null;

  private String positionInstanceReportParameters = null;

  private Object positionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return positionInstanceReportRecord
  **/

  public Object getPositionInstanceReportRecord() {
    return positionInstanceReportRecord;
  }

  public void setPositionInstanceReportRecord(Object positionInstanceReportRecord) {
    this.positionInstanceReportRecord = positionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return positionInstanceReportType
  **/

  public String getPositionInstanceReportType() {
    return positionInstanceReportType;
  }

  public void setPositionInstanceReportType(String positionInstanceReportType) {
    this.positionInstanceReportType = positionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return positionInstanceReportParameters
  **/

  public String getPositionInstanceReportParameters() {
    return positionInstanceReportParameters;
  }

  public void setPositionInstanceReportParameters(String positionInstanceReportParameters) {
    this.positionInstanceReportParameters = positionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return positionInstanceReport
  **/

  public Object getPositionInstanceReport() {
    return positionInstanceReport;
  }

  public void setPositionInstanceReport(Object positionInstanceReport) {
    this.positionInstanceReport = positionInstanceReport;
  }


}

