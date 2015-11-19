package com.example.csr.spongycastlecsr;

import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openssl.jcajce.JcaPEMWriter;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.jcajce.JcaContentSignerBuilder;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.spongycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;
import org.spongycastle.util.io.pem.PemObject;

import java.io.IOException;
import java.io.StringWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.RSAKeyGenParameterSpec;

import javax.security.auth.x500.X500Principal;

/**
 * Created by yewen on 19/11/15.
 */
public class CSR {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static PKCS10CertificationRequest GenerateRequest (KeyPair keypair, String signatureAlgorithm) throws OperatorCreationException {

        PKCS10CertificationRequestBuilder p10Builder = new JcaPKCS10CertificationRequestBuilder(
                new X500Principal("CN=Requested Test Certificate"), keypair.getPublic());
        JcaContentSignerBuilder csBuilder = new JcaContentSignerBuilder(signatureAlgorithm);
        ContentSigner signer = csBuilder.build(keypair.getPrivate());
        PKCS10CertificationRequest csr = p10Builder.build(signer);

        return csr;
    }

    public static String csrToPem (PKCS10CertificationRequest csr) throws IOException {
        PemObject pemObject = new PemObject("CERTIFICATE REQUEST", csr.getEncoded());
        StringWriter str = new StringWriter();
        JcaPEMWriter jacPEMWriter = new JcaPEMWriter(str);
        jacPEMWriter.writeObject(pemObject);
        jacPEMWriter.close();
        str.close();
        return str.toString();
    }

    public static KeyPair RSAKeyPairGeneration(){
       KeyPair keyPair = null;
        try {
            RSAKeyGenParameterSpec rsaKeyGenParameterSpec = new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA","SC");
            keyPairGenerator.initialize(rsaKeyGenParameterSpec);;
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return keyPair;
    }



}
