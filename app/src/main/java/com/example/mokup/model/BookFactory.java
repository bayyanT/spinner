package com.example.mokup.model;

public class BookFactory {
    public  IBookDa  getModel(){
        return new BookDa();
    }
}
