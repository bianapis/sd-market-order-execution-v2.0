package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis
 */
public class BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceAnalysis   {
  private Object tradeInitiationInstanceAnalysisRecord = null;

  private String tradeInitiationInstanceAnalysisReportType = null;

  private String tradeInitiationInstanceAnalysisParameters = null;

  private Object tradeInitiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return tradeInitiationInstanceAnalysisRecord
  **/

  public Object getTradeInitiationInstanceAnalysisRecord() {
    return tradeInitiationInstanceAnalysisRecord;
  }

  public void setTradeInitiationInstanceAnalysisRecord(Object tradeInitiationInstanceAnalysisRecord) {
    this.tradeInitiationInstanceAnalysisRecord = tradeInitiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return tradeInitiationInstanceAnalysisReportType
  **/

  public String getTradeInitiationInstanceAnalysisReportType() {
    return tradeInitiationInstanceAnalysisReportType;
  }

  public void setTradeInitiationInstanceAnalysisReportType(String tradeInitiationInstanceAnalysisReportType) {
    this.tradeInitiationInstanceAnalysisReportType = tradeInitiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return tradeInitiationInstanceAnalysisParameters
  **/

  public String getTradeInitiationInstanceAnalysisParameters() {
    return tradeInitiationInstanceAnalysisParameters;
  }

  public void setTradeInitiationInstanceAnalysisParameters(String tradeInitiationInstanceAnalysisParameters) {
    this.tradeInitiationInstanceAnalysisParameters = tradeInitiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return tradeInitiationInstanceAnalysisReport
  **/

  public Object getTradeInitiationInstanceAnalysisReport() {
    return tradeInitiationInstanceAnalysisReport;
  }

  public void setTradeInitiationInstanceAnalysisReport(Object tradeInitiationInstanceAnalysisReport) {
    this.tradeInitiationInstanceAnalysisReport = tradeInitiationInstanceAnalysisReport;
  }


}

