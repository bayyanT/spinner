package com.example.mokup.model;

public class Book {
    private int Pages;
    private String title;
    private String category;

    public Book(int pages, String title, String category) {
        Pages = pages;
        this.title = title;
        this.category = category;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Book{" +
                "Pages=" + Pages +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
