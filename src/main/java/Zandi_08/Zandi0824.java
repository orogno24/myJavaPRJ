package Zandi_08;

import java.util.ArrayList;
import java.util.List;

public class Zandi0824 {
    public static void main(String[] args) {

        List<List<Integer>> twoDimensionalList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(i * 4 + j);
            }
            twoDimensionalList.add(row);
        }

        System.out.println("2차원 리스트의 요소:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDimensionalList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
