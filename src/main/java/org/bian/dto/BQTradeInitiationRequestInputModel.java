package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRequestInputModel
 */
public class BQTradeInitiationRequestInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String tradeInitiationInstanceReference = null;

  private Object tradeInitiationRequestActionTaskRecord = null;

  private CRMarketTradeTransactionRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return tradeInitiationRequestActionTaskRecord
  **/

  public Object getTradeInitiationRequestActionTaskRecord() {
    return tradeInitiationRequestActionTaskRecord;
  }

  public void setTradeInitiationRequestActionTaskRecord(Object tradeInitiationRequestActionTaskRecord) {
    this.tradeInitiationRequestActionTaskRecord = tradeInitiationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRMarketTradeTransactionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRMarketTradeTransactionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

