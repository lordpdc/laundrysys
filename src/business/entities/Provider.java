package business.entities;

import java.lang.reflect.Field;

/**
 * Created by cesar on 01/10/16.
 */
public class Provider {
    private int id;
    private String name;
    private String address;
    private String phone_number;
    private String email;

    public Provider(){}

    public Provider(String name, String address, String phone_number, String email){
        this.name=name;
        this.address=address;
        this.phone_number=phone_number;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
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
