package pl.com.tt;


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DictionaryNode<V,K>{
    V value;
    K key;
}
public class Dictionary<V,K> implements Map<V,K>{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public K get(Object key) {
        return null;
    }

    @Override
    public K put(V key, K value) {
        return null;
    }

    @Override
    public K remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends V, ? extends K> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<V> keySet() {
        return null;
    }

    @Override
    public Collection<K> values() {
        return null;
    }

    @Override
    public Set<Entry<V, K>> entrySet() {
        return null;
    }
}
