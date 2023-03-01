package implementhashmap;

class MyHashMapTest {
    public static void main(String[] args) {

        MyHashMap<String, Integer> hashMap = new MyHashMap<String, Integer>();

        hashMap.put("John", 32);
        hashMap.put("Bill", 15);
        hashMap.put("Bill", 16);
        hashMap.put("Alex", 22);
        hashMap.put("Stepan", 15);
        System.out.println("hashMap = " + hashMap);
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println();

        System.out.println("hashMap.get(\"Bill\") = " + hashMap.get("Bill"));
        System.out.println();

        hashMap.remove("Alex");
        System.out.println("hashMap after remove item with key \"Alex\" = " + hashMap);
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println();


        hashMap.clear();
        System.out.println("hashMap = " + hashMap);
        System.out.println("hashMap.size() after clear() = " + hashMap.size());

        for (int i = 1; i <= 10000; i++) {
            hashMap.put(" " + i, i);
        }
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap = " + hashMap);

        
        System.out.println("hashMap.size() = " + hashMap.size());


    }
}