package com.example.csr.spongycastlecsr;


import org.spongycastle.jce.provider.BouncyCastleProvider;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static List<Certificate> loadCertificates(String [] pemEncodedCerts) throws Exception {

        List<Certificate> certList = new ArrayList<>();
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");

        for (String certPem : pemEncodedCerts) {
            InputStream certIn = new ByteArrayInputStream(certPem.getBytes());
            Certificate cert = certFactory.generateCertificate(certIn);
            certList.add(cert);
        }

        return certList;
    }

    public static CertPath loadCertPath(String [] pemEncodedCerts) throws Exception {

        List<Certificate> certList = CertificateUtils.loadCertificates(pemEncodedCerts);

        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        return certFactory.generateCertPath(certList);
    }

    public static PKIXCertPathValidatorResult validateCertificate (X509Certificate entity,X509Certificate intermediate, X509Certificate CA) throws Exception {
      /*  KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null, null);
        String alias = "validationCA";
        ks.setCertificateEntry(alias, CA);

      *//*  KeyStore intermediatesStore = KeyStore.getInstance(KeyStore.getDefaultType());
        intermediatesStore.load(null, null);
        String alias_intermediate = "validationIntermediate";
        intermediatesStore.setCertificateEntry(alias_intermediate, intermediate);*//*


        X509CertSelector target = new X509CertSelector();
        target.setCertificate(entity);
        PKIXBuilderParameters params = new PKIXBuilderParameters(ks, target);
        ArrayList<X509Certificate> chain = new ArrayList<>();
        chain.add(intermediate);
        chain.add(intermediate);
        CertStoreParameters intermediates = new CollectionCertStoreParameters(chain);
        params.addCertStore(CertStore.getInstance("Collection", intermediates));
        CertPathBuilder builder = CertPathBuilder.getInstance("PKIX");
*//*
 * If build() returns successfully, the certificate is valid. More details
 * about the valid path can be obtained through the PKIXBuilderResult.
 * If no valid path can be found, a CertPathBuilderException is thrown.
 *//*
        PKIXCertPathBuilderResult result = (PKIXCertPathBuilderResult)builder.build(params);
        return result;*/

        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        CertPath certPath = certificateFactory.generateCertPath(Arrays.asList(new X509Certificate[]{entity, intermediate}));



        TrustAnchor trustAnchor = new TrustAnchor(CA,null);

        CertPathValidator cpv = CertPathValidator.getInstance("PKIX");

        PKIXParameters pkixParams = new PKIXParameters(
                Collections.singleton(trustAnchor));
        pkixParams.setRevocationEnabled(true);

        return (PKIXCertPathValidatorResult)cpv.validate(certPath,pkixParams);
    }




}
