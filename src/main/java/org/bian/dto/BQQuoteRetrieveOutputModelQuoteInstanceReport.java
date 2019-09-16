package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveOutputModelQuoteInstanceReport
 */
public class BQQuoteRetrieveOutputModelQuoteInstanceReport   {
  private Object quoteInstanceReportRecord = null;

  private String quoteInstanceReportType = null;

  private String quoteInstanceReportParameters = null;

  private Object quoteInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return quoteInstanceReportRecord
  **/

  public Object getQuoteInstanceReportRecord() {
    return quoteInstanceReportRecord;
  }

  public void setQuoteInstanceReportRecord(Object quoteInstanceReportRecord) {
    this.quoteInstanceReportRecord = quoteInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return quoteInstanceReportType
  **/

  public String getQuoteInstanceReportType() {
    return quoteInstanceReportType;
  }

  public void setQuoteInstanceReportType(String quoteInstanceReportType) {
    this.quoteInstanceReportType = quoteInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return quoteInstanceReportParameters
  **/

  public String getQuoteInstanceReportParameters() {
    return quoteInstanceReportParameters;
  }

  public void setQuoteInstanceReportParameters(String quoteInstanceReportParameters) {
    this.quoteInstanceReportParameters = quoteInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return quoteInstanceReport
  **/

  public Object getQuoteInstanceReport() {
    return quoteInstanceReport;
  }

  public void setQuoteInstanceReport(Object quoteInstanceReport) {
    this.quoteInstanceReport = quoteInstanceReport;
  }


}

