package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionRequestOutputModelMarketTradeTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRequestOutputModel
 */
public class CRMarketTradeTransactionRequestOutputModel   {
  private CRMarketTradeTransactionRequestOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String marketTradeTransactionRequestActionTaskReference = null;

  private Object marketTradeTransactionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionRequestOutputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionRequestOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Trade Transaction instance request service call 
   * @return marketTradeTransactionRequestActionTaskReference
  **/

  public String getMarketTradeTransactionRequestActionTaskReference() {
    return marketTradeTransactionRequestActionTaskReference;
  }

  public void setMarketTradeTransactionRequestActionTaskReference(String marketTradeTransactionRequestActionTaskReference) {
    this.marketTradeTransactionRequestActionTaskReference = marketTradeTransactionRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

