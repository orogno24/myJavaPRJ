package Zandi_09;

import java.util.HashMap;
import java.util.Map;
public class Zandi0901 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> userOrderMap = new HashMap<>();

        Map<String, Integer> user1Orders = new HashMap<>();
        user1Orders.put("item1", 3);
        user1Orders.put("item2", 2);
        userOrderMap.put("user1", user1Orders);

        Map<String, Integer> user2Orders = new HashMap<>();
        user2Orders.put("item3", 1);
        user2Orders.put("item2", 4);
        userOrderMap.put("user2", user2Orders);

        Map<String, Integer> ordersForUser1 = userOrderMap.get("user1");
        if (ordersForUser1 != null) {
            System.out.println("주문 내역 for user1:");
            for (Map.Entry<String, Integer> entry : ordersForUser1.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "개");
            }
        } else {
            System.out.println("user1의 주문 내역이 없습니다.");
        }
    }
}
