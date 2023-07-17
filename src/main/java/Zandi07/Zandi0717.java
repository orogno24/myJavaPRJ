package Zandi07;

public class Zandi0717 {
    public static void main(String[] args) {
        int arr[][] = {{5,4,3}, {2,1}, {8,7,4,2}};
        int r = 0;
        for (int i[] : arr){
            System.out.print(i[1]);
            for(int j:i)
                r += j;
        }
        System.out.printf("\n%d", r);
    }
}
