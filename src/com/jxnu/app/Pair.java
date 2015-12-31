package com.jxnu.app;

/**
 * Pair.java
 * @author puchunwei
 *
 * 描述：Key-Value Pair对，也可以当做二元组使用。
 */
public class Pair<K, V> {

    public final K key;
    public final V value;

    public Pair(K var1, V var2) {
        this.key = var1;
        this.value = var2;
    }

    public String toString() {
        return this.key + "=" + this.value;
    }

    public int hashCode() {
        return this.key.hashCode() * 13 + (this.value == null?0:this.value.hashCode());
    }

    public boolean equals(Object var1) {
        if(this == var1) {
            return true;
        } else if(!(var1 instanceof Pair)) {
            return false;
        } else {
            Pair var2 = (Pair)var1;
            if(this.key != null) {
                if(!this.key.equals(var2.key)) {
                    return false;
                }
            } else if(var2.key != null) {
                return false;
            }

            if(this.value != null) {
                if(!this.value.equals(var2.value)) {
                    return false;
                }
            } else if(var2.value != null) {
                return false;
            }

            return true;
        }
    }
}
