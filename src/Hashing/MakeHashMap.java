package Hashing;
class MakeHashMap {
    class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;
        Node(K key, V value){
                this.key = key;
                this.value = value;
                this.next = null;
        }

    }
    class MyHashMap<K,V>{
        private Node<K,V>[] buckets;
        private int capacity; //total number of buckets
        private int size; //total number of key-value pairs in the map currently

        public MyHashMap(int capacity){
            this.capacity = capacity;
            this.size = 0;
            this.buckets = new Node[capacity];
        }

        private int getBucketIndex(K key) {
            int hash = key.hashCode();
            return Math.abs(hash) % capacity;
        }

        //put
        public void put(K key,V Value){
            int bucketIndex = getBucketIndex(key);
            Node<K,V> current = buckets[bucketIndex];

            // traversing the linked list to find if the key already exists
            while(current != null){
                if(current.key.equals(key)){
                    current.value = Value;  //key exists value append case
                    return;
                }
                current = current.next; //key not found, move to the next node
            }
            //key not found, insert new node at the beginning of the linked list
            Node<K,V> newNode = new Node<>(key, Value);
            newNode.next = buckets[bucketIndex];
            buckets[bucketIndex] = newNode;
            size++;
        }

        //get
        public V get(K key){
            int bucketIndex = getBucketIndex(key);
            Node<K,V> current = buckets[bucketIndex];

            while(current != null){
                if(current.key.equals(key)){
                    return current.value; //key found, return value
                }
                current = current.next; //key not found, move to the next node
            }
            return null; //key not found in the map
        }
        public void remove(K key){
            int bucketIndex = getBucketIndex(key);
            Node<K,V> current = buckets[bucketIndex];
            Node<K,V> prev = null;
    
            while(current != null){
                if(current.key.equals(key)){
                    if(prev == null){
                        buckets[bucketIndex] = current.next; //removing the first node in the linked list
                    } else {
                        prev.next = current.next; //removing a node in the middle or end of the linked list
                    }
                    size--;
                    return;
                }
                prev = current;
                current = current.next; //key not found, move to the next node
            }
        }
    }
    
    
}




