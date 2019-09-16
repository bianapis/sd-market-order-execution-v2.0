package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis;
import org.bian.dto.BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveInputModel
 */
public class BQTradeInitiationRetrieveInputModel   {
  private Object tradeInitiationRetrieveActionTaskRecord = null;

  private String tradeInitiationRetrieveActionRequest = null;

  private BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport tradeInitiationInstanceReport = null;

  private BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return tradeInitiationRetrieveActionTaskRecord
  **/

  public Object getTradeInitiationRetrieveActionTaskRecord() {
    return tradeInitiationRetrieveActionTaskRecord;
  }

  public void setTradeInitiationRetrieveActionTaskRecord(Object tradeInitiationRetrieveActionTaskRecord) {
    this.tradeInitiationRetrieveActionTaskRecord = tradeInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return tradeInitiationRetrieveActionRequest
  **/

  public String getTradeInitiationRetrieveActionRequest() {
    return tradeInitiationRetrieveActionRequest;
  }

  public void setTradeInitiationRetrieveActionRequest(String tradeInitiationRetrieveActionRequest) {
    this.tradeInitiationRetrieveActionRequest = tradeInitiationRetrieveActionRequest;
  }


  /**
   * Get tradeInitiationInstanceReport
   * @return tradeInitiationInstanceReport
  **/

  public BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport getTradeInitiationInstanceReport() {
    return tradeInitiationInstanceReport;
  }

  public void setTradeInitiationInstanceReport(BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport tradeInitiationInstanceReport) {
    this.tradeInitiationInstanceReport = tradeInitiationInstanceReport;
  }


  /**
   * Get tradeInitiationInstanceAnalysis
   * @return tradeInitiationInstanceAnalysis
  **/

  public BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis getTradeInitiationInstanceAnalysis() {
    return tradeInitiationInstanceAnalysis;
  }

  public void setTradeInitiationInstanceAnalysis(BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis tradeInitiationInstanceAnalysis) {
    this.tradeInitiationInstanceAnalysis = tradeInitiationInstanceAnalysis;
  }


}

