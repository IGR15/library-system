/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

import java.util.Date;

public class Juranle extends Book {
    private int conferenceNo; // Renamed to follow Java naming conventions
    private String conferenceName;

    public Juranle(String title, BookAuthor author, String genre, int version, Date date) {
        super(title, author, genre, version, date);
    }

    public Juranle(int conferenceNo, String conferenceName, String title, BookAuthor author, String genre, int version, Date date) {
        super(title, author, genre, version, date);
        this.conferenceNo = conferenceNo;
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getInfo() {
        return "Juranle{" +
                "conferenceNo=" + conferenceNo +
                ", conferenceName='" + conferenceName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return conferenceNo + "," + conferenceName + "," + super.toString();
    }
}
