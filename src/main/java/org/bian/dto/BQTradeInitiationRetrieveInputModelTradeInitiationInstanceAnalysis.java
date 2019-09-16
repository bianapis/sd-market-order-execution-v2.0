package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis
 */
public class BQTradeInitiationRetrieveInputModelTradeInitiationInstanceAnalysis   {
  private String tradeInitiationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return tradeInitiationInstanceAnalysisReference
  **/

  public String getTradeInitiationInstanceAnalysisReference() {
    return tradeInitiationInstanceAnalysisReference;
  }

  public void setTradeInitiationInstanceAnalysisReference(String tradeInitiationInstanceAnalysisReference) {
    this.tradeInitiationInstanceAnalysisReference = tradeInitiationInstanceAnalysisReference;
  }


}

