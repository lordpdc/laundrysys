/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.entities;

import business.utilities.NullElements;

/**
 *
 * @author Luis
 */
public class Supplier {
    protected int id;
    protected String name;
    protected String address;
    protected String phone;
    protected String mail;
    
    public Supplier(){
        id= NullElements.INTEGER_NULL;
        name= NullElements.STRING_NULL;
        address = NullElements.STRING_NULL;
        phone=NullElements.STRING_NULL;
        mail=NullElements.STRING_NULL;
    }

    public Supplier(String name, String address, String phone, String mail){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
    }
    
    public Supplier(int id, String name, String address, String phone, String mail){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
