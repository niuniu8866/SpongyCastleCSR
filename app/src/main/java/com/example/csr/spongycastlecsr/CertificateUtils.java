package com.example.csr.spongycastlecsr;


import org.spongycastle.jce.provider.BouncyCastleProvider;

import java.security.PublicKey;
import java.security.Security;
import java.security.cert.X509Certificate;

/**
 * Created by dev on 19/11/15.
 */
public class CertificateUtils {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static PublicKey extractPublicKeyFromCertificate(X509Certificate certificate){

        PublicKey publicKey = certificate.getPublicKey();
        return publicKey;
    }
}
