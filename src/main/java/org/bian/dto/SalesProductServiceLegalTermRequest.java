package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SalesProductServiceLegalTermRequest
 */
public class SalesProductServiceLegalTermRequest   {
  private Object salesProductLegalTermRecord = null;

  private String jurisdiction = null;

  private String applicableLawReference = null;

  private String applicableLawInterpretation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return salesProductLegalTermRecord
  **/

  public Object getSalesProductLegalTermRecord() {
    return salesProductLegalTermRecord;
  }

  public void setSalesProductLegalTermRecord(Object salesProductLegalTermRecord) {
    this.salesProductLegalTermRecord = salesProductLegalTermRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return jurisdiction
  **/

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return applicableLawReference
  **/

  public String getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(String applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return applicableLawInterpretation
  **/

  public String getApplicableLawInterpretation() {
    return applicableLawInterpretation;
  }

  public void setApplicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
  }


}

