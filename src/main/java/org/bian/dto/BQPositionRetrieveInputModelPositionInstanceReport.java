package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveInputModelPositionInstanceReport
 */
public class BQPositionRetrieveInputModelPositionInstanceReport   {
  private String positionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return positionInstanceReportReference
  **/

  public String getPositionInstanceReportReference() {
    return positionInstanceReportReference;
  }

  public void setPositionInstanceReportReference(String positionInstanceReportReference) {
    this.positionInstanceReportReference = positionInstanceReportReference;
  }


}

