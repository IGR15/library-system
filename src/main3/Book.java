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
public class Book implements Display{
    protected int id;
    protected String titel;
    protected BookAuthor author;
    protected String genre;
    protected String version;
    protected Date date;

    public Book(int id, String titel, BookAuthor author, String genre, String version, Date date) {
        this.id = id;
        this.titel = titel;
        this.author = author;
        this.genre = genre;
        this.version = version;
        this.date = date;
    }


    @Override
    public boolean inLoan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getinfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
