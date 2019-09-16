package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRequestInputModelPositionInstanceRecord;
import org.bian.dto.CRMarketTradeTransactionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPositionRequestInputModel
 */
public class BQPositionRequestInputModel   {
  private String marketTradeTransactionInstanceReference = null;

  private String positionInstanceReference = null;

  private BQPositionRequestInputModelPositionInstanceRecord positionInstanceRecord = null;

  private Object positionRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Position instance 
   * @return positionInstanceReference
  **/

  public String getPositionInstanceReference() {
    return positionInstanceReference;
  }

  public void setPositionInstanceReference(String positionInstanceReference) {
    this.positionInstanceReference = positionInstanceReference;
  }


  /**
   * Get positionInstanceRecord
   * @return positionInstanceRecord
  **/

  public BQPositionRequestInputModelPositionInstanceRecord getPositionInstanceRecord() {
    return positionInstanceRecord;
  }

  public void setPositionInstanceRecord(BQPositionRequestInputModelPositionInstanceRecord positionInstanceRecord) {
    this.positionInstanceRecord = positionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return positionRequestActionTaskRecord
  **/

  public Object getPositionRequestActionTaskRecord() {
    return positionRequestActionTaskRecord;
  }

  public void setPositionRequestActionTaskRecord(Object positionRequestActionTaskRecord) {
    this.positionRequestActionTaskRecord = positionRequestActionTaskRecord;
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

