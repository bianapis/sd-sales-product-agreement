/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SalesProductAgreementApiServiceImpl implements SalesProductAgreementApiService {

	public SalesProductServiceAgreementEvaluationResponse evaluate(SalesProductServiceAgreementBase request){
		return JsonReader.read("evaluate-SalesProductServiceAgreementEvaluationResponse.json",new TypeReference<SalesProductServiceAgreementEvaluationResponse>(){});
	}
	
	public SalesProductServiceAgreementResponse initiate(SalesProductServiceAgreementBase request){
		return JsonReader.read("initiate-SalesProductServiceAgreementResponse.json",new TypeReference<SalesProductServiceAgreementResponse>(){});
	}
	
	public SalesProductServiceAgreementLegalTermsResponse initiateLegalTerms(String crReferenceId, SalesProductServiceLegalTermRequest request){
		return JsonReader.read("initiate-SalesProductServiceAgreementLegalTermsResponse.json",new TypeReference<SalesProductServiceAgreementLegalTermsResponse>(){});
	}
	
	public SalesProductServiceAgreementPolicyTermsResponse initiatePolicyTerms(String crReferenceId, PolicyTermRequest request){
		return JsonReader.read("initiate-SalesProductServiceAgreementPolicyTermsResponse.json",new TypeReference<SalesProductServiceAgreementPolicyTermsResponse>(){});
	}
	
	public SalesProductServiceAgreementRegulatoryTermsResponse initiateRegulatoryTerms(String crReferenceId, RegulatoryTermRequest request){
		return JsonReader.read("initiate-SalesProductServiceAgreementRegulatoryTermsResponse.json",new TypeReference<SalesProductServiceAgreementRegulatoryTermsResponse>(){});
	}
	
	public SalesProductServiceAgreementResponse requestPost(SalesProductServiceAgreementBase request){
		return JsonReader.read("requestPost-SalesProductServiceAgreementResponse.json",new TypeReference<SalesProductServiceAgreementResponse>(){});
	}
	
	public SalesProductServiceAgreementResponse requestPut(String crReferenceId, SalesProductServiceAgreementBase request){
		return JsonReader.read("requestPut-SalesProductServiceAgreementResponse.json",new TypeReference<SalesProductServiceAgreementResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SalesProductServiceAgreementResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-SalesProductServiceAgreementResponse.json",new TypeReference<SalesProductServiceAgreementResponse>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public SalesProductServiceAgreementLegalTermsResponse retrieveLegalTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SalesProductServiceAgreementLegalTermsResponse.json",new TypeReference<SalesProductServiceAgreementLegalTermsResponse>(){});
	}
	
	public SalesProductServiceAgreementPolicyTermsResponse retrievePolicyTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SalesProductServiceAgreementPolicyTermsResponse.json",new TypeReference<SalesProductServiceAgreementPolicyTermsResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SalesProductServiceAgreementRegulatoryTermsResponse retrieveRegulatoryTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SalesProductServiceAgreementRegulatoryTermsResponse.json",new TypeReference<SalesProductServiceAgreementRegulatoryTermsResponse>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public SalesProductServiceAgreementResponse update(String crReferenceId, SalesProductServiceAgreementBase request){
		return JsonReader.read("update-SalesProductServiceAgreementResponse.json",new TypeReference<SalesProductServiceAgreementResponse>(){});
	}
	
}
