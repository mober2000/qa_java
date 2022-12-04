package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {



    @Test
    public void catSound() {
        Cat cat = new Cat(new Feline());

        String expectedSound = cat.getSound();
        assertEquals("Мяу", expectedSound);
    }

    @Test
    public void getCatFood() throws Exception {
        Cat cat = new Cat(new Feline());

        String catFood = String.valueOf(cat.getFood());
        assertEquals("[Животные, Птицы, Рыба]", catFood);


    }
}