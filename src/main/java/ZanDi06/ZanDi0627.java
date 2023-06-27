package ZanDi06;

public class ZanDi0627 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        init(a);
        data(a);
        prnt(a);
    }

    static void init(int[][] a){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                a[x][y] = 0;
            }
        }
    }

    static void data(int[][] a){
        int z = 1;
        for(int x = 0; x < 3; x++){
            for(int y = x; y < 3; y++){
                a[x][y] = z++;
            }
        }
    }

    static void prnt(int[][] a){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(a[x][y] == 0){
                    System.out.print(" ");
                } else System.out.print(a[x][y]);
            }
            System.out.println();
        }
    }
}
