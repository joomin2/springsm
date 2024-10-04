package edu.sm.frame;

public interface SMrepository<K ,V> {
    void insert(V v);    // 'K'는 'k'로, 'V'는 'v'로 변경
    void update(V v);
    void delete(K k);
}
