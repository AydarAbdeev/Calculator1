import java.util.Scanner;

public class Calculator {

    public static String example;



    public static void main(String[] args) {
        System.out.println("Введите пример, используя арабские цифры от 1 до 10, либо римские от I до X,  в формате [1+2]:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            example = scanner.nextLine().replaceAll("\\s", "").toUpperCase();
            System.out.println(calc(example));
        }
    }

    public static String calc (String example) throws IllegalArgumentException {
        String[] exampleArray = example.split("[+\\-*/]");
        if (exampleArray.length > 2) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (exampleArray.length < 2) {
            throw new IllegalArgumentException("Строка не является математической операцией");
        }
        return Calculated.stringComputation(exampleArray);
    }

}
