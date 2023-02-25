package implementhashmap;


public class MyHaspMapTests {
    public static void main(String[] args) {

        MyHashMap<String,Integer> hashMap = new MyHashMap<>();

        hashMap.put("John", 32);
        hashMap.put("Bill", 15);
        hashMap.put("Stepan", 15);
        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.get(\"John\") = " + hashMap.get("John"));
        System.out.println();

        hashMap.remove("John");

        System.out.println("hashMap after remove = " + hashMap);

        System.out.println();

        System.out.println("hashMap.size() = " + hashMap.size());

        hashMap.clear();

        System.out.println("hashMap after clear = " + hashMap);
    }
}
