package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SalesProductServiceAgreementRegulatoryTermsResponse
 */
public class SalesProductServiceAgreementRegulatoryTermsResponse   {
  private String salesProductAgreementRegulatoryTermReference = null;

  private String salesProductAgreementRegulatoryTermRecord = null;

  private String regulatoryAuthority = null;

  private String applicableRegulationReference = null;

  private String applicableRegulationInterpretation = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return salesProductAgreementRegulatoryTermReference
  **/

  public String getSalesProductAgreementRegulatoryTermReference() {
    return salesProductAgreementRegulatoryTermReference;
  }

  public void setSalesProductAgreementRegulatoryTermReference(String salesProductAgreementRegulatoryTermReference) {
    this.salesProductAgreementRegulatoryTermReference = salesProductAgreementRegulatoryTermReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return salesProductAgreementRegulatoryTermRecord
  **/

  public String getSalesProductAgreementRegulatoryTermRecord() {
    return salesProductAgreementRegulatoryTermRecord;
  }

  public void setSalesProductAgreementRegulatoryTermRecord(String salesProductAgreementRegulatoryTermRecord) {
    this.salesProductAgreementRegulatoryTermRecord = salesProductAgreementRegulatoryTermRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return regulatoryAuthority
  **/

  public String getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public void setRegulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return applicableRegulationReference
  **/

  public String getApplicableRegulationReference() {
    return applicableRegulationReference;
  }

  public void setApplicableRegulationReference(String applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return applicableRegulationInterpretation
  **/

  public String getApplicableRegulationInterpretation() {
    return applicableRegulationInterpretation;
  }

  public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
  }


}

