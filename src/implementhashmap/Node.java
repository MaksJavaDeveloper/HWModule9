package implementhashmap;


 class Node<K, V> {
     int hash;
     K key;
     V value;
     Node<K, V> next;

     public Node(int hash, K key, V value, Node<K, V> next) {
         this.hash = hash;
         this.key = key;
         this.value = value;
         this.next = next;
     }

     public K getKey() {
         return key;
     }

     public V getValue() {
         return value;
     }

     public void setValue(V value) {
         this.value = value;
     }

     @Override
     public String toString() {
         return key + " = " + value;
     }
 }
