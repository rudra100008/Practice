package com.company.LibrarySystemConsole;

import java.util.ArrayList;
import java.util.List;

public class Library {
private List<Book> books;
   public Library(){
       this.books=new ArrayList<>();
   }
   public void addBooks(Book book){
    books.add(book);
   }
   public boolean borrowBook(int id){
       for (Book book: books){
           if (book.getId()==id && !book.getIsBorrowed()){
               book.setIsBorrowed(true);
                return true;
           }
       }
       return false;
   }
   public boolean returnBook(int id){
       for(Book book : books){
           if (book.getId()==id && book.getIsBorrowed()){
               book.setIsBorrowed(false);
               return true;
           }
       }
       return false;
   }
   public void displayBook(){
       for (Book book:books){
           System.out.println(book);
       }
   }

}
