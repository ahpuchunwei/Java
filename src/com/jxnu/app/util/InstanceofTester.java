package com.jxnu.app.util;

class Person{}
class Student extends Person{}
class Postgraduate extends Student{}
class Animal{} 
public class InstanceofTester {
 public static void main(String[] args) {
  instanceofTest(new Student());
 }
 public static void instanceofTest(Person p){
  // 判断p的真正类型
  if (p instanceof Postgraduate){
   System.out.println("p是类Postgraduate的实例");
  } else if(p instanceof Student){
   System.out.println("p是类Student的实例");
  } else if(p instanceof Person){
   System.out.println("p是类Person的实例");
  } else if(p instanceof Object) {
   System.out.println("p是类Object的实例");
  }
  /*if(p instanceof Animal){//此错编译错误，所以做注释
   System.out.println("p是类Animal的实例");
  }*/
 }
}