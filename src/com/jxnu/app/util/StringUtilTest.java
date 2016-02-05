package com.jxnu.app.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by puchunwei on 16/2/5.
 */
public class StringUtilTest {

    public static void main(String[] args) throws Exception {

        //StringUtil.isEmpty测试代码,判断为空的代码是str==null ||str.length()==0
        System.out.println(StringUtils.isEmpty(null)); //true
        System.out.println(StringUtils.isEmpty("")); //true
        System.out.println(StringUtils.isEmpty(" ")); //false
        System.out.println(StringUtils.isEmpty(" ")); //false
        System.out.println(StringUtils.isEmpty("ahpuchunwei")); //false
        System.out.println(StringUtils.isEmpty(" ahpuchunwei ")); //false


        //StringUtil.isNotEmpty测试代码


    }
}
