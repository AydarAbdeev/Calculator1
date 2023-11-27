class Converter {
    final String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
            "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
            "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
            "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
            "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
            "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public int converterToArabian(String romanNumeral) {
        return switch (romanNumeral) {
            case "I":
                yield 1;
            case "II":
                yield 2;
            case "III":
                yield 3;
            case "IV":
                yield 4;
            case "V":
                yield 5;
            case "VI":
                yield 6;
            case "VII":
                yield 7;
            case "VIII":
                yield 8;
            case "IX":
                yield 9;
            case "X":
                yield 10;
            default:
                throw new IllegalArgumentException("Необходимо ввести цифру от I до X");
        };
    }

    public String converterToRoman(int number) throws IllegalArgumentException {
        if (number < 1) {
            throw new IllegalArgumentException("В римской системе нет отрицательных чисел");
        }
        return roman[number];
    }
}
