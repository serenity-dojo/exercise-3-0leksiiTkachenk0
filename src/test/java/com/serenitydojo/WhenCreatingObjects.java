package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "Bone", 5);

        fido.makeNoise();
    }

    @Test
    public void dog_is_fed() {
        Dog fido = new Dog("Fido", "Bone", 5);
        fido.feed();
    }
}
