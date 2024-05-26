package com.company.LibrarySystemConsole;

import java.io.*;

public class LibraryFileHandling {

    public static final  String File_Path="E:\\library.txt";


    public  static void saveLibrary(Library library)throws IOException {
        ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream(File_Path));
        outputStream.writeObject(library);
    }
    public static Library loadLibrary()throws IOException,ClassNotFoundException{
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(File_Path));
           return (Library) inputStream.readObject();
        }catch (Exception e){
            return new Library();
        }
    }

}
