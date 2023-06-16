package ZanDi06;

public class ZanDi0616 {

    public static void main(String[] args) {
        String hg = "123/456/789";
        String[] split = hg.split("/");

        for (String s : split) {
            System.out.println(s);
        }

        String s1 = split[1];
        String s2 = s1.replace("4", "8");

        System.out.print("바뀐 값 : " + s2);

    }
}
