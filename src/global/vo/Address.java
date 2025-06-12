package global.vo;

public class Address {

    private String addressId;
    private String address1;
    private String address2;
    private String addressType;
    private String pinCode;

    public Address(String addressId, String address1, String address2, String addressType, String pinCode) {
        this.addressId = addressId;
        this.address1 = address1;
        this.address2 = address2;
        this.addressType = addressType;
        this.pinCode = pinCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
