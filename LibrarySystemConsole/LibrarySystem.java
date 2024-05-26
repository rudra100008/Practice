package com.company.LibrarySystemConsole;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library=null;
        try{
            library=LibraryFileHandling.loadLibrary();
        }catch (Exception e){
            System.err.println("Error loading file: "+e.getMessage());
            library=new Library();
        }
        Scanner scan = new Scanner(System.in);
        boolean exist=false;
        while(!exist){
            System.out.println("\t \t -------Library Management System-------");
            System.out.println("""

                    1.Add Book\

                     2.Borrow Book\

                     3.Return Book\

                     4.View all Book\

                     5.Exist""");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Enter the id of book:");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the title of book:");
                    String title = scan.nextLine();
                    System.out.println("Enter the author of book: ");
                    String author = scan.nextLine();

                    library.addBooks(new Book(id, title, author));
                    break;
                }
                case 2:{
                    System.out.println("Enter the id of book:");
                    int borrowId= scan.nextInt();
                    if (library.borrowBook(borrowId)){
                        System.out.println("Book borrowed successfully");
                    }else{
                        System.out.println("Book not available");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the id of the book:");
                    int returnId=scan.nextInt();
                    if (library.returnBook(returnId)){
                        System.out.println("Book returned successfully");
                    }else{
                        System.out.println("Book not borrowed");
                    }
                    break;
                }
                case 4:{
                    library.displayBook();
                    break;
                }
                case 5:{
                    exist=true;
                    try{
                        LibraryFileHandling.saveLibrary(library);
                    }catch (Exception e){
                        System.err.println("Error: "+e.getLocalizedMessage());
                    }
                    break;
                }
                default:
                    System.out.println("Invalid Choice!!! Please choice from  given options");

            }

        }
    }
}
