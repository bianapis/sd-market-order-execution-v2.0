package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade;

import javax.validation.Valid;
  
/**
 * BQPositionRequestInputModelPositionInstanceRecord
 */
public class BQPositionRequestInputModelPositionInstanceRecord   {
  private String bankSecurityPositionSecurityType = null;

  private String positionMarketOrderTradeInitiationInstanceReference = null;

  private BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade wholesaleTrade = null;


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
   * Get wholesaleTrade
   * @return wholesaleTrade
  **/

  public BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade getWholesaleTrade() {
    return wholesaleTrade;
  }

  public void setWholesaleTrade(BQPositionRequestInputModelPositionInstanceRecordWholesaleTrade wholesaleTrade) {
    this.wholesaleTrade = wholesaleTrade;
  }


}

