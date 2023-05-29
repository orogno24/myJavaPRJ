package Quiz;

import java.util.Scanner;

public class Quiz_29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int output = 0;

        switch (input) {
            case "ALPHA":
                output = 1;
                break;
            case "BETA":
                output = 2;
                break;
            case "CETA":
                output = 3;
                break;
            default:
                break;
        }

        System.out.println(output);
    }
}
