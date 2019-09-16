package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveOutputModelQuoteInstanceAnalysis
 */
public class BQQuoteRetrieveOutputModelQuoteInstanceAnalysis   {
  private Object quoteInstanceAnalysisRecord = null;

  private String quoteInstanceAnalysisReportType = null;

  private String quoteInstanceAnalysisParameters = null;

  private Object quoteInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return quoteInstanceAnalysisRecord
  **/

  public Object getQuoteInstanceAnalysisRecord() {
    return quoteInstanceAnalysisRecord;
  }

  public void setQuoteInstanceAnalysisRecord(Object quoteInstanceAnalysisRecord) {
    this.quoteInstanceAnalysisRecord = quoteInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return quoteInstanceAnalysisReportType
  **/

  public String getQuoteInstanceAnalysisReportType() {
    return quoteInstanceAnalysisReportType;
  }

  public void setQuoteInstanceAnalysisReportType(String quoteInstanceAnalysisReportType) {
    this.quoteInstanceAnalysisReportType = quoteInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return quoteInstanceAnalysisParameters
  **/

  public String getQuoteInstanceAnalysisParameters() {
    return quoteInstanceAnalysisParameters;
  }

  public void setQuoteInstanceAnalysisParameters(String quoteInstanceAnalysisParameters) {
    this.quoteInstanceAnalysisParameters = quoteInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return quoteInstanceAnalysisReport
  **/

  public Object getQuoteInstanceAnalysisReport() {
    return quoteInstanceAnalysisReport;
  }

  public void setQuoteInstanceAnalysisReport(Object quoteInstanceAnalysisReport) {
    this.quoteInstanceAnalysisReport = quoteInstanceAnalysisReport;
  }


}

