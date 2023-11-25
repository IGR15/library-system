/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

import java.util.ArrayList;
import java.util.Collection;




/**
 *
 * @author MSI
 */
public class Library {
   private Collection<Book> books;
   private Collection<Student> students;
   private Collection<Loan> loans;
   private Collection<BookAuthor> authors;
   
   public Library(){
       books = new ArrayList<>();
       students = new ArrayList<>();
       loans = new ArrayList<>();
       authors = new ArrayList<>();
   }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public Collection<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Collection<Loan> loans) {
        this.loans = loans;
    }

    public Collection<BookAuthor> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<BookAuthor> authors) {
        this.authors = authors;
    }
}
