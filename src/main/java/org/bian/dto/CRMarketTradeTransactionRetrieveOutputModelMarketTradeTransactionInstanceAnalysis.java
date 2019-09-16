package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis
 */
public class CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis   {
  private String marketTradeTransactionInstanceAnalysisData = null;

  private String marketTradeTransactionInstanceAnalysisReportType = null;

  private Object marketTradeTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return marketTradeTransactionInstanceAnalysisData
  **/

  public String getMarketTradeTransactionInstanceAnalysisData() {
    return marketTradeTransactionInstanceAnalysisData;
  }

  public void setMarketTradeTransactionInstanceAnalysisData(String marketTradeTransactionInstanceAnalysisData) {
    this.marketTradeTransactionInstanceAnalysisData = marketTradeTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return marketTradeTransactionInstanceAnalysisReportType
  **/

  public String getMarketTradeTransactionInstanceAnalysisReportType() {
    return marketTradeTransactionInstanceAnalysisReportType;
  }

  public void setMarketTradeTransactionInstanceAnalysisReportType(String marketTradeTransactionInstanceAnalysisReportType) {
    this.marketTradeTransactionInstanceAnalysisReportType = marketTradeTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return marketTradeTransactionInstanceAnalysisReport
  **/

  public Object getMarketTradeTransactionInstanceAnalysisReport() {
    return marketTradeTransactionInstanceAnalysisReport;
  }

  public void setMarketTradeTransactionInstanceAnalysisReport(Object marketTradeTransactionInstanceAnalysisReport) {
    this.marketTradeTransactionInstanceAnalysisReport = marketTradeTransactionInstanceAnalysisReport;
  }


}

