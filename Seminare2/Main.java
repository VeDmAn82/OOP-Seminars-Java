import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Задача1. Реализовать метод tellAboutYourself() в наследниках

// Задача2. 
// Теперь кот рассказывает про породу
// Собака пусть про настроение
//*Перегрузить у собаки метод, что бы мы могли менять настроение

// Задача3.
// Описать человека с возможностью заведения животных
// Добавить методы по изменению параметров
// Сделать добавление животных интерактивным
// Вывести в консоль

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека:");
        String name = scanner.nextLine();
        System.out.println("Сколько питомцев у человека?");
        int quantity = scanner.nextInt();
        List<Animal> pets = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Собака (1), человек(2) или кошка (0)?");
            int type = scanner.nextInt();
            if (type == 1) {
                pets.add(new Dog("Собака", i));
            } else if (type == 2) {
                pets.add(new Human("Андрей"));
            }
            else {
                pets.add(new Cat("Мурзик", "Рыжий", i));
            }
        }

        Human human = new Human(pets, name);
        System.out.println(human.getName());
        human.getPets().forEach(System.out::println);
    }

    private static void task1() {
        Dog dog = new Dog("Шарик", 4);
        Cat cat = new Cat("Матроскин", "Полосатый", 6);

        dog.tellAboutYourself();
        cat.tellAboutYourself();
    }
}
