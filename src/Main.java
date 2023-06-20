import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static int calc(String input) throws Exception {

        int[] number;
        int result;
        String[] splitString = input.split(" ");
        String operator;

        number = CheckFormat.checkFormat(splitString);

        operator = splitString[1];

        result = new ArabicNumbers(number[0], number[1], operator).calculations();

        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        int result = calc(readerConsole.readLine());
        System.out.println(result);

    }
}