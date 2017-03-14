package com.cartrawler.assessment.view;

import java.util.Set;

import com.cartrawler.assessment.car.CarResult;

public class Display {
    public void render(Set<CarResult> cars) {
        for (CarResult car : cars) {
            System.out.println(car);
        }
    }
}
