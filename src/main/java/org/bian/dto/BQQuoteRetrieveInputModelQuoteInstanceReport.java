package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveInputModelQuoteInstanceReport
 */
public class BQQuoteRetrieveInputModelQuoteInstanceReport   {
  private String quoteInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return quoteInstanceReportReference
  **/

  public String getQuoteInstanceReportReference() {
    return quoteInstanceReportReference;
  }

  public void setQuoteInstanceReportReference(String quoteInstanceReportReference) {
    this.quoteInstanceReportReference = quoteInstanceReportReference;
  }


}

