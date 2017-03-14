package com.cartrawler.assessment.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.filter.AssessmentFilter;
import com.cartrawler.assessment.filter.impl.AssessmentFilterImpl;

import junit.framework.TestCase;


public class AssessmentTests extends TestCase {

    private final Logger log = Logger.getLogger(AssessmentTests.class);
    private AssessmentFilter assessmentFilter;


    protected void setUp() throws Exception {
        super.setUp();
        assessmentFilter = new AssessmentFilterImpl();
    }


    @Test
    public void testSuccessAllAvaibleCarsWithNoFilter() {

        log.info("INI: testSuccessAllAvaibleCarsWithNoFilter");

        final List<CarResult> cars = assessmentFilter.getAllCars();

        assertNotNull(cars);

        assertTrue(assessmentFilter.getAllCars().size() > 0);

        log.info("END: testSuccessAllAvaibleCarsWithNoFilter");

    }



    @Test
    public void testSuccessRemoveAnyDuplicatesFromList() {

        log.info("INI: testSuccessRemoveAnyDuplicatesFromList");

        Integer carsSizeWithNoFilter = assessmentFilter.getAllCars().size();
        Integer carsSizeFiltered = assessmentFilter.getCarsWithoutDuplications().size();

        assertFalse(carsSizeWithNoFilter.equals(carsSizeFiltered));

        log.info("END: testSuccessRemoveAnyDuplicatesFromList");

    }


}
