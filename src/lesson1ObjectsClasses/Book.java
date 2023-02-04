package lesson1ObjectsClasses;

import java.util.Objects;

//создаем книгу
public class Book {
    private String bookName;
    private Author firstNameSecondName;
    private int publishingYear;

    public Book(String bookName, Author firstNameSecondName, int publishingYear) {
        this.bookName = bookName;
        this.firstNameSecondName = firstNameSecondName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getFirstNameSecondName() {
        return this.firstNameSecondName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + " Год издания " + publishingYear + " " + firstNameSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(firstNameSecondName, book.firstNameSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, firstNameSecondName, publishingYear);
    }
}