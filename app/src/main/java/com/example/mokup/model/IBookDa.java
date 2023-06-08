package com.example.mokup.model;

import java.util.List;

public interface IBookDa {
    List<Book>getBook(String cat);
    String [] getCategory();


}
