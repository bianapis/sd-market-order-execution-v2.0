package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRetrieveOutputModelPositionInstanceRecordWholesaleTrade;

import javax.validation.Valid;
  
/**
 * BQPositionRetrieveOutputModelPositionInstanceRecord
 */
public class BQPositionRetrieveOutputModelPositionInstanceRecord   {
  private String bankSecurityPositionSecurityType = null;

  private String positionMarketOrderTradeInitiationInstanceReference = null;

  private Object bankSecurityPositionSecurityPLRecord = null;

  private BQPositionRetrieveOutputModelPositionInstanceRecordWholesaleTrade wholesaleTrade = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The security that the bank position is traded for 
   * @return bankSecurityPositionSecurityType
  **/

  public String getBankSecurityPositionSecurityType() {
    return bankSecurityPositionSecurityType;
  }

  public void setBankSecurityPositionSecurityType(String bankSecurityPositionSecurityType) {
    this.bankSecurityPositionSecurityType = bankSecurityPositionSecurityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to market trades impacting the position during the current trading period 
   * @return positionMarketOrderTradeInitiationInstanceReference
  **/

  public String getPositionMarketOrderTradeInitiationInstanceReference() {
    return positionMarketOrderTradeInitiationInstanceReference;
  }

  public void setPositionMarketOrderTradeInitiationInstanceReference(String positionMarketOrderTradeInitiationInstanceReference) {
    this.positionMarketOrderTradeInitiationInstanceReference = positionMarketOrderTradeInitiationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated record of trading activity against the position during the trading period, including the derived position P&L 
   * @return bankSecurityPositionSecurityPLRecord
  **/

  public Object getBankSecurityPositionSecurityPLRecord() {
    return bankSecurityPositionSecurityPLRecord;
  }

  public void setBankSecurityPositionSecurityPLRecord(Object bankSecurityPositionSecurityPLRecord) {
    this.bankSecurityPositionSecurityPLRecord = bankSecurityPositionSecurityPLRecord;
  }


  /**
   * Get wholesaleTrade
   * @return wholesaleTrade
  **/

  public BQPositionRetrieveOutputModelPositionInstanceRecordWholesaleTrade getWholesaleTrade() {
    return wholesaleTrade;
  }

  public void setWholesaleTrade(BQPositionRetrieveOutputModelPositionInstanceRecordWholesaleTrade wholesaleTrade) {
    this.wholesaleTrade = wholesaleTrade;
  }


}

