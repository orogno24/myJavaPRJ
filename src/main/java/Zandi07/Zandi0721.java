package Zandi07;

class Connection {
    private static Connection num = null;
    private int count = 0;

    static public Connection get() {
        if (num == null) {
            num = new Connection();
            return num;
        }
        return num;
    }
    public void count() {count ++;}
    public int getCount() { return count;}
}


public class Zandi0721 {
    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();
        Connection conn2 = Connection.get();
        conn2.count();
        Connection conn3 = Connection.get();
        conn3.count();

        System.out.print(conn1.getCount());
    }
}