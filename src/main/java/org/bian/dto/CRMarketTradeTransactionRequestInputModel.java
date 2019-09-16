package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionRequestInputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.CRMarketTradeTransactionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRequestInputModel
 */
public class CRMarketTradeTransactionRequestInputModel   {
  private String marketOrderExecutionServicingSessionReference = null;

  private String marketTradeTransactionInstanceReference = null;

  private CRMarketTradeTransactionRequestInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private Object marketTradeTransactionRequestActionTaskRecord = null;

  private CRMarketTradeTransactionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return marketOrderExecutionServicingSessionReference
  **/

  public String getMarketOrderExecutionServicingSessionReference() {
    return marketOrderExecutionServicingSessionReference;
  }

  public void setMarketOrderExecutionServicingSessionReference(String marketOrderExecutionServicingSessionReference) {
    this.marketOrderExecutionServicingSessionReference = marketOrderExecutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Trade Transaction instance 
   * @return marketTradeTransactionInstanceReference
  **/

  public String getMarketTradeTransactionInstanceReference() {
    return marketTradeTransactionInstanceReference;
  }

  public void setMarketTradeTransactionInstanceReference(String marketTradeTransactionInstanceReference) {
    this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
  }


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionRequestInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionRequestInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return marketTradeTransactionRequestActionTaskRecord
  **/

  public Object getMarketTradeTransactionRequestActionTaskRecord() {
    return marketTradeTransactionRequestActionTaskRecord;
  }

  public void setMarketTradeTransactionRequestActionTaskRecord(Object marketTradeTransactionRequestActionTaskRecord) {
    this.marketTradeTransactionRequestActionTaskRecord = marketTradeTransactionRequestActionTaskRecord;
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

