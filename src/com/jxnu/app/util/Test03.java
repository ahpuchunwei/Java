package com.jxnu.app.util;

public class Test03 {

    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;


        Integer f5 = Integer.valueOf(100);
        System.out.println(f1==f5);
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);

        User user = new User();
        user.setAge(5);
        user.setName("小明");
        System.out.println(user.age);
        System.out.println("------------");
        test(user);
        System.out.println(user.age);

    }

    public static void test(User user){
        user.setAge(6);
    }

}

class User {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}