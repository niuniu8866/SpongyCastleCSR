package com.example.csr.spongycastlecsr;

import android.util.Base64;
import android.util.Log;

import junit.framework.TestCase;

import org.spongycastle.pkcs.PKCS10CertificationRequest;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.KeyPair;

/**
 * Created by yewen on 19/11/15.
 */
public class CSRTest extends TestCase {


    private static final String TEST = "CSR_TEST";
    public void testGenerateRequest() throws Exception {

        KeyPair keyPair = CSR.RSAKeyPairGeneration();
        PKCS10CertificationRequest csr = CSR.GenerateRequest(keyPair, "SHA256withRSA");
        String csrInPem = CSR.csrToPem(csr);
        Log.v(TEST,"The csr detail is: \n"+csrInPem);
    }

    public void testCsrToPem() throws Exception {


    }

    public void testRSAKeyPairGeneration() throws Exception {

        KeyPair keyPair = CSR.RSAKeyPairGeneration();
        Log.v(TEST,"The Private Key is " + Base64.encodeToString(keyPair.getPrivate().getEncoded(),Base64.NO_PADDING));
        Log.v(TEST,"The Public Key is " + Base64.encodeToString(keyPair.getPublic().getEncoded(),Base64.NO_PADDING));
    }


    public void testEncoding() throws Exception {

        KeyPair keyPair = CSR.RSAKeyPairGeneration();
        PKCS10CertificationRequest csr = CSR.GenerateRequest(keyPair, "SHA256withRSA");
        String csrInPem = CSR.csrToPem(csr);
        String data = URLEncoder.encode(csrInPem, "UTF-8");
        String decode_data = URLDecoder.decode(data, "UTF-8");
        Log.v(TEST,"The csr detail is: \n"+csrInPem);
        Log.v(TEST,data);
        Log.v(TEST,decode_data);

    }
}