package com.cartrawler.assessment.enums;

import java.util.Set;

import com.google.common.collect.Sets;

public enum SuppliersEnum {

    AVIS, BUDGET, CENTAURO, DELPASO, ENTERPRISE, FIREFLY, FLIZZR, GOLDCAR, HERTZ, MARBESOL, NIZA, RECORD, RHODIUM, SIXT, THRIFTY;

    public static final Set<SuppliersEnum> CORPORATE_CAR_SUPPLIERS =
            Sets.newHashSet(AVIS, BUDGET, ENTERPRISE, FIREFLY, HERTZ, SIXT, THRIFTY);


}
