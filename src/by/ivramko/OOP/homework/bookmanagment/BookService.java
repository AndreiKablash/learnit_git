package by.ivramko.OOP.homework.bookmanagment;

import java.util.Arrays;
import java.util.Objects;

public class BookService {

    public Book[] filterBooksByAuthor(Author author, Book[] books) {

        if (author == null || books == null) {
            return new Book[0];
        }
        return Arrays.stream(books)
                .filter(Objects::nonNull)
                .filter(s -> Arrays.stream(s.getAuthors()).anyMatch(a -> a.getId() == author.getId()))
                .toArray(Book[]::new);

    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {

        if (publisher == null || books == null) {
            return new Book[0];
        }
	    return Arrays.stream(books)
                .filter(Objects::nonNull)
                .filter(s -> s.getPublisher().getId()==publisher.getId())
                .toArray(Book[]::new);
    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if ( books == null) {
            return new Book[0];
        }
	    return Arrays.stream(books)
                .filter(Objects::nonNull)
                .filter(s->s.getPublishingYear()==yearFromInclusively)
                .toArray(Book[]::new);
    }




}
