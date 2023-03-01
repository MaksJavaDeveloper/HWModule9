package implementhashmap;


 class Node<K, V> {
        final int hash;
        private K key;
        private V value;
        private Node<K, V> nextNode;

        Node(int hash, K key, V value) {
                this.hash = hash;
                this.key = key;
                this.value = value;
                this.nextNode = null;
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

        public Node<K, V> getNextNode() {
                return nextNode;
        }

        public void setNextNode(Node<K, V> nextNode) {
                this.nextNode = nextNode;
        }

        @Override
        public String toString() {
                return "[key-" + key + ", value-" + value + "]";
        }


}