/**
 * Author: Javier Bonilla
 * Purpose:Develop an class that will allow you to set names, and ages to people.
 * License: To public, if i like you, else you cant use it.
 */
public class Person {

 public int age;
 public String name;

 public Person(){
    name = "";
    age = 5;
 }
 public Person (String name, int age){
     this.name=name;
     this.age=age;
 }
 public String getName(){
     return name;
 }
 public void setName(String name){
     this.name=name;
 }
 public int getAge(){
     return age;
 }
 public void setAge(int age){
     this.age = age;
 }
 public String toString(){
     return "Name:"+this.name+" Age:"+this.age;
 }

}
