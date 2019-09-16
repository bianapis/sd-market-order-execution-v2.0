package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuoteRetrieveInputModelQuoteInstanceAnalysis
 */
public class BQQuoteRetrieveInputModelQuoteInstanceAnalysis   {
  private String quoteInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return quoteInstanceAnalysisReference
  **/

  public String getQuoteInstanceAnalysisReference() {
    return quoteInstanceAnalysisReference;
  }

  public void setQuoteInstanceAnalysisReference(String quoteInstanceAnalysisReference) {
    this.quoteInstanceAnalysisReference = quoteInstanceAnalysisReference;
  }


}

