/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SalesProductAgreementApiService {

	SalesProductServiceAgreementEvaluationResponse evaluate(SalesProductServiceAgreementBase request);
	
	SalesProductServiceAgreementResponse initiate(SalesProductServiceAgreementBase request);
	
	SalesProductServiceAgreementLegalTermsResponse initiateLegalTerms(String crReferenceId, SalesProductServiceLegalTermRequest request);
	
	SalesProductServiceAgreementPolicyTermsResponse initiatePolicyTerms(String crReferenceId, PolicyTermRequest request);
	
	SalesProductServiceAgreementRegulatoryTermsResponse initiateRegulatoryTerms(String crReferenceId, RegulatoryTermRequest request);
	
	SalesProductServiceAgreementResponse requestPost(SalesProductServiceAgreementBase request);
	
	SalesProductServiceAgreementResponse requestPut(String crReferenceId, SalesProductServiceAgreementBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	SalesProductServiceAgreementResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	SalesProductServiceAgreementLegalTermsResponse retrieveLegalTerms(String crReferenceId, String bqReferenceId);
	
	SalesProductServiceAgreementPolicyTermsResponse retrievePolicyTerms(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	SalesProductServiceAgreementRegulatoryTermsResponse retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	SalesProductServiceAgreementResponse update(String crReferenceId, SalesProductServiceAgreementBase request);
	
}
