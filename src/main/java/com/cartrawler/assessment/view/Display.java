package com.cartrawler.assessment.view;

import java.util.Collection;

import com.cartrawler.assessment.to.CarResultTO;

public class Display {
    public void render(Collection<CarResultTO> cars) {
        for (CarResultTO car : cars) {
            System.out.println(car);
        }
    }
}
