import java.util.Arrays;

class Calculated {
    public static String result = null;
    public static int number1;
    public static int number2;
    public static String romanNumeral1;
    public static String romanNumeral2;
    public static String stringComputation(String[] exampleArray){
        boolean isArabian = exampleArray[0].matches("\\d+") && exampleArray[1].matches("\\d+");
        boolean isRoman = Arrays.asList(Converter.roman).contains(exampleArray[0]) && Arrays.asList(Converter.roman).contains(exampleArray[1]);
        if (isArabian) {
            number1 = Integer.parseInt(exampleArray[0]);
            number2 = Integer.parseInt(exampleArray[1]);
            if ((number1 > 0 && number1 < 11) && (number2 > 0 && number2 < 11)) {
                result = String.valueOf(calculation(number1, number2));
            } else {
                throw new IllegalArgumentException("Введите цифры от 1 до 10");
            }
        } else if (isRoman) {
            romanNumeral1 = exampleArray[0];
            romanNumeral2 = exampleArray[1];
            number1 = Converter.converterToArabian(romanNumeral1);
            number2 = Converter.converterToArabian(romanNumeral2);
            int arabianResult = calculation(number1, number2);
            result = Converter.converterToRoman(arabianResult);
        } else {
            throw new IllegalArgumentException("Используются одновременно разные системы счисления");
        }
        return result;
    }

    public static int calculation (int number1, int number2) throws ArithmeticException {
        int result = 0;
        if (Calculator.example.contains("+")) {
            result = number1 + number2;
        } else if (Calculator.example.contains("-")) {
            result = number1 - number2;
        } else if (Calculator.example.contains("*")) {
            result = number1 * number2;
        } else if (Calculator.example.contains("/")) {
            if (number2 > 0) {
                result = number1 / number2;
            } else {
                throw new ArithmeticException("Неверный делитель");
            }
        }
        return result;
    }
}
