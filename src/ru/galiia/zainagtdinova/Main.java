package ru.galiia.zainagtdinova;

import ru.galiia.zainagtdinova.lesson4.User;

class Main extends Object {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user = new User("Вася");
        // нарушение инкапсуляции
        //user.age = 57;

        // инкапсуляция соблюдена
        user.setAge(57);

        System.out.println(user.getAge());
    }
}