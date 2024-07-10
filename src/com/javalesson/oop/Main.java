package com.javalesson.oop;

public class Main {

        public static void main(String[] args) {

            System.out.println("Dog's count "+ Dog.getDogsCount());//это обращение к классу Dog а не объекта dog ниже

            Dog lab = new Dog(); //Dog - переменная, имеет ссылку на обьект, тип переменной (как string или int)
            // dog(имя объекта) = new Dog - класс из которого создаем объект();
            // класс и тип может не совпадать, но пока совпадают
            // если переменную оставить без ссылки на обьект, то методы вызываемые из него будут с ошибкой .NullPointerException,
            //будут не инициализированы, даже если присвоим значение null Dog lab; или Dog lab = null;

            lab.setName("Charley");
            lab.setBreed("Lab");
            lab.setSize(Size.AVERAGE);
            lab.bite();

            Dog sheppard = new Dog(); //овчарка
            sheppard.setName("Mike");
            sheppard.setBreed("Sheppard"); // порода
            sheppard.setSize(Size.BIG);
            sheppard.bite();

            Dog doberman = new Dog(); //
            doberman.setName("Jack");
            doberman.setBreed("Doberman"); // порода
            doberman.setSize(Size.BIG);
            doberman.bite();

            Size s = Size.SMALL;
            Size s1 = Size.valueOf("BIG");

            Size[] values = Size.values();
            for (int i=0; i < values.length; i++){
                System.out.println(values[i]);
            }

        }
}
