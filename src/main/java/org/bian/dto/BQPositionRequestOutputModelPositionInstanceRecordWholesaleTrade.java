package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPositionRequestOutputModelPositionInstanceRecordWholesaleTrade
 */
public class BQPositionRequestOutputModelPositionInstanceRecordWholesaleTrade   {
  private String wholesaleTradeSecurityType = null;

  private String wholesaleTradeVolume = null;

  private String wholesaleTradePrice = null;

  private String wholesaleTradeClearingandSettlementTerms = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String correspondenceInstanceReference = null;

  private String wholesaleTradeStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The traded security 
   * @return wholesaleTradeSecurityType
  **/

  public String getWholesaleTradeSecurityType() {
    return wholesaleTradeSecurityType;
  }

  public void setWholesaleTradeSecurityType(String wholesaleTradeSecurityType) {
    this.wholesaleTradeSecurityType = wholesaleTradeSecurityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The volume of share bought/sold 
   * @return wholesaleTradeVolume
  **/

  public String getWholesaleTradeVolume() {
    return wholesaleTradeVolume;
  }

  public void setWholesaleTradeVolume(String wholesaleTradeVolume) {
    this.wholesaleTradeVolume = wholesaleTradeVolume;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The security and cash flow details of the trade 
   * @return wholesaleTradePrice
  **/

  public String getWholesaleTradePrice() {
    return wholesaleTradePrice;
  }

  public void setWholesaleTradePrice(String wholesaleTradePrice) {
    this.wholesaleTradePrice = wholesaleTradePrice;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The terms covering the clearing and settlement of the trade 
   * @return wholesaleTradeClearingandSettlementTerms
  **/

  public String getWholesaleTradeClearingandSettlementTerms() {
    return wholesaleTradeClearingandSettlementTerms;
  }

  public void setWholesaleTradeClearingandSettlementTerms(String wholesaleTradeClearingandSettlementTerms) {
    this.wholesaleTradeClearingandSettlementTerms = wholesaleTradeClearingandSettlementTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for the trade confirmation notice 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated for the trade confirmation 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status tracking for the wholesale trade 
   * @return wholesaleTradeStatus
  **/

  public String getWholesaleTradeStatus() {
    return wholesaleTradeStatus;
  }

  public void setWholesaleTradeStatus(String wholesaleTradeStatus) {
    this.wholesaleTradeStatus = wholesaleTradeStatus;
  }


}

