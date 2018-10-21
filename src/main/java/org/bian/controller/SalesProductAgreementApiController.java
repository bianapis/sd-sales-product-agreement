/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class SalesProductAgreementApiController {

	@Autowired
	SalesProductAgreementApiService service;
	
	@AgreeTerms.Evaluate
	public BianResponse<SalesProductServiceAgreementEvaluationResponse> evaluate(@RequestBody BianRequest<SalesProductServiceAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@AgreeTerms.Initiate
	public BianResponse<SalesProductServiceAgreementResponse> initiate(@RequestBody BianRequest<SalesProductServiceAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Initiate
	public BianResponse<SalesProductServiceAgreementLegalTermsResponse> initiateLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SalesProductServiceLegalTermRequest> bianRequest) {
		return BianResponse.forSuccess(service.initiateLegalTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Initiate
	public BianResponse<SalesProductServiceAgreementPolicyTermsResponse> initiatePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PolicyTermRequest> bianRequest) {
		return BianResponse.forSuccess(service.initiatePolicyTerms(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Initiate
	public BianResponse<SalesProductServiceAgreementRegulatoryTermsResponse> initiateRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryTermRequest> bianRequest) {
		return BianResponse.forSuccess(service.initiateRegulatoryTerms(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPost
	public BianResponse<SalesProductServiceAgreementResponse> requestPost(@RequestBody BianRequest<SalesProductServiceAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@AgreeTerms.RequestPut
	public BianResponse<SalesProductServiceAgreementResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SalesProductServiceAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<SalesProductServiceAgreementResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("legal-terms")
	@AgreeTerms.Retrieve
	public BianResponse<SalesProductServiceAgreementLegalTermsResponse> retrieveLegalTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLegalTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("policy-terms")
	@AgreeTerms.Retrieve
	public BianResponse<SalesProductServiceAgreementPolicyTermsResponse> retrievePolicyTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePolicyTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("regulatory-terms")
	@AgreeTerms.Retrieve
	public BianResponse<SalesProductServiceAgreementRegulatoryTermsResponse> retrieveRegulatoryTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegulatoryTerms(crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<SalesProductServiceAgreementResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SalesProductServiceAgreementBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
