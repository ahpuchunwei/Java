package com.jxnu.app;

/**
 * TwoTuple.java
 *
 * @version 1.0
 * @author puchunwei
 *
 * 描述：二元组，用来封装结构，当返回会值需要两个对象时使用。
 */
public class TwoTuple<A, B> {

    public final A first;

    public final B second;

    public  TwoTuple(A first, B second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{first:");
        if(first == null)
            sb.append("null");
        else
            sb.append(first.toString());
        sb.append(" , ");
        if(second == null)
            sb.append("null");
        else
            sb.append(second.toString());
        sb.append("}");
        return sb.toString();
    }
}
