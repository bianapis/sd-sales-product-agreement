package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SalesProductServiceAgreementResponse
 */
public class SalesProductServiceAgreementResponse   {
  private String salesProductAgreementReference = null;

  private String productServiceType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String legalEntityReference = null;

  private String agreementType = null;

  private String agreementJurisdiction = null;

  private String agreementValidFromToDate = null;

  private String agreementSignaturiesResponsibleParties = null;

  private String documentReference = null;

  private String customerAgreementReference = null;

  private String partyLifecycleManagementReference = null;

  private String customerPrecedentsReference = null;

  private String salesProductAgreement = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return salesProductAgreementReference
  **/

  public String getSalesProductAgreementReference() {
    return salesProductAgreementReference;
  }

  public void setSalesProductAgreementReference(String salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementType
  **/

  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementJurisdiction
  **/

  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return agreementValidFromToDate
  **/

  public String getAgreementValidFromToDate() {
    return agreementValidFromToDate;
  }

  public void setAgreementValidFromToDate(String agreementValidFromToDate) {
    this.agreementValidFromToDate = agreementValidFromToDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return agreementSignaturiesResponsibleParties
  **/

  public String getAgreementSignaturiesResponsibleParties() {
    return agreementSignaturiesResponsibleParties;
  }

  public void setAgreementSignaturiesResponsibleParties(String agreementSignaturiesResponsibleParties) {
    this.agreementSignaturiesResponsibleParties = agreementSignaturiesResponsibleParties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyLifecycleManagementReference
  **/

  public String getPartyLifecycleManagementReference() {
    return partyLifecycleManagementReference;
  }

  public void setPartyLifecycleManagementReference(String partyLifecycleManagementReference) {
    this.partyLifecycleManagementReference = partyLifecycleManagementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerPrecedentsReference
  **/

  public String getCustomerPrecedentsReference() {
    return customerPrecedentsReference;
  }

  public void setCustomerPrecedentsReference(String customerPrecedentsReference) {
    this.customerPrecedentsReference = customerPrecedentsReference;
  }


  /**
   * generalInfo: statement of the product specific in-force terms and conditions `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return salesProductAgreement
  **/

  public String getSalesProductAgreement() {
    return salesProductAgreement;
  }

  public void setSalesProductAgreement(String salesProductAgreement) {
    this.salesProductAgreement = salesProductAgreement;
  }


}

