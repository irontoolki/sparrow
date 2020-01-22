package net.payla.webapp.system.utils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilities {

    /**
     *
     * @param userName
     * @return hash of username, blah blah
     * @throws NoSuchAlgorithmException
     */
    public static String calcCookieHash(String userName) throws NoSuchAlgorithmException {

        String cookieValue = userName;

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(cookieValue.getBytes());
        byte[] digest = md.digest();
        String cookieHash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();
        return cookieHash;
    }
}
