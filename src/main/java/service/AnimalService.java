package service;

public class AnimalService {

    public class Exo1 {

        Animal[] animals = new Animal[]{new Cat("Felix", 5), new Dog("Snoopy", 10), new Cat("Garfield", 7)};

        /*-
         * Exercise: have each animal introduce itself
         *
         * Expected output:
         * - "Moew! I am 5 years old, my name is Felix."
         * - "Woof! I am 10 years old, my name is Snoopy."
         * - "Moew! I am 7 years old, my name is Garfield."
         */

        public void introduceAnimals() {
            for (Animal animal : animals) {
                System.out.println(animal.emitSound());
            }
        }


    }

    interface AnimalBehavior {
        String emitSound();
    }

    class Animal implements AnimalBehavior {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String emitGenericSound(int age, String name, String sound) {
            return sound + "! I am " + age + " years old, my name is" + name + ".";
        }

        @Override
        public String emitSound() {
            return "I'm an animal!";
        }
    }

    class Dog extends Animal implements AnimalBehavior {

        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public String emitSound() {
            return super.emitGenericSound(age, name, "Woof!");
        }
    }

    class Cat extends Animal implements AnimalBehavior {

        public Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public String emitSound() {
            return super.emitGenericSound(age, name, "Moew!");
        }
    }
}
