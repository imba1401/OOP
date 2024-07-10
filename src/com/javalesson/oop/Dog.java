package com.javalesson.oop;

public class Dog {
    private static int dogsCount;
    //модификаторы доступа:
    // private - означает что нельзя вызвать из другого класса через точку . Только в текущем
    //public из любого класса доступен метод
    //вообще не указываем модификатор, то считается package private - доступ в пределах пакета package com.javalesson.oop
    // protected - через подкласс есть доступ (наследование extends)
    public static final int PAWS = 4; // поля класса, они по общему правилу должны быть private (за исключением очень редких случаев)
    public static final int TAIL = 1;
    //int примитивный тип флоат дабл шорт лонг, но если обьект (как стринг) то будет ошибка .NullPointerException
    private String name;//string - это обьект, обьекта нет и mane у нас null
    private String breed;
    private Size size=Size.UNDEFINED;

    public Dog() { //почти что метод,называется как класс
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public Size getSize() {
        return size;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setSize(Size size) {  // set и get методы ⌘N generate (set get)
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG: {
                System.out.println("Wof - Wof");
                break;
            }
            case AVERAGE: {
                System.out.println("Raf - Raf");
                break;
            }
            case SMALL:
            case VERY_SMALL: {
                System.out.println("Tiaf - Tiaf");
                break;
            }
            default:
                System.out.println("Dog's size is undefined");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}