package com.example.csr.spongycastlecsr;

import android.util.Log;

import junit.framework.TestCase;

import org.spongycastle.pkcs.PKCS10CertificationRequest;

import java.security.KeyPair;

/**
 * Created by yewen on 19/11/15.
 */
public class CSRTest extends TestCase {


    private static final String TEST = "CSR_TEST";
    public void testGenerateRequest() throws Exception {

        KeyPair keyPair = CSR.RSAKeyPairGeneration();
        PKCS10CertificationRequest csr = CSR.GenerateRequest(keyPair,"SHA256withRSA");
        String csrInPem = CSR.csrToPem(csr);
        Log.v(TEST,"The csr detail is: \n"+csrInPem);
    }

    public void testCsrToPem() throws Exception {


    }

    public void testRSAKeyPairGeneration() throws Exception {

        KeyPair keyPair = CSR.RSAKeyPairGeneration();
        Log.v(TEST,"The Private Key is " + new String(keyPair.getPrivate().getEncoded()));
        Log.v(TEST,"The Public Key is " + new String(keyPair.getPublic().getEncoded()));
    }
}