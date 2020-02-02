package net.payla.webapp.core.retailers;

/**
 * define retailer
 */
public class retailer {

    private String retailerImage;
    private long retailerParentId;
    private String retailerUserName;
    private String retailerPassword;
    private Acceptance retailerAcceptanceCategory; //fixme this is use special object (http://payla.net/admin/sale/customer_group/edit?token=cd0ccaabcfd152926dab2b284c59cfed&customer_group_id=2)
    private String retailerType;
    private String retailerName;
    private String retailerPhoneNumber;
    private String retailerEmail;
    private boolean retailerStatus;
    private String retailerSellerName;
    private String retailerShopRegional;
    private String retailerCategory;
    private String retailerCoverageRegional;

    private String retailerAddressLocationName;
    private String retailerAddressUserName;
    private String retailerAddress;
    private String retailerAddressPhone;
    private boolean retailerAddressStatus;
    private String retailerAddressRegional;
    private long retailerAddressLatLong; //todo change to type

    public String getRetailerImage() {
        return retailerImage;
    }

    public void setRetailerImage(String retailerImage) {
        this.retailerImage = retailerImage;
    }

    public long getRetailerParentId() {
        return retailerParentId;
    }

    public void setRetailerParentId(long retailerParentId) {
        this.retailerParentId = retailerParentId;
    }

    public String getRetailerUserName() {
        return retailerUserName;
    }

    public void setRetailerUserName(String retailerUserName) {
        this.retailerUserName = retailerUserName;
    }

    public String getRetailerPassword() {
        return retailerPassword;
    }

    public void setRetailerPassword(String retailerPassword) {
        this.retailerPassword = retailerPassword;
    }

    public Acceptance getRetailerAcceptanceCategory() {
        return retailerAcceptanceCategory;
    }

    public void setRetailerAcceptanceCategory(Acceptance retailerAcceptanceCategory) {
        this.retailerAcceptanceCategory = retailerAcceptanceCategory;
    }

    public String getRetailerType() {
        return retailerType;
    }

    public void setRetailerType(String retailerType) {
        this.retailerType = retailerType;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getRetailerPhoneNumber() {
        return retailerPhoneNumber;
    }

    public void setRetailerPhoneNumber(String retailerPhoneNumber) {
        this.retailerPhoneNumber = retailerPhoneNumber;
    }

    public String getRetailerEmail() {
        return retailerEmail;
    }

    public void setRetailerEmail(String retailerEmail) {
        this.retailerEmail = retailerEmail;
    }

    public boolean isRetailerStatus() {
        return retailerStatus;
    }

    public void setRetailerStatus(boolean retailerStatus) {
        this.retailerStatus = retailerStatus;
    }

    public String getRetailerSellerName() {
        return retailerSellerName;
    }

    public void setRetailerSellerName(String retailerSellerName) {
        this.retailerSellerName = retailerSellerName;
    }

    public String getRetailerShopRegional() {
        return retailerShopRegional;
    }

    public void setRetailerShopRegional(String retailerShopRegional) {
        this.retailerShopRegional = retailerShopRegional;
    }

    public String getRetailerCategory() {
        return retailerCategory;
    }

    public void setRetailerCategory(String retailerCategory) {
        this.retailerCategory = retailerCategory;
    }

    public String getRetailerCoverageRegional() {
        return retailerCoverageRegional;
    }

    public void setRetailerCoverageRegional(String retailerCoverageRegional) {
        this.retailerCoverageRegional = retailerCoverageRegional;
    }

    public String getRetailerAddressLocationName() {
        return retailerAddressLocationName;
    }

    public void setRetailerAddressLocationName(String retailerAddressLocationName) {
        this.retailerAddressLocationName = retailerAddressLocationName;
    }

    public String getRetailerAddressUserName() {
        return retailerAddressUserName;
    }

    public void setRetailerAddressUserName(String retailerAddressUserName) {
        this.retailerAddressUserName = retailerAddressUserName;
    }

    public String getRetailerAddress() {
        return retailerAddress;
    }

    public void setRetailerAddress(String retailerAddress) {
        this.retailerAddress = retailerAddress;
    }

    public String getRetailerAddressPhone() {
        return retailerAddressPhone;
    }

    public void setRetailerAddressPhone(String retailerAddressPhone) {
        this.retailerAddressPhone = retailerAddressPhone;
    }

    public boolean isRetailerAddressStatus() {
        return retailerAddressStatus;
    }

    public void setRetailerAddressStatus(boolean retailerAddressStatus) {
        this.retailerAddressStatus = retailerAddressStatus;
    }

    public String getRetailerAddressRegional() {
        return retailerAddressRegional;
    }

    public void setRetailerAddressRegional(String retailerAddressRegional) {
        this.retailerAddressRegional = retailerAddressRegional;
    }

    public long getRetailerAddressLatLong() {
        return retailerAddressLatLong;
    }

    public void setRetailerAddressLatLong(long retailerAddressLatLong) {
        this.retailerAddressLatLong = retailerAddressLatLong;
    }
}
