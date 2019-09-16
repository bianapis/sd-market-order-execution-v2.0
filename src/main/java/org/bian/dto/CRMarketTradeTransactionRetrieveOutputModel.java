package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis;
import org.bian.dto.CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceRecord;
import org.bian.dto.CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMarketTradeTransactionRetrieveOutputModel
 */
public class CRMarketTradeTransactionRetrieveOutputModel   {
  private CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord = null;

  private String marketTradeTransactionRetrieveActionTaskReference = null;

  private Object marketTradeTransactionRetrieveActionTaskRecord = null;

  private String marketTradeTransactionRetrieveActionResponse = null;

  private CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord marketTradeTransactionInstanceReportRecord = null;

  private CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis marketTradeTransactionInstanceAnalysis = null;


  /**
   * Get marketTradeTransactionInstanceRecord
   * @return marketTradeTransactionInstanceRecord
  **/

  public CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceRecord getMarketTradeTransactionInstanceRecord() {
    return marketTradeTransactionInstanceRecord;
  }

  public void setMarketTradeTransactionInstanceRecord(CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceRecord marketTradeTransactionInstanceRecord) {
    this.marketTradeTransactionInstanceRecord = marketTradeTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Trade Transaction instance retrieve service call 
   * @return marketTradeTransactionRetrieveActionTaskReference
  **/

  public String getMarketTradeTransactionRetrieveActionTaskReference() {
    return marketTradeTransactionRetrieveActionTaskReference;
  }

  public void setMarketTradeTransactionRetrieveActionTaskReference(String marketTradeTransactionRetrieveActionTaskReference) {
    this.marketTradeTransactionRetrieveActionTaskReference = marketTradeTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return marketTradeTransactionRetrieveActionTaskRecord
  **/

  public Object getMarketTradeTransactionRetrieveActionTaskRecord() {
    return marketTradeTransactionRetrieveActionTaskRecord;
  }

  public void setMarketTradeTransactionRetrieveActionTaskRecord(Object marketTradeTransactionRetrieveActionTaskRecord) {
    this.marketTradeTransactionRetrieveActionTaskRecord = marketTradeTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return marketTradeTransactionRetrieveActionResponse
  **/

  public String getMarketTradeTransactionRetrieveActionResponse() {
    return marketTradeTransactionRetrieveActionResponse;
  }

  public void setMarketTradeTransactionRetrieveActionResponse(String marketTradeTransactionRetrieveActionResponse) {
    this.marketTradeTransactionRetrieveActionResponse = marketTradeTransactionRetrieveActionResponse;
  }


  /**
   * Get marketTradeTransactionInstanceReportRecord
   * @return marketTradeTransactionInstanceReportRecord
  **/

  public CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord getMarketTradeTransactionInstanceReportRecord() {
    return marketTradeTransactionInstanceReportRecord;
  }

  public void setMarketTradeTransactionInstanceReportRecord(CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceReportRecord marketTradeTransactionInstanceReportRecord) {
    this.marketTradeTransactionInstanceReportRecord = marketTradeTransactionInstanceReportRecord;
  }


  /**
   * Get marketTradeTransactionInstanceAnalysis
   * @return marketTradeTransactionInstanceAnalysis
  **/

  public CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis getMarketTradeTransactionInstanceAnalysis() {
    return marketTradeTransactionInstanceAnalysis;
  }

  public void setMarketTradeTransactionInstanceAnalysis(CRMarketTradeTransactionRetrieveOutputModelMarketTradeTransactionInstanceAnalysis marketTradeTransactionInstanceAnalysis) {
    this.marketTradeTransactionInstanceAnalysis = marketTradeTransactionInstanceAnalysis;
  }


}

