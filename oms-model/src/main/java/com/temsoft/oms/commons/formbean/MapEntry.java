package com.temsoft.oms.commons.formbean;

import java.util.Map;

/**
 * Entry 实现Serializable
 *
 * @author KisChang
 * @version 1.0
 */
public class MapEntry<K,V> implements Map.Entry<K,V>, java.io.Serializable {

    private K key;
    private V value;

    public MapEntry() {
    }

    public MapEntry(Map.Entry<K,V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return this.value;
    }
}
