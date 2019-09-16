package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransactionDateType;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction
 */
public class CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction   {
  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private String currentAccountFulfillmentArrangementInstanceReference = null;

  private String marketOrderType = null;

  private String securityType = null;

  private String amount = null;

  private CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransactionDateType dateType = null;

  private String marketOrderTradeInitiationInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the underlying investment account supporting the transaction 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the underlying cash account supporting the transaction 
   * @return currentAccountFulfillmentArrangementInstanceReference
  **/

  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of market order (e.g. Day Order. Order on Open/Close, Fill or Kill, Limit Order) 
   * @return marketOrderType
  **/

  public String getMarketOrderType() {
    return marketOrderType;
  }

  public void setMarketOrderType(String marketOrderType) {
    this.marketOrderType = marketOrderType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The security to be traded 
   * @return securityType
  **/

  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The volume of shares to be bought or sold. This can include different amount types - quoted/committed, traded etc.) 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransactionDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRMarketTradeTransactionInitiateInputModelMarketTradeTransactionInstanceRecordMarketOrderTransactionDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated market trade if the order is executed in the market directly 
   * @return marketOrderTradeInitiationInstanceReference
  **/

  public String getMarketOrderTradeInitiationInstanceReference() {
    return marketOrderTradeInitiationInstanceReference;
  }

  public void setMarketOrderTradeInitiationInstanceReference(String marketOrderTradeInitiationInstanceReference) {
    this.marketOrderTradeInitiationInstanceReference = marketOrderTradeInitiationInstanceReference;
  }


}

