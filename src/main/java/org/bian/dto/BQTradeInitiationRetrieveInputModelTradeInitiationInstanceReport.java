package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport
 */
public class BQTradeInitiationRetrieveInputModelTradeInitiationInstanceReport   {
  private String tradeInitiationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return tradeInitiationInstanceReportReference
  **/

  public String getTradeInitiationInstanceReportReference() {
    return tradeInitiationInstanceReportReference;
  }

  public void setTradeInitiationInstanceReportReference(String tradeInitiationInstanceReportReference) {
    this.tradeInitiationInstanceReportReference = tradeInitiationInstanceReportReference;
  }


}

