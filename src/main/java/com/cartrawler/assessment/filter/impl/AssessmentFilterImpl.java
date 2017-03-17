package com.cartrawler.assessment.filter.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cartrawler.assessment.comparators.Comparators;
import com.cartrawler.assessment.enums.CarGroup;
import com.cartrawler.assessment.enums.SupplierType;
import com.cartrawler.assessment.enums.SuppliersEnum;
import com.cartrawler.assessment.filler.AssessmentFiller;
import com.cartrawler.assessment.filter.AssessmentFilter;
import com.cartrawler.assessment.to.CarResultTO;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AssessmentFilterImpl extends AssessmentFiller implements AssessmentFilter {

    public List<CarResultTO> getAllCars() {
        return Lists.newArrayList(super.getAllCars());
    }

    public Set<CarResultTO> getCarsWithoutDuplications() {
        return Sets.newHashSet(super.getAllCars());
    }

    public List<CarResultTO> getCarsCorporateSorted() {
        List<CarResultTO> carsWithoutDuplications =
                Lists.newArrayList(this.getCarsWithoutDuplications());
        Collections.sort((carsWithoutDuplications), new Comparators.CorporateCarComparator());
        return carsWithoutDuplications;
    }

    @Override
    public List<CarResultTO> getCarsSortedByType(final SupplierType supplierType) {

        List<CarResultTO> cars = null;

        if (SupplierType.COPORATE.equals(supplierType)) {

            cars = this.getCarsCorporateSorted().parallelStream().filter(
                    car -> SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(car.getSupplierName()))
                    .collect(Collectors.toList());
        }

        else if (SupplierType.NON_CORPORATE.equals(supplierType)) {
            cars = this.getCarsCorporateSorted().parallelStream().filter(
                    car -> !SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(car.getSupplierName()))
                    .collect(Collectors.toList());
        } else {
            cars = this.getCarsCorporateSorted();
        }

        Collections.sort((cars), new Comparators.CarTypeComparator());
        return cars;
    }

    @Override
    public List<CarResultTO> getCarsSortedLowToHighPriceByType(SupplierType supplierType) {
        List<CarResultTO> car = this.getCarsSortedByType(supplierType);

        // sort using lambda
        Collections.sort(car, (c1, c2) -> c1.getRentalCost().compareTo(c2.getRentalCost()));

        return car;


    }

    @Override
    public List<CarResultTO> getCarsBelowAverageCost(SupplierType supplierType) {

        // calculating avarage using all cars with lambda
        Map<CarGroup, Double> avarageCostByGroup =
                this.getAllCars().parallelStream().collect(Collectors.groupingBy(CarResultTO::getCarGroup,
                        Collectors.averagingDouble(CarResultTO::getRentalCost)));

        // filtering above avarage
        return this.getCarsSortedLowToHighPriceByType(supplierType).parallelStream()
                .filter(c -> c.getRentalCost() < avarageCostByGroup.get(c.getCarGroup()))
                .collect(Collectors.toList());
    }



}
