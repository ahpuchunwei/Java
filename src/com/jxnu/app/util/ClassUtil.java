package com.jxnu.app.util;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * Created by puchunwei on 16/1/15.
 */
public class ClassUtil {
    public static void main(String[] args) throws Exception {
        User user = new User();
        System.out.println(User.class.getSimpleName());

        Integer maxValue = -1;
        System.out.println(maxValue==-1);


        StringBuffer sb=new StringBuffer();
        OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory
                .getOperatingSystemMXBean();
//        sb.append("系统物理内存总计：" + osmb.getTotalPhysicalMemorySize()
//                / 1024 / 1024 + "MB<br>");
//        sb.append("系统物理可用内存总计：" + osmb.getFreePhysicalMemorySize()
//                / 1024 / 1024 + "MB");
    }
}
