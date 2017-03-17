package com.cartrawler.assessment.execution;

import org.apache.log4j.Logger;

import com.cartrawler.assessment.enums.SupplierType;
import com.cartrawler.assessment.filter.AssessmentFilter;
import com.cartrawler.assessment.filter.impl.AssessmentFilterImpl;
import com.cartrawler.assessment.view.Display;

public class Execution {

    private final Logger log = Logger.getLogger(Execution.class);
    private final Display display = new Display();

    private AssessmentFilter assessmentFilter;

    public Execution() {
        assessmentFilter = new AssessmentFilterImpl();
    }


    public static void main(String[] args) {
        new Execution().process();
    }


    private void process() {

        log.info("INI: process\n\n");

        log.info("\n\nEXE: -- calling: getAllCars\n\n\n");
        display.render(assessmentFilter.getAllCars());

        log.info("\n\nEXE: -- calling: getCarsWithoutDuplications\n\n\n");
        display.render(assessmentFilter.getCarsWithoutDuplications());

        log.info("\n\nEXE: -- calling: getCarsCorporateSorted\n\n\n");
        display.render(assessmentFilter.getCarsCorporateSorted());


        log.info("\n\nEXE: -- calling: getCarsSortedByType(SupplierType.BOTH)\n\n\n");
        display.render(assessmentFilter.getCarsSortedByType(SupplierType.BOTH));
        log.info(
                "\n\nEXE: -- calling: assessmentFilter.getCarsSortedLowToHighPriceByType(SupplierType.BOTH)\n\n\n");
        display.render(assessmentFilter.getCarsSortedLowToHighPriceByType(SupplierType.BOTH));

        log.info("\n\nEND: process ");


    }
}
