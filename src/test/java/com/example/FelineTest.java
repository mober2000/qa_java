package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        String felineFood = String.valueOf(feline.eatMeat());

        assertEquals("[Животные, Птицы, Рыба]", felineFood);
    }

    @Test
    public void getFelineFamily() {
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();

        assertEquals("Кошачьи", felineFamily);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();

        assertEquals(1, kittensCount);
    }
}