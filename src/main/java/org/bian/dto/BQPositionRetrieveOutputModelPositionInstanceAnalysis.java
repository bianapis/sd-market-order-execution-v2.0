package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveOutputModelPositionInstanceAnalysis
 */
public class BQPositionRetrieveOutputModelPositionInstanceAnalysis   {
  private Object positionInstanceAnalysisRecord = null;

  private String positionInstanceAnalysisReportType = null;

  private String positionInstanceAnalysisParameters = null;

  private Object positionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return positionInstanceAnalysisRecord
  **/

  public Object getPositionInstanceAnalysisRecord() {
    return positionInstanceAnalysisRecord;
  }

  public void setPositionInstanceAnalysisRecord(Object positionInstanceAnalysisRecord) {
    this.positionInstanceAnalysisRecord = positionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return positionInstanceAnalysisReportType
  **/

  public String getPositionInstanceAnalysisReportType() {
    return positionInstanceAnalysisReportType;
  }

  public void setPositionInstanceAnalysisReportType(String positionInstanceAnalysisReportType) {
    this.positionInstanceAnalysisReportType = positionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return positionInstanceAnalysisParameters
  **/

  public String getPositionInstanceAnalysisParameters() {
    return positionInstanceAnalysisParameters;
  }

  public void setPositionInstanceAnalysisParameters(String positionInstanceAnalysisParameters) {
    this.positionInstanceAnalysisParameters = positionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return positionInstanceAnalysisReport
  **/

  public Object getPositionInstanceAnalysisReport() {
    return positionInstanceAnalysisReport;
  }

  public void setPositionInstanceAnalysisReport(Object positionInstanceAnalysisReport) {
    this.positionInstanceAnalysisReport = positionInstanceAnalysisReport;
  }


}

