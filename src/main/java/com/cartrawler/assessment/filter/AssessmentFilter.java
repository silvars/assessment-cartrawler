package com.cartrawler.assessment.filter;

import java.util.List;
import java.util.Set;

import com.cartrawler.assessment.enums.SupplierType;
import com.cartrawler.assessment.to.CarResultTO;

public interface AssessmentFilter {

    public List<CarResultTO> getAllCars();

    public Set<CarResultTO> getCarsWithoutDuplications();

    public List<CarResultTO> getCarsCorporateSorted();

    public List<CarResultTO> getCarsSortedByType(final SupplierType supplierType);
    
    public List<CarResultTO> getCarsSortedLowToHighPriceByType(final SupplierType supplierType);

}
