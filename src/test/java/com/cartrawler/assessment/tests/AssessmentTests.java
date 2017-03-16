package com.cartrawler.assessment.tests;

import java.util.List;

import org.apache.log4j.Logger;

import com.cartrawler.assessment.enums.SupplierType;
import com.cartrawler.assessment.enums.SuppliersEnum;
import com.cartrawler.assessment.filter.AssessmentFilter;
import com.cartrawler.assessment.filter.impl.AssessmentFilterImpl;
import com.cartrawler.assessment.to.CarResultTO;
import com.cartrawler.assessment.view.Display;

import junit.framework.TestCase;



public class AssessmentTests extends TestCase {

    private final Logger log = Logger.getLogger(AssessmentTests.class);
    private AssessmentFilter assessmentFilter;


    protected void setUp() throws Exception {
        super.setUp();
        assessmentFilter = new AssessmentFilterImpl();
    }


    public void testSuccessAllAvaibleCarsWithNoFilter() {

        log.info("\n\nINI: testSuccessAllAvaibleCarsWithNoFilter\n\n");

        final List<CarResultTO> cars = assessmentFilter.getAllCars();

        new Display().render(cars);

        assertNotNull(cars);

        assertTrue(assessmentFilter.getAllCars().size() > 0);

        log.info("\n\nEND: testSuccessAllAvaibleCarsWithNoFilter\n\n");

    }



    public void testSuccessRemoveAnyDuplicatesFromList() {

        log.info("INI: testSuccessRemoveAnyDuplicatesFromList\n\n");

        Integer carsSizeWithNoFilter = assessmentFilter.getAllCars().size();
        Integer carsSizeFiltered = assessmentFilter.getCarsWithoutDuplications().size();

        assertFalse(carsSizeWithNoFilter.equals(carsSizeFiltered));

        log.info("\n\nEND: testSuccessRemoveAnyDuplicatesFromList\n\n");

    }

    public void testSuccessSortCorporateCars() {

        log.info("\n\nINI: testSuccessSortCorporateCars\n\n");

        List<CarResultTO> cars = assessmentFilter.getCarsCorporateSorted();

        new Display().render(cars);

        assertEquals(cars.get(0).getSupplierName(), SuppliersEnum.AVIS);

        log.info("\n\nEND: testSuccessSortCorporateCars\n\n");

    }


    public void testSuccessSortCarTypes() {

        log.info("\n\nINI: testSuccessSortCarTypes\n\n");

        List<CarResultTO> corporate = assessmentFilter.getCarsSortedByType(SupplierType.COPORATE);
        log.info("\n\nEXE: corporate size(): " + corporate.size() + "\n\n");
        new Display().render(corporate);
        log.info("\n\n\n\n");

        List<CarResultTO> nonCorporate =
                assessmentFilter.getCarsSortedByType(SupplierType.NON_CORPORATE);
        log.info("\n\nEXE: nonCorporate size(): " + nonCorporate.size() + "\n\n");
        new Display().render(nonCorporate);
        log.info("\n\n\n\n");

        List<CarResultTO> both = assessmentFilter.getCarsSortedByType(SupplierType.BOTH);
        log.info("\n\nEXE: both size(): " + both.size() + "\n\n");
        new Display().render(both);
        log.info("\n\n\n\n");

        assertEquals(both.size(), (corporate.size() + nonCorporate.size()));

        assertTrue(both.size() > corporate.size());

        assertTrue(both.size() > nonCorporate.size());

        assertFalse(corporate.size() > nonCorporate.size());


        log.info("\n\nEND: testSuccessSortCarTypes\n\n");

    }


    public void testSuccessCarsSortedLowToHighPriceByType() {

        log.info("\n\nINI: testSuccessCarsSortedLowToHighPriceByType\n\n");

        log.info("\n\nEXE: CORPORATE \n\n");
        List<CarResultTO> corporate =
                assessmentFilter.getCarsSortedLowToHighPriceByType(SupplierType.COPORATE);
        new Display().render(corporate);

        log.info("\n\n\n\n");

        log.info("\n\nEXE: NON-CORPORATE \n\n");
        List<CarResultTO> nonCorporate =
                assessmentFilter.getCarsSortedLowToHighPriceByType(SupplierType.NON_CORPORATE);
        new Display().render(nonCorporate);

        log.info("\n\n\n\n");

        log.info("\n\nEXE: CORPORATE AND NON-CORPORATE \n\n");
        List<CarResultTO> both =
                assessmentFilter.getCarsSortedLowToHighPriceByType(SupplierType.BOTH);
        new Display().render(both);

        log.info("\n\n\n\n");

        log.info("\n\nEND: testSuccessCarsSortedLowToHighPriceByType\n\n");

    }
    
    
    

    public void testSuccessBelowAverageCost() {

        log.info("\n\nINI: testSuccessRemovePricedAbove\n\n");
        
        log.info("\n\nEXE: CORPORATE AND NON-CORPORATE \n\n");
        List<CarResultTO> both =
                assessmentFilter.getCarsBelowAverageCost(SupplierType.BOTH);

        log.info("\n\nEND: testSuccessRemovePricedAbove\n\n");

    }
    
    
    
    
    
    


}
