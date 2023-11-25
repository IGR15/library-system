/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class Student {
   private int id;
   private String name;
   private String address;
   private Date birthDate;
   private String major;
   private ArrayList<Loan> loans;

    public Student(int id, String name, String address, Date birthDate, String major, ArrayList<Loan> loans) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.loans = loans;
    }
   
   
   
   
   
   
    
}
