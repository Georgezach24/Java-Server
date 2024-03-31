/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ:321/2021020)
 */
//Κλάση που αναπαρηστά μία επαφή.
public class Contact implements Serializable{

    private String name, surname,address ,number , proffesion;

    public Contact(String name, String surname, String number , String address , String proffesion) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.address = address;
        this.proffesion = proffesion;
    }

    public Contact() {
        name = "";
        surname = "";
        number = "" ;
        address ="";
        proffesion = "";
    }
    
    
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getProffesion() {
        return proffesion;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", surname=" + surname + ", address=" + address + ", number=" + number + ", proffesion=" + proffesion + '}';
    }
}
