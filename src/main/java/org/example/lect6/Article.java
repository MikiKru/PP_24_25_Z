package org.example.lect6;

public class Article extends Book{
    private String ISBN;

    public Article(){}

    public Article(String title, String author, Category category, double price, String ISBN) {
        super(title, author, category, price);  // wywołanie konstruktora klasy Book
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ISBN='" + ISBN + '\'' +
                "} " + super.toString();
    }
}
