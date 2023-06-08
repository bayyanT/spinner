package com.example.mokup.model;

import java.util.ArrayList;
import java.util.List;

public class BookDa implements IBookDa {
    private ArrayList<Book>books=new ArrayList<>();


    //lionization local data
    public BookDa() {
        books.add(new Book(450,"introduction in java","java"));
        books.add(new Book(550,"professional java","java"));
        books.add(new Book(500,"Beginning C#  development","C#"));
    }
    @Override
    public List<Book>getBook(String cat){
        ArrayList<Book>data=new ArrayList<>();
        for(Book b : books){
            if(b.getCategory().equals(cat)){
                data.add(b);
            }
        }
        return data;
    }

    @Override
    public String [] getCategory() {
        String [] cat =new String[]{"java","C#",".net"};

        return cat;
    }


}
