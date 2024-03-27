/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;

/**
 *
 * @author Γεώργιος Ζάχος (ΑΜ:321/2021020)
 */
public class Contact implements Serializable{

    private String name, surname, number;

    public Contact(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public Contact() {
        name = "";
        surname = "";
        number = "" ;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", surname=" + surname + ", number=" + number + '}';
    }
    
    

}
