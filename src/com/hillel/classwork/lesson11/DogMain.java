package com.hillel.classwork.lesson11;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run();

        System.out.println(dog.breed);
        System.out.println(dog.size);
        System.out.println(dog.age);
        System.out.println(dog.color);

        dog.breed = "Mastiff";
        dog.size = "Medium";
        dog.age = 3;
        dog.color = "Black";

        System.out.println(dog.breed);
        System.out.println(dog.size);
        System.out.println(dog.age);
        System.out.println(dog.color);

        Dog dog2 = new Dog();
        dog2.breed = "Maltese";
        dog2.size = "Medium";
        dog2.age = 3;
        dog2.color = "White";

        System.out.println(dog2.breed);
        System.out.println(dog2.size);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        dog2.run();

        System.out.println(dog == dog2);
        System.out.println(dog.equals(dog2));

        Dog dog3 = new Dog("Chow chow", "Medium", 2, "Browm");
        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);




    }

}
