import java.util.Arrays;

class DataProcessing {
    public String result = null;
    public int number1;
    public int number2;
    public String romanNumeral1;
    public String romanNumeral2;

    public String stringComputation(String[] exampleArray) {
        Converter converter = new Converter();
        boolean isArabian = exampleArray[0].matches("\\d+") && exampleArray[1].matches("\\d+");
        boolean isRoman = Arrays.asList(converter.roman).contains(exampleArray[0]) && Arrays.asList(converter.roman).contains(exampleArray[1]);
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
            number1 = converter.converterToArabian(romanNumeral1);
            number2 = converter.converterToArabian(romanNumeral2);
            int arabianResult = calculation(number1, number2);
            result = converter.converterToRoman(arabianResult);
        } else {
            throw new IllegalArgumentException("Используются одновременно разные системы счисления");
        }
        return result;
    }

    public int calculation(int number1, int number2) throws ArithmeticException {
        int arabianResult = 0;
        if (Calculator.example.contains("+")) {
            arabianResult = number1 + number2;
        } else if (Calculator.example.contains("-")) {
            arabianResult = number1 - number2;
        } else if (Calculator.example.contains("*")) {
            arabianResult = number1 * number2;
        } else if (Calculator.example.contains("/")) {
            if (number2 > 0) {
                arabianResult = number1 / number2;
            } else {
                throw new ArithmeticException("Неверный делитель");
            }
        }
        return arabianResult;
    }
}
