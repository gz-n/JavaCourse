package ru.galiia.zainagtdinova.lesson4;

/* 3 кита ООП
   Инкапсуляция
   Наследование
   Полиморфизм

   Инкапсуляция

   Модификаторы доступа
   public - доступен отовсюду
   protected - доступен классам внутри одного пакета с этим классом и наследникам этого класса
   (пустой) default - доступен классам внутри одного пакета с этим классом
   private - доступен только внутри текущего класса - реализация инкапсуляции

   Наследование - раширение возможностей классов
   extends - ключевое слово: A extends B - класс A наследуется от класса B
 */


public class OOP {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println(User.getCount());
        User user = new User("Вася");
        user.stavka = 10;
        user.setLogin("admin");
        user.setPassword("1");

        Admin admin = new Admin();
        admin.setLogin("admin");
        admin.setPassword("1");
        System.out.println(admin.getAge());

        String a = "Текст";
        String b = new String("Текст");
        // Через == сравниваются ссылки а не значения!
        //System.out.println(a == b);

        System.out.println(a.equals(b));

        User moderator = new Moderator();

        User [] users = new User[5];
        users[0] = user;
        users[1] = admin;
        users[2] = moderator;

        System.out.println(user.hashCode());
        System.out.println(admin.hashCode());

        System.out.println(user.equals(admin));

        // NullPointerException
        //User user1 = null;
        //System.out.println(user.equals(user1));

        for (int i = 0; i < users.length; i++) {
            User u = users[i];
            System.out.println(u);

        }


        User user2 = (User) user.clone();
        System.out.println(user2);
        System.out.println(user == user2);

        System.out.println(User.getCount());
    }
}
