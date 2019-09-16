package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord
 */
public class CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord   {
  private String marketTradeTransactionInstanceReportReference = null;

  private String marketTradeTransactionInstanceReportType = null;

  private String marketTradeTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return marketTradeTransactionInstanceReportReference
  **/

  public String getMarketTradeTransactionInstanceReportReference() {
    return marketTradeTransactionInstanceReportReference;
  }

  public void setMarketTradeTransactionInstanceReportReference(String marketTradeTransactionInstanceReportReference) {
    this.marketTradeTransactionInstanceReportReference = marketTradeTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return marketTradeTransactionInstanceReportType
  **/

  public String getMarketTradeTransactionInstanceReportType() {
    return marketTradeTransactionInstanceReportType;
  }

  public void setMarketTradeTransactionInstanceReportType(String marketTradeTransactionInstanceReportType) {
    this.marketTradeTransactionInstanceReportType = marketTradeTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return marketTradeTransactionInstanceReportParameters
  **/

  public String getMarketTradeTransactionInstanceReportParameters() {
    return marketTradeTransactionInstanceReportParameters;
  }

  public void setMarketTradeTransactionInstanceReportParameters(String marketTradeTransactionInstanceReportParameters) {
    this.marketTradeTransactionInstanceReportParameters = marketTradeTransactionInstanceReportParameters;
  }


}

