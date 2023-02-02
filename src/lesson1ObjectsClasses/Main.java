package lesson1ObjectsClasses;

public class Main {
    public static void main(String[] args) {

        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author alexeyTolstoy = new Author("Alexey", "Tolstoy");
        Book warAndPeace = new Book("Война и Мир", leoTolstoy, 1869);
        Book buratino = new Book("Буратино", alexeyTolstoy, 1935);
        warAndPeace.setPublishingYear(1900);
        System.out.println(warAndPeace.getPublishingYear());
    }
}
