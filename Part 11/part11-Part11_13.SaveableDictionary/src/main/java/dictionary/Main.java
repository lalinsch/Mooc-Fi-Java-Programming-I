package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary test = new SaveableDictionary("hello.txt");
        if (test.load()) {
            test.add("hola", "hello");
            test.add("computadora", "computer");
            System.out.println("Hola Translation: " + test.translate("hola"));
            test.save();
        }

    }
}
