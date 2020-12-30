package com.thoughtworks.wallet.healthy.service.v2;

import com.thoughtworks.wallet.healthy.dto.v2.VerifierRequest;
import com.thoughtworks.wallet.healthy.dto.v2.VerifierResponse;
import com.thoughtworks.wallet.healthy.dto.v2.VerifierVcResponse;
import com.thoughtworks.wallet.healthy.dto.v2.VerifierVcTypesRequest;

import java.io.IOException;

public interface IVerifierService {
    VerifierResponse createVerifier(VerifierRequest verifierRequest);
    VerifierResponse getVerifierById(Integer id);
    VerifierResponse updateVerifierVcTypes(Integer id, VerifierVcTypesRequest request);
    VerifierVcResponse getVerifierVc(Integer id) throws IOException;
}
