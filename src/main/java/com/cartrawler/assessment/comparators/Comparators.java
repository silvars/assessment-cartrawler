package com.cartrawler.assessment.comparators;

import java.util.Comparator;

import com.cartrawler.assessment.enums.CarGroup;
import com.cartrawler.assessment.enums.SuppliersEnum;
import com.cartrawler.assessment.to.CarResultTO;

public class Comparators {

    public static class CorporateCarComparator implements Comparator<CarResultTO> {

        public int compare(CarResultTO o1, CarResultTO o2) {

            // both are corporate
            if (SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o1.getSupplierName())
                    && SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o2.getSupplierName())) {
                return o1.getSupplierName().compareTo(o2.getSupplierName());
            }

            // just o1 is corporate
            if (SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o1.getSupplierName())
                    && !SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o2.getSupplierName())) {
                return -1;
            }

            // just o2 is corporate
            if (!SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o1.getSupplierName())
                    && SuppliersEnum.CORPORATE_CAR_SUPPLIERS.contains(o2.getSupplierName())) {
                return 1;
            }

            // none are corporate
            return o1.getSupplierName().compareTo(o2.getSupplierName());
        }
    }


    public static class CarTypeComparator implements Comparator<CarResultTO> {

        public int compare(CarResultTO o1, CarResultTO o2) {


            if (!CarGroup.OTHER.equals(o1.getCarGroup())
                    && !CarGroup.OTHER.equals(o2.getCarGroup())) {
                return o1.getSippCode().compareTo(o2.getSippCode());
            }

            if (CarGroup.OTHER.equals(o1.getCarGroup())
                    && !CarGroup.OTHER.equals(o2.getCarGroup())) {
                return 1;
            }
            if (!CarGroup.OTHER.equals(o1.getCarGroup())
                    && CarGroup.OTHER.equals(o2.getCarGroup())) {
                return -1;
            }

            return o1.getSippCode().compareTo(o2.getSippCode());

        }
    }
}

