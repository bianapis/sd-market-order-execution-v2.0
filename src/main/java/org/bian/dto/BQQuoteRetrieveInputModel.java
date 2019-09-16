package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuoteRetrieveInputModelQuoteInstanceAnalysis;
import org.bian.dto.BQQuoteRetrieveInputModelQuoteInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveInputModel
 */
public class BQQuoteRetrieveInputModel   {
  private Object quoteRetrieveActionTaskRecord = null;

  private String quoteRetrieveActionRequest = null;

  private BQQuoteRetrieveInputModelQuoteInstanceReport quoteInstanceReport = null;

  private BQQuoteRetrieveInputModelQuoteInstanceAnalysis quoteInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return quoteRetrieveActionTaskRecord
  **/

  public Object getQuoteRetrieveActionTaskRecord() {
    return quoteRetrieveActionTaskRecord;
  }

  public void setQuoteRetrieveActionTaskRecord(Object quoteRetrieveActionTaskRecord) {
    this.quoteRetrieveActionTaskRecord = quoteRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return quoteRetrieveActionRequest
  **/

  public String getQuoteRetrieveActionRequest() {
    return quoteRetrieveActionRequest;
  }

  public void setQuoteRetrieveActionRequest(String quoteRetrieveActionRequest) {
    this.quoteRetrieveActionRequest = quoteRetrieveActionRequest;
  }


  /**
   * Get quoteInstanceReport
   * @return quoteInstanceReport
  **/

  public BQQuoteRetrieveInputModelQuoteInstanceReport getQuoteInstanceReport() {
    return quoteInstanceReport;
  }

  public void setQuoteInstanceReport(BQQuoteRetrieveInputModelQuoteInstanceReport quoteInstanceReport) {
    this.quoteInstanceReport = quoteInstanceReport;
  }


  /**
   * Get quoteInstanceAnalysis
   * @return quoteInstanceAnalysis
  **/

  public BQQuoteRetrieveInputModelQuoteInstanceAnalysis getQuoteInstanceAnalysis() {
    return quoteInstanceAnalysis;
  }

  public void setQuoteInstanceAnalysis(BQQuoteRetrieveInputModelQuoteInstanceAnalysis quoteInstanceAnalysis) {
    this.quoteInstanceAnalysis = quoteInstanceAnalysis;
  }


}

