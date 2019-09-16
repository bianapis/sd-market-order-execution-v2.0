package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteInitiateInputModelQuoteInstanceRecord
 */
public class BQQuoteInitiateInputModelQuoteInstanceRecord   {
  private String quoteSecurityType = null;

  private String quoteType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The security for which the quote is provided 
   * @return quoteSecurityType
  **/

  public String getQuoteSecurityType() {
    return quoteSecurityType;
  }

  public void setQuoteSecurityType(String quoteSecurityType) {
    this.quoteSecurityType = quoteSecurityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of quote being provided (e.g. current market, bank committed) 
   * @return quoteType
  **/

  public String getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(String quoteType) {
    this.quoteType = quoteType;
  }


}

