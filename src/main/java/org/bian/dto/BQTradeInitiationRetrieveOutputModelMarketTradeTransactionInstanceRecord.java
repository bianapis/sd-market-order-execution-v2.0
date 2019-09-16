package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecord
 */
public class BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecord   {
  private String marketOrderTransactionInstanceReference = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerMarketOrderProcessingInstruction = null;

  private BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction marketOrderTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the market order that is to be executed in the markets 
   * @return marketOrderTransactionInstanceReference
  **/

  public String getMarketOrderTransactionInstanceReference() {
    return marketOrderTransactionInstanceReference;
  }

  public void setMarketOrderTransactionInstanceReference(String marketOrderTransactionInstanceReference) {
    this.marketOrderTransactionInstanceReference = marketOrderTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner for the market order 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The employee/business unit placing the market order 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any customer specific processing preferences or requirements 
   * @return customerMarketOrderProcessingInstruction
  **/

  public String getCustomerMarketOrderProcessingInstruction() {
    return customerMarketOrderProcessingInstruction;
  }

  public void setCustomerMarketOrderProcessingInstruction(String customerMarketOrderProcessingInstruction) {
    this.customerMarketOrderProcessingInstruction = customerMarketOrderProcessingInstruction;
  }


  /**
   * Get marketOrderTransaction
   * @return marketOrderTransaction
  **/

  public BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction getMarketOrderTransaction() {
    return marketOrderTransaction;
  }

  public void setMarketOrderTransaction(BQTradeInitiationRetrieveOutputModelMarketTradeTransactionInstanceRecordMarketOrderTransaction marketOrderTransaction) {
    this.marketOrderTransaction = marketOrderTransaction;
  }


}

