package org.example.lect6;

public class Book {
    // pola - prywatne
    private String title;
    private String author;
    private Category category;
    private double price;
    // metody - publiczne
    public double convertNetToGross(){
        return price * 1.23;
    }
    public double convertNetToGross(int vat){
        return price * (1 + vat/100.);
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category.getCategoryName() +
                ", price net=" + price +
                ", price gross=" + this.convertNetToGross() +
                '}';
    }

    public Book() {}

    public Book(String title, String author, Category category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
