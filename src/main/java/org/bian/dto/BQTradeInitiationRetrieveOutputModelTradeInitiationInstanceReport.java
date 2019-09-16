package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport
 */
public class BQTradeInitiationRetrieveOutputModelTradeInitiationInstanceReport   {
  private Object tradeInitiationInstanceReportRecord = null;

  private String tradeInitiationInstanceReportType = null;

  private String tradeInitiationInstanceReportParameters = null;

  private Object tradeInitiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return tradeInitiationInstanceReportRecord
  **/

  public Object getTradeInitiationInstanceReportRecord() {
    return tradeInitiationInstanceReportRecord;
  }

  public void setTradeInitiationInstanceReportRecord(Object tradeInitiationInstanceReportRecord) {
    this.tradeInitiationInstanceReportRecord = tradeInitiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return tradeInitiationInstanceReportType
  **/

  public String getTradeInitiationInstanceReportType() {
    return tradeInitiationInstanceReportType;
  }

  public void setTradeInitiationInstanceReportType(String tradeInitiationInstanceReportType) {
    this.tradeInitiationInstanceReportType = tradeInitiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return tradeInitiationInstanceReportParameters
  **/

  public String getTradeInitiationInstanceReportParameters() {
    return tradeInitiationInstanceReportParameters;
  }

  public void setTradeInitiationInstanceReportParameters(String tradeInitiationInstanceReportParameters) {
    this.tradeInitiationInstanceReportParameters = tradeInitiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return tradeInitiationInstanceReport
  **/

  public Object getTradeInitiationInstanceReport() {
    return tradeInitiationInstanceReport;
  }

  public void setTradeInitiationInstanceReport(Object tradeInitiationInstanceReport) {
    this.tradeInitiationInstanceReport = tradeInitiationInstanceReport;
  }


}

