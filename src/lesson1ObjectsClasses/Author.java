package lesson1ObjectsClasses;

import java.util.Objects;

//создаем автора
public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public String toString() {
        return "Aвтор: " + firstName + " " + secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Author firstNameSecondName = (Author) o;
        return firstName.equals(firstNameSecondName.getFirstName()) && secondName.equals(firstNameSecondName.getSecondName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);

    }
}

