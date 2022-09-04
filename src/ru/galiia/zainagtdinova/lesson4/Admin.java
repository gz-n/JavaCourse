package ru.galiia.zainagtdinova.lesson4;


public class Admin extends User {
    private int age = 40;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "age=" + age +
                ", name='" + this.getName() + '\'' +
                ", stavka=" + stavka +
                ", login='" + this.getLogin() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                ", id=" + this.getId() +
                '}';
    }
}
