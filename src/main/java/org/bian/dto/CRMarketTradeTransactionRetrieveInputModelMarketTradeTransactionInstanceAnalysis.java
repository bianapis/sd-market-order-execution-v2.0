package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis
 */
public class CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis   {
  private String marketTradeTransactionInstanceAnalysisReference = null;

  private String marketTradeTransactionInstanceAnalysisReportType = null;

  private String marketTradeTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return marketTradeTransactionInstanceAnalysisReference
  **/

  public String getMarketTradeTransactionInstanceAnalysisReference() {
    return marketTradeTransactionInstanceAnalysisReference;
  }

  public void setMarketTradeTransactionInstanceAnalysisReference(String marketTradeTransactionInstanceAnalysisReference) {
    this.marketTradeTransactionInstanceAnalysisReference = marketTradeTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return marketTradeTransactionInstanceAnalysisParameters
  **/

  public String getMarketTradeTransactionInstanceAnalysisParameters() {
    return marketTradeTransactionInstanceAnalysisParameters;
  }

  public void setMarketTradeTransactionInstanceAnalysisParameters(String marketTradeTransactionInstanceAnalysisParameters) {
    this.marketTradeTransactionInstanceAnalysisParameters = marketTradeTransactionInstanceAnalysisParameters;
  }


}

