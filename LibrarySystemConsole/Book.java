package com.company.LibrarySystemConsole;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    //Constructor
    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
    }
    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed=isBorrowed;
    }

    //getter
    public int getId() {
    return this.id;
    }
    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}