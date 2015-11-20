package com.example.csr.spongycastlecsr;

import android.test.AndroidTestCase;
import android.util.Log;

import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/**
 * Created by yewen on 20/11/15.
 */
public class CertificateUtilsTest extends AndroidTestCase {

    public static final String TEST_CERT_VALIDATION = "CERT_VAL";
    public final String X509 = "X.509";

    public void testValidateCertificate() throws Exception {
        ArrayList<Certificate> CA;
        ArrayList<Certificate> intermediateCert;
        ArrayList<Certificate> entity;

        InputStream inputRoot = getContext().getResources().openRawResource(R.raw.root);
        CertificateFactory certificateFactory = CertificateFactory.getInstance(X509);
        CA = new ArrayList<>(certificateFactory.generateCertificates(inputRoot));
        inputRoot.close();

        inputRoot = getContext().getResources().openRawResource(R.raw.intermediate);
        intermediateCert = new ArrayList<>(certificateFactory.generateCertificates(inputRoot));
        inputRoot.close();

        inputRoot = getContext().getResources().openRawResource(R.raw.wikipedia);
        entity = new ArrayList<>(certificateFactory.generateCertificates(inputRoot));
        inputRoot.close();

        PKIXCertPathValidatorResult result = CertificateUtils.validateCertificate(
                (X509Certificate)entity.get(0),
                (X509Certificate)intermediateCert.get(0),
                (X509Certificate)CA.get(0)
        );

        Log.v(TEST_CERT_VALIDATION,result.toString());
    }
}