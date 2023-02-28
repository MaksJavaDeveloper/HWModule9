package implementhashmap;


class Node<K, V> {
        private int hash;
        private K key;
        private V value;

        private Node next;

        public Node(int hash, K key, V value, Node next) {
                this.hash = hash;
                this.key = key;
                this.value = value;
                this.next = next;
        }

        public K getKey() {
                return key;
        }

        public void setKey(K key) {
                this.key = key;
        }

        public V getValue() {
                return value;
        }

        public void setValue(V value) {
                this.value = value;
        }

        public Node getNext() {
                return next;
        }

        public void setNext(Node next) {
                this.next = next;
        }

        @Override
        public String toString() {
                return key + " : "+ value;
        }
}