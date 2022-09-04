package ru.galiia.zainagtdinova.lesson4;

import com.sun.tools.javac.Main;

public class User implements Cloneable{

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public User(){
        this.id = count;
        count++;
    }
    public User(String name) {
        this.name = name;
        this.id = count;
        count++;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = count;
        count++;
    }
    private int age = 30;
    private String name = "Иван";

    int stavka = 20;

    private String login;
    private String password;

    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        return ((User) obj).getLogin().equals(this.getLogin());
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stavka=" + stavka +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        this.id = count;
        count++;
        return super.clone();
    }
}
