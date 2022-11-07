/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enyity;

/**
 *
 * @author NikitaSkr
 */
public class Client {
    private String firstname;
    private String lastname;
    private String phone;
    private int mony;

    public Client() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMony() {
        return mony;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }

    @Override
    public String toString() {
        return "Client{" + "firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", mony=" + mony + '}';
    }

    
    
    
}
