package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionUpdateOutputModel
 */
public class CRMarketTradeTransactionUpdateOutputModel   {
  private CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String marketTradeTransactionUpdateActionTaskReference = null;

  private Object marketTradeTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionUpdateInputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return marketTradeTransactionUpdateActionTaskReference
  **/

  public String getMarketTradeTransactionUpdateActionTaskReference() {
    return marketTradeTransactionUpdateActionTaskReference;
  }

  public void setMarketTradeTransactionUpdateActionTaskReference(String marketTradeTransactionUpdateActionTaskReference) {
    this.marketTradeTransactionUpdateActionTaskReference = marketTradeTransactionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return marketTradeTransactionUpdateActionTaskRecord
  **/

  public Object getMarketTradeTransactionUpdateActionTaskRecord() {
    return marketTradeTransactionUpdateActionTaskRecord;
  }

  public void setMarketTradeTransactionUpdateActionTaskRecord(Object marketTradeTransactionUpdateActionTaskRecord) {
    this.marketTradeTransactionUpdateActionTaskRecord = marketTradeTransactionUpdateActionTaskRecord;
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

