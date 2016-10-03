package business.entities;

/**
 * Created by cesar on 01/10/16.
 */
public class Provider2 {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Provider2(){}

    public Provider2(String name, String address, String phoneNumber, String email){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
