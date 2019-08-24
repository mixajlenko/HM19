interface HashMapInterface<K, V> extends Iterable<V> {

    boolean add(K key, V value);

    boolean delete(K key);

    int size();

    V get(K key);

}
