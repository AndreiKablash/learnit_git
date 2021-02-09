package by.ivramko.OOP.homework.bookmanagment;

import java.util.Objects;

public class Publisher {

    private int id;
    private String publisherName;

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (id != publisher.id) return false;
        return Objects.equals(publisherName, publisher.publisherName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (publisherName != null ? publisherName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
