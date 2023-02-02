package lesson1ObjectsClasses;

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

    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
