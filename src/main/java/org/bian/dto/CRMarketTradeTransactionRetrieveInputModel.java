package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis;
import org.bian.dto.CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveInputModel
 */
public class CRMarketTradeTransactionRetrieveInputModel   {
  private Object marketTradeTransactionRetrieveActionTaskRecord = null;

  private String marketTradeTransactionRetrieveActionRequest = null;

  private CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord marketTradeTransactionInstanceReportRecord = null;

  private CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis marketTradeTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return marketTradeTransactionRetrieveActionTaskRecord
  **/

  public Object getMarketTradeTransactionRetrieveActionTaskRecord() {
    return marketTradeTransactionRetrieveActionTaskRecord;
  }

  public void setMarketTradeTransactionRetrieveActionTaskRecord(Object marketTradeTransactionRetrieveActionTaskRecord) {
    this.marketTradeTransactionRetrieveActionTaskRecord = marketTradeTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return marketTradeTransactionRetrieveActionRequest
  **/

  public String getMarketTradeTransactionRetrieveActionRequest() {
    return marketTradeTransactionRetrieveActionRequest;
  }

  public void setMarketTradeTransactionRetrieveActionRequest(String marketTradeTransactionRetrieveActionRequest) {
    this.marketTradeTransactionRetrieveActionRequest = marketTradeTransactionRetrieveActionRequest;
  }


  /**
   * Get marketTradeTransactionInstanceReportRecord
   * @return marketTradeTransactionInstanceReportRecord
  **/

  public CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord getMarketTradeTransactionInstanceReportRecord() {
    return marketTradeTransactionInstanceReportRecord;
  }

  public void setMarketTradeTransactionInstanceReportRecord(CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceReportRecord marketTradeTransactionInstanceReportRecord) {
    this.marketTradeTransactionInstanceReportRecord = marketTradeTransactionInstanceReportRecord;
  }


  /**
   * Get marketTradeTransactionInstanceAnalysis
   * @return marketTradeTransactionInstanceAnalysis
  **/

  public CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis getMarketTradeTransactionInstanceAnalysis() {
    return marketTradeTransactionInstanceAnalysis;
  }

  public void setMarketTradeTransactionInstanceAnalysis(CRMarketTradeTransactionRetrieveInputModelMarketTradeTransactionInstanceAnalysis marketTradeTransactionInstanceAnalysis) {
    this.marketTradeTransactionInstanceAnalysis = marketTradeTransactionInstanceAnalysis;
  }


}

