package com.jxnu.app.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by puchunwei on 16/1/14.
 */
public class GuavaTest {
    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 10;
        int compareTo = Integer.valueOf(a).compareTo(Integer.valueOf(b));
        int compare = Ints.compare(a, b);

        System.out.println(compareTo);
        System.out.println(compare);

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        List<String> of = ImmutableList.of("a", "b", "c", "d");
        System.out.println(of);

        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("key1","value1");
        map1.put("key2","value2");

        Map<String,String> map = ImmutableMap.of("key1", "value1", "key2", "value2");

        System.out.println(map1);
        System.out.println(map);

        List<Integer> list1 = ImmutableList.of(1, 2, 3, 4);
        int[] array2 = Ints.toArray(list1);
        System.out.println(array2);

    }
}
