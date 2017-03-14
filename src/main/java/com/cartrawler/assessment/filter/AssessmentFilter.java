package com.cartrawler.assessment.filter;

import java.util.List;
import java.util.Set;

import com.cartrawler.assessment.car.CarResult;

public interface AssessmentFilter {

    public List<CarResult> getAllCars();

    public Set<CarResult> getCarsWithoutDuplications();



}
