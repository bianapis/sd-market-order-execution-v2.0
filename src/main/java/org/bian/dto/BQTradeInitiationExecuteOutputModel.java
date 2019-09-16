package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationExecuteOutputModel
 */
public class BQTradeInitiationExecuteOutputModel   {
  private String tradeInitiationExecuteActionTaskReference = null;

  private Object tradeInitiationExecuteActionTaskRecord = null;

  private String tradeInitiationExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Trade Initiation instance execute service call 
   * @return tradeInitiationExecuteActionTaskReference
  **/

  public String getTradeInitiationExecuteActionTaskReference() {
    return tradeInitiationExecuteActionTaskReference;
  }

  public void setTradeInitiationExecuteActionTaskReference(String tradeInitiationExecuteActionTaskReference) {
    this.tradeInitiationExecuteActionTaskReference = tradeInitiationExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return tradeInitiationExecuteActionTaskRecord
  **/

  public Object getTradeInitiationExecuteActionTaskRecord() {
    return tradeInitiationExecuteActionTaskRecord;
  }

  public void setTradeInitiationExecuteActionTaskRecord(Object tradeInitiationExecuteActionTaskRecord) {
    this.tradeInitiationExecuteActionTaskRecord = tradeInitiationExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation execute transaction/record 
   * @return tradeInitiationExecuteRecordReference
  **/

  public String getTradeInitiationExecuteRecordReference() {
    return tradeInitiationExecuteRecordReference;
  }

  public void setTradeInitiationExecuteRecordReference(String tradeInitiationExecuteRecordReference) {
    this.tradeInitiationExecuteRecordReference = tradeInitiationExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

