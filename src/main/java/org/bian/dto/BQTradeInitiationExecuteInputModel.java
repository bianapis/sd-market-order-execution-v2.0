package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationExecuteInputModel
 */
public class BQTradeInitiationExecuteInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private Object tradeInitiationExecuteActionTaskRecord = null;

  private BQTradeInitiationExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Market Trade Transaction instance 
   * @return marketTradeTransactionInstanceReference
  **/

  public String getMarketTradeTransactionInstanceReference() {
    return marketTradeTransactionInstanceReference;
  }

  public void setMarketTradeTransactionInstanceReference(String marketTradeTransactionInstanceReference) {
    this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Trade Initiation instance 
   * @return tradeInitiationInstanceReference
  **/

  public String getTradeInitiationInstanceReference() {
    return tradeInitiationInstanceReference;
  }

  public void setTradeInitiationInstanceReference(String tradeInitiationInstanceReference) {
    this.tradeInitiationInstanceReference = tradeInitiationInstanceReference;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQTradeInitiationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQTradeInitiationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

