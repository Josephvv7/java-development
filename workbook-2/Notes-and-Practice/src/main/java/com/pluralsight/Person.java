package com.pluralsight;

//Making a class, these are the attributes:
public class Person {
//    private String name;
//    private int age;
//    private int energy;
//
//    // Making a constructor, constructor helps create an object from a class.
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.energy = 100;
//    }
//    // Getters and Setters
//        public String getName() {
//            return this.name;
//        }
//        public void setName (String name) {
//            this.name = name;
//        }
//        public int getAge () {
//            return age;
//        }
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        // Actions
//        public void work(int hours) {
//            this.energy -= (hours * 10);
//        }
//
//        public void sleep(int hours) {
//            this.energy += (hours * 10);
//        }
//
//        public void eat() {
//            this.energy += 20;
//        }
//
//        public int getEnergy() {
//            return energy;
//        }
//
//        public void greet() {
//            System.out.println("Hello There!");
    // Attributes
    private String firstName;
    private String lastName;
    private int age;

    // Constructor


    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }


    //Getter and Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}