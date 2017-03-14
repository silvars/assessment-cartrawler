package com.cartrawler.assessment.filter.impl;

import java.util.List;
import java.util.Set;

import com.cartrawler.assessment.car.CarResult;
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



}
