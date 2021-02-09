package by.ivramko.OOP.homework.bookmanagment;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private CoverType coverType;

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (publishingYear != book.publishingYear) return false;
        if (amountOfPages != book.amountOfPages) return false;
        if (!Objects.equals(name, book.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(authors, book.authors)) return false;
        if (!Objects.equals(publisher, book.publisher)) return false;
        if (!Objects.equals(price, book.price)) return false;
        return coverType == book.coverType;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + publishingYear;
        result = 31 * result + amountOfPages;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (coverType != null ? coverType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingYear=" + publishingYear +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
