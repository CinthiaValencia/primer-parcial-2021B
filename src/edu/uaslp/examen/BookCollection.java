package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {
    private String name;

    private ArrayList<Book> books;

    public BookCollection(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public ArrayList<Book> getBooks()
    {
        return this.books;
    }

    public int getStars()
    {
        return stars();
    }
}
