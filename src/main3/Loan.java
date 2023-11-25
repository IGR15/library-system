/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

import java.util.Date;

/**
 *
 * @author MSI
 */
public class Loan {
    private int id;
    private Book book;
    private Student student;
    private Date dueDate;

    public Loan(int id, Book book, Student student, Date dueDate) {
        this.id = id;
        this.book = book;
        this.student = student;
        this.dueDate = dueDate;
    }
    
   
}
