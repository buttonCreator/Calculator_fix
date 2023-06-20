public class ArabicNumbers {

    private final int numberOne;
    private final int numberTwo;
    private final String operator;

    public ArabicNumbers(int numberOne, int numberTwo, String operator) {

        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operator = operator;

    }

    public int calculations() {

        int result;

        result = switch (operator) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> 0;
        };
        return result;
    }

}
