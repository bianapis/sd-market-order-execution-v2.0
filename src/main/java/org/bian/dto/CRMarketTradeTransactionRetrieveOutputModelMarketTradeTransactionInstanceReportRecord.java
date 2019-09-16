package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord
 */
public class CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord   {
  private String marketTradeTransactionInstanceReportData = null;

  private String marketTradeTransactionInstanceReportType = null;

  private Object marketTradeTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return marketTradeTransactionInstanceReportData
  **/

  public String getMarketTradeTransactionInstanceReportData() {
    return marketTradeTransactionInstanceReportData;
  }

  public void setMarketTradeTransactionInstanceReportData(String marketTradeTransactionInstanceReportData) {
    this.marketTradeTransactionInstanceReportData = marketTradeTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return marketTradeTransactionInstanceReport
  **/

  public Object getMarketTradeTransactionInstanceReport() {
    return marketTradeTransactionInstanceReport;
  }

  public void setMarketTradeTransactionInstanceReport(Object marketTradeTransactionInstanceReport) {
    this.marketTradeTransactionInstanceReport = marketTradeTransactionInstanceReport;
  }


}

