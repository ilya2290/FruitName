public class FruitException extends Exception {

    public FruitException(String anotherNamOfTheFruit) {
        System.out.println("There no " + anotherNamOfTheFruit + " fruit in List.");
    }
}
