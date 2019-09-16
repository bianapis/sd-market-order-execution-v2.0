package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord
 */
public class BQTradeInitiationInitiateOutputModelTradeInitiationInstanceRecord   {
  private String wholesaleTradeReference = null;

  private String marketTradeTransactionInstanceProcessingStatus = null;

  private String marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: If the market trade is not executed against the bank position, but directly in the wholesale market, this refers to the actual wholesale trading record 
   * @return wholesaleTradeReference
  **/

  public String getWholesaleTradeReference() {
    return wholesaleTradeReference;
  }

  public void setWholesaleTradeReference(String wholesaleTradeReference) {
    this.wholesaleTradeReference = wholesaleTradeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked and returned processing status of the market trade (e.g. pending, partially complete, complete) 
   * @return marketTradeTransactionInstanceProcessingStatus
  **/

  public String getMarketTradeTransactionInstanceProcessingStatus() {
    return marketTradeTransactionInstanceProcessingStatus;
  }

  public void setMarketTradeTransactionInstanceProcessingStatus(String marketTradeTransactionInstanceProcessingStatus) {
    this.marketTradeTransactionInstanceProcessingStatus = marketTradeTransactionInstanceProcessingStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the market trade initiation task 
   * @return marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements
  **/

  public String getMarketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements() {
    return marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements;
  }

  public void setMarketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements(String marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements) {
    this.marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements = marketTradeInitiationTaskResultThisincludesalldetailsofthetradeneededtoclearandsettlethemarketorderincludingsecuritiescustodyarrangements;
  }


}

