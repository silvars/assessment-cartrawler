package com.cartrawler.assessment.filter.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparators.Comparators;
import com.cartrawler.assessment.filler.AssessmentFiller;
import com.cartrawler.assessment.filter.AssessmentFilter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AssessmentFilterImpl extends AssessmentFiller implements AssessmentFilter {

    public List<CarResult> getAllCars() {
        return Lists.newArrayList(super.getAllCars());
    }

    public Set<CarResult> getCarsWithoutDuplications() {
        return Sets.newHashSet(super.getAllCars());
    }

    public List<CarResult> getCarsCorporateSorted() {
        List<CarResult> carsWithoutDuplications =
                Lists.newArrayList(this.getCarsWithoutDuplications());
        Collections.sort((carsWithoutDuplications), new Comparators.CorporateCarComparator());
        return carsWithoutDuplications;
    }

    @Override
    public List<CarResult> getCarsSortedByType() {
        List<CarResult> carsCorporateSorted = this.getCarsCorporateSorted();
        Collections.sort((carsCorporateSorted), new Comparators.CarTypeComparator());
        return carsCorporateSorted;
    }



}
