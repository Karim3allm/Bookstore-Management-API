package models;

import java.math.BigInteger;

public class Books {

    private String title;
    private int isbn ;
    private int authorId;
    private int categoryId;
    private double price;
    private int stock;

    public Books(String title, int stock, int isbn, double price, int authorId, int categoryId) {
        this.title = title;
        this.stock = stock;
        this.isbn = isbn;
        this.price = price;
        this.authorId = authorId;
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
