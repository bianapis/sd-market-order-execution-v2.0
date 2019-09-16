package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationUpdateOutputModel
 */
public class BQTradeInitiationUpdateOutputModel   {
  private String tradeInitiationUpdateActionTaskReference = null;

  private Object tradeInitiationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return tradeInitiationUpdateActionTaskReference
  **/

  public String getTradeInitiationUpdateActionTaskReference() {
    return tradeInitiationUpdateActionTaskReference;
  }

  public void setTradeInitiationUpdateActionTaskReference(String tradeInitiationUpdateActionTaskReference) {
    this.tradeInitiationUpdateActionTaskReference = tradeInitiationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return tradeInitiationUpdateActionTaskRecord
  **/

  public Object getTradeInitiationUpdateActionTaskRecord() {
    return tradeInitiationUpdateActionTaskRecord;
  }

  public void setTradeInitiationUpdateActionTaskRecord(Object tradeInitiationUpdateActionTaskRecord) {
    this.tradeInitiationUpdateActionTaskRecord = tradeInitiationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

