public class CheckFormat {

    public static int[] checkFormat(String[] splitString) throws Exception {

        int numberOne, numberTwo;

        if (splitString.length == 1)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        else if (splitString.length != 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (!splitString[1].matches("[+\\-*/]+"))
            throw new Exception("throws Exception //т.к. не верный формат операнда");

        try {
            numberOne = Integer.parseInt(splitString[0]);
            numberTwo = Integer.parseInt(splitString[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Вы ввели не целые числа");
        }

        if ((numberOne > 10 || numberOne < 1) || (numberTwo > 10 || numberTwo < 1))
            throw new Exception("Числа находятся вне диапазона 1 и 10 включительно");

        return new int[]{numberOne, numberTwo};

    }

}
