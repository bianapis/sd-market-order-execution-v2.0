package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade
 */
public class BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade   {
  private String wholesaleTradeClearingandSettlementTerms = null;

  private String wholesaleTradeStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The terms covering the clearing and settlement of the trade 
   * @return wholesaleTradeClearingandSettlementTerms
  **/

  public String getWholesaleTradeClearingandSettlementTerms() {
    return wholesaleTradeClearingandSettlementTerms;
  }

  public void setWholesaleTradeClearingandSettlementTerms(String wholesaleTradeClearingandSettlementTerms) {
    this.wholesaleTradeClearingandSettlementTerms = wholesaleTradeClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status tracking for the wholesale trade 
   * @return wholesaleTradeStatus
  **/

  public String getWholesaleTradeStatus() {
    return wholesaleTradeStatus;
  }

  public void setWholesaleTradeStatus(String wholesaleTradeStatus) {
    this.wholesaleTradeStatus = wholesaleTradeStatus;
  }


}

