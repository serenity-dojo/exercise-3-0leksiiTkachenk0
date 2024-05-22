package com.serenitydojo;

public class Dog {
    public String name;
    public String favoriteToy;
    public int age;
    public boolean isFed;

    static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = false;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean isFed() {
        return isFed;
    }

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        isFed = true;
        System.out.println(name + " is full");
    }
}

// Add a method called makeNoise() to your Dog class that returns "Woof"
// Add a new method called feed() method that sets the isFed field to true
// Refactor your makeNoise() method to use a static constant called DOG_NOISE


