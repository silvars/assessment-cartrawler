package com.cartrawler.assessment.comparators;

import java.util.Comparator;
import java.util.Set;

import com.cartrawler.assessment.enums.SuppliersEnum;
import com.cartrawler.assessment.to.CarResultTO;
import com.google.common.collect.Sets;

public class Comparators {

    private static final Set<Character> SIPP_CODES = Sets.newHashSet('M', 'E', 'C');

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

            Character c1 = new Character(o1.getSippCode().charAt(0));
            Character c2 = new Character(o2.getSippCode().charAt(0));

            if (SIPP_CODES.contains(c1) && SIPP_CODES.contains(c2)) {
                return o1.getSippCode().compareTo(o2.getSippCode());
            }

            if (!SIPP_CODES.contains(c1) && SIPP_CODES.contains(c2)) {
                return 1;
            }
            if (SIPP_CODES.contains(c1) && !SIPP_CODES.contains(c2)) {
                return -1;
            }

            return o1.getSippCode().compareTo(o2.getSippCode());

        }
    }
}

