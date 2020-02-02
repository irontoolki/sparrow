package net.payla.webapp.core.suppliers;

/**
 * Supplier information
 */
public class Supplier {

    private String supplierNiceName;
    private String supplierManufactureName;
    private String supplierActivationMethod; // todo manual or disable shoud be select as a predefiend type
    private String supplierCategory;
    private String supplierBio;
    private boolean supplierActivationStaus;
    private boolean supplierRSSFeedStatus;

    private String supplierAddress;
    private String supplierPhoneNumber;
    private long supplierPostalCode;
    private long supplierRegionalCode;


    private float supplierCommission;

    private String supplierUserName;
    private String supplierPassword;
    private String supplierFirstName;
    private String supplierLastName;
    private String supplierEmail;
    private String supplierImage;
    private boolean supplierAccountActivationStatus;

    public String getSupplierNiceName() {
        return supplierNiceName;
    }

    public void setSupplierNiceName(String supplierNiceName) {
        this.supplierNiceName = supplierNiceName;
    }

    public String getSupplierManufactureName() {
        return supplierManufactureName;
    }

    public void setSupplierManufactureName(String supplierManufactureName) {
        this.supplierManufactureName = supplierManufactureName;
    }

    public String getSupplierActivationMethod() {
        return supplierActivationMethod;
    }

    public void setSupplierActivationMethod(String supplierActivationMethod) {
        this.supplierActivationMethod = supplierActivationMethod;
    }

    public String getSupplierCategory() {
        return supplierCategory;
    }

    public void setSupplierCategory(String supplierCategory) {
        this.supplierCategory = supplierCategory;
    }

    public String getSupplierBio() {
        return supplierBio;
    }

    public void setSupplierBio(String supplierBio) {
        this.supplierBio = supplierBio;
    }

    public boolean isSupplierActivationStaus() {
        return supplierActivationStaus;
    }

    public void setSupplierActivationStaus(boolean supplierActivationStaus) {
        this.supplierActivationStaus = supplierActivationStaus;
    }

    public boolean isSupplierRSSFeedStatus() {
        return supplierRSSFeedStatus;
    }

    public void setSupplierRSSFeedStatus(boolean supplierRSSFeedStatus) {
        this.supplierRSSFeedStatus = supplierRSSFeedStatus;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public void setSupplierPhoneNumber(String supplierPhoneNumber) {
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    public long getSupplierPostalCode() {
        return supplierPostalCode;
    }

    public void setSupplierPostalCode(long supplierPostalCode) {
        this.supplierPostalCode = supplierPostalCode;
    }

    public long getSupplierRegionalCode() {
        return supplierRegionalCode;
    }

    public void setSupplierRegionalCode(long supplierRegionalCode) {
        this.supplierRegionalCode = supplierRegionalCode;
    }

    public float getSupplierCommission() {
        return supplierCommission;
    }

    public void setSupplierCommission(float supplierCommission) {
        this.supplierCommission = supplierCommission;
    }

    public String getSupplierUserName() {
        return supplierUserName;
    }

    public void setSupplierUserName(String supplierUserName) {
        this.supplierUserName = supplierUserName;
    }

    public String getSupplierPassword() {
        return supplierPassword;
    }

    public void setSupplierPassword(String supplierPassword) {
        this.supplierPassword = supplierPassword;
    }

    public String getSupplierFirstName() {
        return supplierFirstName;
    }

    public void setSupplierFirstName(String supplierFirstName) {
        this.supplierFirstName = supplierFirstName;
    }

    public String getSupplierLastName() {
        return supplierLastName;
    }

    public void setSupplierLastName(String supplierLastName) {
        this.supplierLastName = supplierLastName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierImage() {
        return supplierImage;
    }

    public void setSupplierImage(String supplierImage) {
        this.supplierImage = supplierImage;
    }

    public boolean isSupplierAccountActivationStatus() {
        return supplierAccountActivationStatus;
    }

    public void setSupplierAccountActivationStatus(boolean supplierAccountActivationStatus) {
        this.supplierAccountActivationStatus = supplierAccountActivationStatus;
    }
}
