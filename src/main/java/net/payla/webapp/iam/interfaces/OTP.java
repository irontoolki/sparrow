package net.payla.webapp.iam.interfaces;

/**
 * One time Password
 */
public interface OTP {
    /**
     * Send SMS (Auth Code) via SMS
     * @param phoneNumber
     * @throws Exception
     */
    public void sendSMS(String phoneNumber) throws Exception;

    /**
     * Register Code for Phone (Using Cache at core)
     * @param phoneNumber
     * @throws Exception
     */
    public  void setCode (String phoneNumber) throws Exception;

    /**
     *  Retrieve Code value (Using Cache at core)
     * @param phoneNumber
     * @throws Exception
     */
    public  void getCode (String phoneNumber) throws Exception;

    /**
     *  Revoke SMS code ( Remove from cache)
     * @param phoneNumber
     * @throws Exception
     */
    public  void revokeCode (String phoneNumber) throws Exception;


}
