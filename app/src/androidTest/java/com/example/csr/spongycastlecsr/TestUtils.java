package com.example.csr.spongycastlecsr;

/**
 * Created by dev on 20/11/15.
 */
public class TestUtils {

    public static final String TEST_WIKIPEDIA_ENTITY[] =
            {
                    /**
                     *  Data:
                     Version: 3 (0x2)
                     Serial Number:
                     11:21:e7:df:d9:cf:1c:5e:9a:d5:9f:41:5f:6d:a9:1f:e2:4b
                     Signature Algorithm: sha256WithRSAEncryption
                     Issuer: C=BE, O=GlobalSign nv-sa, CN=GlobalSign Organization Validation CA - SHA256 - G2
                     Validity
                     Not Before: Jun 23 18:37:07 2015 GMT
                     Not After : Feb 19 12:00:00 2017 GMT
                     Subject: C=US, ST=California, L=San Francisco, O=Wikimedia Foundation, Inc., CN=*.wikipedia.org
                     Subject Public Key Info:
                     Public Key Algorithm: id-ecPublicKey
                     EC Public Key:
                     pub:
                     04:6b:3f:ad:07:e8:95:cf:f0:9a:28:ec:c2:dd:37:
                     7f:7d:30:d8:c6:83:71:73:b4:dc:df:c5:80:98:4a:
                     a3:32:5d:db:f5:f1:17:32:5f:0c:c0:be:95:8a:cc:
                     14:a0:4e:6c:b2:4d:98:65:8b:69:f8:45:e3:e7:92:
                     78:05:25:1a:d2
                     ASN1 OID: prime256v1
                     X509v3 extensions:
                     X509v3 Key Usage: critical
                     Digital Signature, Key Encipherment
                     X509v3 Certificate Policies:
                     Policy: 2.23.140.1.2.2
                     CPS: https://www.globalsign.com/repository/

                     X509v3 Subject Alternative Name:
                     DNS:*.wikipedia.org, DNS:*.mediawiki.org, DNS:*.wikibooks.org, DNS:*.wikidata.org, DNS:*.wikimedia.org, DNS:*.wikimediafoundation.org, DNS:*.wikinews.org, DNS:*.wikiquote.org, DNS:*.wikisource.org, DNS:*.wikiversity.org, DNS:*.wikivoyage.org, DNS:*.wiktionary.org, DNS:*.m.mediawiki.org, DNS:*.m.wikipedia.org, DNS:*.m.wikibooks.org, DNS:*.m.wikidata.org, DNS:*.m.wikimedia.org, DNS:*.m.wikimediafoundation.org, DNS:*.m.wikinews.org, DNS:*.m.wikiquote.org, DNS:*.m.wikisource.org, DNS:*.m.wikiversity.org, DNS:*.m.wikivoyage.org, DNS:*.m.wiktionary.org, DNS:*.zero.wikipedia.org, DNS:mediawiki.org, DNS:wikibooks.org, DNS:wikidata.org, DNS:wikimedia.org, DNS:wikimediafoundation.org, DNS:wikinews.org, DNS:wikiquote.org, DNS:wikisource.org, DNS:wikiversity.org, DNS:wikivoyage.org, DNS:wiktionary.org, DNS:wikipedia.org
                     X509v3 Basic Constraints:
                     CA:FALSE
                     X509v3 Extended Key Usage:
                     TLS Web Server Authentication, TLS Web Client Authentication
                     X509v3 CRL Distribution Points:
                     URI:http://crl.globalsign.com/gs/gsorganizationvalsha2g2.crl

                     Authority Information Access:
                     CA Issuers - URI:http://secure.globalsign.com/cacert/gsorganizationvalsha2g2r1.crt
                     OCSP - URI:http://ocsp2.globalsign.com/gsorganizationvalsha2g2

                     X509v3 Subject Key Identifier:
                     08:BF:CD:A9:EE:0F:EA:30:D3:32:6B:2D:DF:FF:64:A4:CC:8B:23:F7
                     X509v3 Authority Key Identifier:
                     keyid:96:DE:61:F1:BD:1C:16:29:53:1C:C0:CC:7D:3B:83:00:40:E6:1A:7C

                     */

                    "-----BEGIN CERTIFICATE-----\n" +
                            "MIIHCzCCBfOgAwIBAgISESHn39nPHF6a1Z9BX22pH+JLMA0GCSqGSIb3DQEBCwUA\n" +
                            "MGYxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9iYWxTaWduIG52LXNhMTwwOgYD\n" +
                            "VQQDEzNHbG9iYWxTaWduIE9yZ2FuaXphdGlvbiBWYWxpZGF0aW9uIENBIC0gU0hB\n" +
                            "MjU2IC0gRzIwHhcNMTUwNjIzMTgzNzA3WhcNMTcwMjE5MTIwMDAwWjB5MQswCQYD\n" +
                            "VQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNU2FuIEZyYW5j\n" +
                            "aXNjbzEjMCEGA1UEChMaV2lraW1lZGlhIEZvdW5kYXRpb24sIEluYy4xGDAWBgNV\n" +
                            "BAMMDyoud2lraXBlZGlhLm9yZzBZMBMGByqGSM49AgEGCCqGSM49AwEHA0IABGs/\n" +
                            "rQfolc/wmijswt03f30w2MaDcXO03N/FgJhKozJd2/XxFzJfDMC+lYrMFKBObLJN\n" +
                            "mGWLafhF4+eSeAUlGtKjggRpMIIEZTAOBgNVHQ8BAf8EBAMCBaAwSQYDVR0gBEIw\n" +
                            "QDA+BgZngQwBAgIwNDAyBggrBgEFBQcCARYmaHR0cHM6Ly93d3cuZ2xvYmFsc2ln\n" +
                            "bi5jb20vcmVwb3NpdG9yeS8wggKuBgNVHREEggKlMIICoYIPKi53aWtpcGVkaWEu\n" +
                            "b3Jngg8qLm1lZGlhd2lraS5vcmeCDyoud2lraWJvb2tzLm9yZ4IOKi53aWtpZGF0\n" +
                            "YS5vcmeCDyoud2lraW1lZGlhLm9yZ4IZKi53aWtpbWVkaWFmb3VuZGF0aW9uLm9y\n" +
                            "Z4IOKi53aWtpbmV3cy5vcmeCDyoud2lraXF1b3RlLm9yZ4IQKi53aWtpc291cmNl\n" +
                            "Lm9yZ4IRKi53aWtpdmVyc2l0eS5vcmeCECoud2lraXZveWFnZS5vcmeCECoud2lr\n" +
                            "dGlvbmFyeS5vcmeCESoubS5tZWRpYXdpa2kub3JnghEqLm0ud2lraXBlZGlhLm9y\n" +
                            "Z4IRKi5tLndpa2lib29rcy5vcmeCECoubS53aWtpZGF0YS5vcmeCESoubS53aWtp\n" +
                            "bWVkaWEub3JnghsqLm0ud2lraW1lZGlhZm91bmRhdGlvbi5vcmeCECoubS53aWtp\n" +
                            "bmV3cy5vcmeCESoubS53aWtpcXVvdGUub3JnghIqLm0ud2lraXNvdXJjZS5vcmeC\n" +
                            "EyoubS53aWtpdmVyc2l0eS5vcmeCEioubS53aWtpdm95YWdlLm9yZ4ISKi5tLndp\n" +
                            "a3Rpb25hcnkub3JnghQqLnplcm8ud2lraXBlZGlhLm9yZ4INbWVkaWF3aWtpLm9y\n" +
                            "Z4INd2lraWJvb2tzLm9yZ4IMd2lraWRhdGEub3Jngg13aWtpbWVkaWEub3Jnghd3\n" +
                            "aWtpbWVkaWFmb3VuZGF0aW9uLm9yZ4IMd2lraW5ld3Mub3Jngg13aWtpcXVvdGUu\n" +
                            "b3Jngg53aWtpc291cmNlLm9yZ4IPd2lraXZlcnNpdHkub3Jngg53aWtpdm95YWdl\n" +
                            "Lm9yZ4IOd2lrdGlvbmFyeS5vcmeCDXdpa2lwZWRpYS5vcmcwCQYDVR0TBAIwADAd\n" +
                            "BgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwSQYDVR0fBEIwQDA+oDygOoY4\n" +
                            "aHR0cDovL2NybC5nbG9iYWxzaWduLmNvbS9ncy9nc29yZ2FuaXphdGlvbnZhbHNo\n" +
                            "YTJnMi5jcmwwgaAGCCsGAQUFBwEBBIGTMIGQME0GCCsGAQUFBzAChkFodHRwOi8v\n" +
                            "c2VjdXJlLmdsb2JhbHNpZ24uY29tL2NhY2VydC9nc29yZ2FuaXphdGlvbnZhbHNo\n" +
                            "YTJnMnIxLmNydDA/BggrBgEFBQcwAYYzaHR0cDovL29jc3AyLmdsb2JhbHNpZ24u\n" +
                            "Y29tL2dzb3JnYW5pemF0aW9udmFsc2hhMmcyMB0GA1UdDgQWBBQIv82p7g/qMNMy\n" +
                            "ay3f/2SkzIsj9zAfBgNVHSMEGDAWgBSW3mHxvRwWKVMcwMx9O4MAQOYafDANBgkq\n" +
                            "hkiG9w0BAQsFAAOCAQEAA3V77aY1cA+RdRiC2Z+nZDYwF2VIDth/u1fAy2/46hzK\n" +
                            "JvfP6UqvQW3ET1k/STKiFrLUdGht++PwxyN7JU2tPl4AbiY1c4x/zvUeY+s/vS2k\n" +
                            "+ylBNyD0D+CO1w+RSUMla2VAZCpG+rdw0YLE9MOuB6lPDWRDnwBAIE0DyEXiy4EZ\n" +
                            "f/cdExNQD9tegzQgLxMlgBZvxrSaIMkI3PcbVKEXrmPReGRxYavSppP/ep59rdCw\n" +
                            "zm3/xJ+UrnPplc6BaiYwFr6Kcsv8FblQguqjjIXE+alriol94AddVB99ztUmgDNW\n" +
                            "lH1Ofu1m2VAcAVZlTbxEodI0dT8qgFET7Zlvh6ic8Q==\n" +
                            "-----END CERTIFICATE-----"
            };

    public static final String TEST_GLOBAL_SIGN_INTERMEDIATE[] = {

            /**
             * Data:
             Version: 3 (0x2)
             Serial Number:
             04:00:00:00:00:01:44:4e:f0:42:47
             Signature Algorithm: sha256WithRSAEncryption
             Issuer: C=BE, O=GlobalSign nv-sa, OU=Root CA, CN=GlobalSign Root CA
             Validity
             Not Before: Feb 20 10:00:00 2014 GMT
             Not After : Feb 20 10:00:00 2024 GMT
             Subject: C=BE, O=GlobalSign nv-sa, CN=GlobalSign Organization Validation CA - SHA256 - G2
             Subject Public Key Info:
             Public Key Algorithm: rsaEncryption
             RSA Public Key: (2048 bit)
             Modulus (2048 bit):
             00:c7:0e:6c:3f:23:93:7f:cc:70:a5:9d:20:c3:0e:
             53:3f:7e:c0:4e:c2:98:49:ca:47:d5:23:ef:03:34:
             85:74:c8:a3:02:2e:46:5c:0b:7d:c9:88:9d:4f:8b:
             f0:f8:9c:6c:8c:55:35:db:bf:f2:b3:ea:fb:e3:56:
             e7:4a:46:d9:13:22:ca:36:d5:9b:c1:a8:e3:96:43:
             93:f2:0c:bc:e6:f9:e6:e8:99:c8:63:48:78:7f:57:
             36:69:1a:19:1d:5a:d1:d4:7d:c2:9c:d4:7f:e1:80:
             12:ae:7a:ea:88:ea:57:d8:ca:0a:0a:3a:12:49:a2:
             62:19:7a:0d:24:f7:37:eb:b4:73:92:7b:05:23:9b:
             12:b5:ce:eb:29:df:a4:14:02:b9:01:a5:d4:a6:9c:
             43:64:88:de:f8:7e:fe:e3:f5:1e:e5:fe:dc:a3:a8:
             e4:66:31:d9:4c:25:e9:18:b9:89:59:09:ae:e9:9d:
             1c:6d:37:0f:4a:1e:35:20:28:e2:af:d4:21:8b:01:
             c4:45:ad:6e:2b:63:ab:92:6b:61:0a:4d:20:ed:73:
             ba:7c:ce:fe:16:b5:db:9f:80:f0:d6:8b:6c:d9:08:
             79:4a:4f:78:65:da:92:bc:be:35:f9:b3:c4:f9:27:
             80:4e:ff:96:52:e6:02:20:e1:07:73:e9:5d:2b:bd:
             b2:f1
             Exponent: 65537 (0x10001)
             X509v3 extensions:
             X509v3 Key Usage: critical
             Certificate Sign, CRL Sign
             X509v3 Basic Constraints: critical
             CA:TRUE, pathlen:0
             X509v3 Subject Key Identifier:
             96:DE:61:F1:BD:1C:16:29:53:1C:C0:CC:7D:3B:83:00:40:E6:1A:7C
             X509v3 Certificate Policies:
             Policy: X509v3 Any Policy
             CPS: https://www.globalsign.com/repository/

             X509v3 CRL Distribution Points:
             URI:http://crl.globalsign.net/root.crl

             Authority Information Access:
             OCSP - URI:http://ocsp.globalsign.com/rootr1

             X509v3 Authority Key Identifier:
             keyid:60:7B:66:1A:45:0D:97:CA:89:50:2F:7D:04:CD:34:A8:FF:FC:FD:4B

             Signature Algorithm: sha256WithRSAEncryption
             46:2a:ee:5e:bd:ae:01:60:37:31:11:86:71:74:b6:46:49:c8:
             10:16:fe:2f:62:23:17:ab:1f:87:f8:82:ed:ca:df:0e:2c:df:
             64:75:8e:e5:18:72:a7:8c:3a:8b:c9:ac:a5:77:50:f7:ef:9e:
             a4:e0:a0:8f:14:57:a3:2a:5f:ec:7e:6d:10:e6:ba:8d:b0:08:
             87:76:0e:4c:b2:d9:51:bb:11:02:f2:5c:dd:1c:bd:f3:55:96:
             0f:d4:06:c0:fc:e2:23:8a:24:70:d3:bb:f0:79:1a:a7:61:70:
             83:8a:af:06:c5:20:d8:a1:63:d0:6c:ae:4f:32:d7:ae:7c:18:
             45:75:05:29:77:df:42:40:64:64:86:be:2a:76:09:31:6f:1d:
             24:f4:99:d0:85:fe:f2:21:08:f9:c6:f6:f1:d0:59:ed:d6:56:
             3c:08:28:03:67:ba:f0:f9:f1:90:16:47:ae:67:e6:bc:80:48:
             e9:42:76:34:97:55:69:24:0e:83:d6:a0:2d:b4:f5:f3:79:8a:
             49:28:74:1a:41:a1:c2:d3:24:88:35:30:60:94:17:b4:e1:04:
             22:31:3d:3b:2f:17:06:b2:b8:9d:86:2b:5a:69:ef:83:f5:4b:
             c4:aa:b4:2a:f8:7c:a1:b1:85:94:8c:f4:0c:87:0c:f4:ac:40:
             f8:59:49:98

             */

            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIEaTCCA1GgAwIBAgILBAAAAAABRE7wQkcwDQYJKoZIhvcNAQELBQAwVzELMAkG\n" +
                    "A1UEBhMCQkUxGTAXBgNVBAoTEEdsb2JhbFNpZ24gbnYtc2ExEDAOBgNVBAsTB1Jv\n" +
                    "b3QgQ0ExGzAZBgNVBAMTEkdsb2JhbFNpZ24gUm9vdCBDQTAeFw0xNDAyMjAxMDAw\n" +
                    "MDBaFw0yNDAyMjAxMDAwMDBaMGYxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9i\n" +
                    "YWxTaWduIG52LXNhMTwwOgYDVQQDEzNHbG9iYWxTaWduIE9yZ2FuaXphdGlvbiBW\n" +
                    "YWxpZGF0aW9uIENBIC0gU0hBMjU2IC0gRzIwggEiMA0GCSqGSIb3DQEBAQUAA4IB\n" +
                    "DwAwggEKAoIBAQDHDmw/I5N/zHClnSDDDlM/fsBOwphJykfVI+8DNIV0yKMCLkZc\n" +
                    "C33JiJ1Pi/D4nGyMVTXbv/Kz6vvjVudKRtkTIso21ZvBqOOWQ5PyDLzm+ebomchj\n" +
                    "SHh/VzZpGhkdWtHUfcKc1H/hgBKueuqI6lfYygoKOhJJomIZeg0k9zfrtHOSewUj\n" +
                    "mxK1zusp36QUArkBpdSmnENkiN74fv7j9R7l/tyjqORmMdlMJekYuYlZCa7pnRxt\n" +
                    "Nw9KHjUgKOKv1CGLAcRFrW4rY6uSa2EKTSDtc7p8zv4WtdufgPDWi2zZCHlKT3hl\n" +
                    "2pK8vjX5s8T5J4BO/5ZS5gIg4Qdz6V0rvbLxAgMBAAGjggElMIIBITAOBgNVHQ8B\n" +
                    "Af8EBAMCAQYwEgYDVR0TAQH/BAgwBgEB/wIBADAdBgNVHQ4EFgQUlt5h8b0cFilT\n" +
                    "HMDMfTuDAEDmGnwwRwYDVR0gBEAwPjA8BgRVHSAAMDQwMgYIKwYBBQUHAgEWJmh0\n" +
                    "dHBzOi8vd3d3Lmdsb2JhbHNpZ24uY29tL3JlcG9zaXRvcnkvMDMGA1UdHwQsMCow\n" +
                    "KKAmoCSGImh0dHA6Ly9jcmwuZ2xvYmFsc2lnbi5uZXQvcm9vdC5jcmwwPQYIKwYB\n" +
                    "BQUHAQEEMTAvMC0GCCsGAQUFBzABhiFodHRwOi8vb2NzcC5nbG9iYWxzaWduLmNv\n" +
                    "bS9yb290cjEwHwYDVR0jBBgwFoAUYHtmGkUNl8qJUC99BM00qP/8/UswDQYJKoZI\n" +
                    "hvcNAQELBQADggEBAEYq7l69rgFgNzERhnF0tkZJyBAW/i9iIxerH4f4gu3K3w4s\n" +
                    "32R1juUYcqeMOovJrKV3UPfvnqTgoI8UV6MqX+x+bRDmuo2wCId2Dkyy2VG7EQLy\n" +
                    "XN0cvfNVlg/UBsD84iOKJHDTu/B5GqdhcIOKrwbFINihY9Bsrk8y1658GEV1BSl3\n" +
                    "30JAZGSGvip2CTFvHST0mdCF/vIhCPnG9vHQWe3WVjwIKANnuvD58ZAWR65n5ryA\n" +
                    "SOlCdjSXVWkkDoPWoC209fN5ikkodBpBocLTJIg1MGCUF7ThBCIxPTsvFwayuJ2G\n" +
                    "K1pp74P1S8SqtCr4fKGxhZSM9AyHDPSsQPhZSZg=\n" +
                    "-----END CERTIFICATE---"

    };

    public static final String TEST_GLOBAL_SIGN_ROOT[] = {
            /**
             *  Data:
             Version: 3 (0x2)
             Serial Number:
             04:00:00:00:00:01:15:4b:5a:c3:94
             Signature Algorithm: sha1WithRSAEncryption
             Issuer: C=BE, O=GlobalSign nv-sa, OU=Root CA, CN=GlobalSign Root CA
             Validity
             Not Before: Sep  1 12:00:00 1998 GMT
             Not After : Jan 28 12:00:00 2028 GMT
             Subject: C=BE, O=GlobalSign nv-sa, OU=Root CA, CN=GlobalSign Root CA
             Subject Public Key Info:
             Public Key Algorithm: rsaEncryption
             RSA Public Key: (2048 bit)
             Modulus (2048 bit):
             00:da:0e:e6:99:8d:ce:a3:e3:4f:8a:7e:fb:f1:8b:
             83:25:6b:ea:48:1f:f1:2a:b0:b9:95:11:04:bd:f0:
             63:d1:e2:67:66:cf:1c:dd:cf:1b:48:2b:ee:8d:89:
             8e:9a:af:29:80:65:ab:e9:c7:2d:12:cb:ab:1c:4c:
             70:07:a1:3d:0a:30:cd:15:8d:4f:f8:dd:d4:8c:50:
             15:1c:ef:50:ee:c4:2e:f7:fc:e9:52:f2:91:7d:e0:
             6d:d5:35:30:8e:5e:43:73:f2:41:e9:d5:6a:e3:b2:
             89:3a:56:39:38:6f:06:3c:88:69:5b:2a:4d:c5:a7:
             54:b8:6c:89:cc:9b:f9:3c:ca:e5:fd:89:f5:12:3c:
             92:78:96:d6:dc:74:6e:93:44:61:d1:8d:c7:46:b2:
             75:0e:86:e8:19:8a:d5:6d:6c:d5:78:16:95:a2:e9:
             c8:0a:38:eb:f2:24:13:4f:73:54:93:13:85:3a:1b:
             bc:1e:34:b5:8b:05:8c:b9:77:8b:b1:db:1f:20:91:
             ab:09:53:6e:90:ce:7b:37:74:b9:70:47:91:22:51:
             63:16:79:ae:b1:ae:41:26:08:c8:19:2b:d1:46:aa:
             48:d6:64:2a:d7:83:34:ff:2c:2a:c1:6c:19:43:4a:
             07:85:e7:d3:7c:f6:21:68:ef:ea:f2:52:9f:7f:93:
             90:cf
             Exponent: 65537 (0x10001)
             X509v3 extensions:
             X509v3 Key Usage: critical
             Certificate Sign, CRL Sign
             X509v3 Basic Constraints: critical
             CA:TRUE
             X509v3 Subject Key Identifier:
             60:7B:66:1A:45:0D:97:CA:89:50:2F:7D:04:CD:34:A8:FF:FC:FD:4B
             Signature Algorithm: sha1WithRSAEncryption
             d6:73:e7:7c:4f:76:d0:8d:bf:ec:ba:a2:be:34:c5:28:32:b5:
             7c:fc:6c:9c:2c:2b:bd:09:9e:53:bf:6b:5e:aa:11:48:b6:e5:
             08:a3:b3:ca:3d:61:4d:d3:46:09:b3:3e:c3:a0:e3:63:55:1b:
             f2:ba:ef:ad:39:e1:43:b9:38:a3:e6:2f:8a:26:3b:ef:a0:50:
             56:f9:c6:0a:fd:38:cd:c4:0b:70:51:94:97:98:04:df:c3:5f:
             94:d5:15:c9:14:41:9c:c4:5d:75:64:15:0d:ff:55:30:ec:86:
             8f:ff:0d:ef:2c:b9:63:46:f6:aa:fc:df:bc:69:fd:2e:12:48:
             64:9a:e0:95:f0:a6:ef:29:8f:01:b1:15:b5:0c:1d:a5:fe:69:
             2c:69:24:78:1e:b3:a7:1c:71:62:ee:ca:c8:97:ac:17:5d:8a:
             c2:f8:47:86:6e:2a:c4:56:31:95:d0:67:89:85:2b:f9:6c:a6:
             5d:46:9d:0c:aa:82:e4:99:51:dd:70:b7:db:56:3d:61:e4:6a:
             e1:5c:d6:f6:fe:3d:de:41:cc:07:ae:63:52:bf:53:53:f4:2b:
             e9:c7:fd:b6:f7:82:5f:85:d2:41:18:db:81:b3:04:1c:c5:1f:
             a4:80:6f:15:20:c9:de:0c:88:0a:1d:d6:66:55:e2:fc:48:c9:
             29:26:69:e0

             */
            "-----BEGIN CERTIFICATE-----\n" +
                    "MIIDdTCCAl2gAwIBAgILBAAAAAABFUtaw5QwDQYJKoZIhvcNAQEFBQAwVzELMAkG\n" +
                    "A1UEBhMCQkUxGTAXBgNVBAoTEEdsb2JhbFNpZ24gbnYtc2ExEDAOBgNVBAsTB1Jv\n" +
                    "b3QgQ0ExGzAZBgNVBAMTEkdsb2JhbFNpZ24gUm9vdCBDQTAeFw05ODA5MDExMjAw\n" +
                    "MDBaFw0yODAxMjgxMjAwMDBaMFcxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9i\n" +
                    "YWxTaWduIG52LXNhMRAwDgYDVQQLEwdSb290IENBMRswGQYDVQQDExJHbG9iYWxT\n" +
                    "aWduIFJvb3QgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDaDuaZ\n" +
                    "jc6j40+Kfvvxi4Mla+pIH/EqsLmVEQS98GPR4mdmzxzdzxtIK+6NiY6arymAZavp\n" +
                    "xy0Sy6scTHAHoT0KMM0VjU/43dSMUBUc71DuxC73/OlS8pF94G3VNTCOXkNz8kHp\n" +
                    "1Wrjsok6Vjk4bwY8iGlbKk3Fp1S4bInMm/k8yuX9ifUSPJJ4ltbcdG6TRGHRjcdG\n" +
                    "snUOhugZitVtbNV4FpWi6cgKOOvyJBNPc1STE4U6G7weNLWLBYy5d4ux2x8gkasJ\n" +
                    "U26Qzns3dLlwR5EiUWMWea6xrkEmCMgZK9FGqkjWZCrXgzT/LCrBbBlDSgeF59N8\n" +
                    "9iFo7+ryUp9/k5DPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMBAf8E\n" +
                    "BTADAQH/MB0GA1UdDgQWBBRge2YaRQ2XyolQL30EzTSo//z9SzANBgkqhkiG9w0B\n" +
                    "AQUFAAOCAQEA1nPnfE920I2/7LqivjTFKDK1fPxsnCwrvQmeU79rXqoRSLblCKOz\n" +
                    "yj1hTdNGCbM+w6DjY1Ub8rrvrTnhQ7k4o+YviiY776BQVvnGCv04zcQLcFGUl5gE\n" +
                    "38NflNUVyRRBnMRddWQVDf9VMOyGj/8N7yy5Y0b2qvzfvGn9LhJIZJrglfCm7ymP\n" +
                    "AbEVtQwdpf5pLGkkeB6zpxxxYu7KyJesF12KwvhHhm4qxFYxldBniYUr+WymXUad\n" +
                    "DKqC5JlR3XC321Y9YeRq4VzW9v493kHMB65jUr9TU/Qr6cf9tveCX4XSQRjbgbME\n" +
                    "HMUfpIBvFSDJ3gyICh3WZlXi/EjJKSZp4A==\n" +
                    "-----END CERTIFICATE-----"
    };
}
