package com.jxnu.app.util;

/**
 * Created by puchunwei on 16/1/11.
 */
public class ToStringTest {

    public static void main(String[] args) throws Exception {
        String s1 = "hello";
        StringBuffer s2 = new StringBuffer(s1);
        s2.append(" world");
        System.out.println(s2.toString());
        System.out.println(s2);

        User user = new User();
        user.username = "ahpuchunwei";
        user.password= "1234";

        System.out.print(user);

    }
}

class User extends Object{
    String username;
    String password;

    public String toString() {
        return "ahpuchunwei" +"testToString" +"1234";
    }

}
