package com.cartrawler.assessment.enums;

import java.util.List;

import com.google.common.collect.Lists;

public enum SuppliersEnum {

    AVIS, BUDGET, CENTAURO, DELPASO, ENTERPRISE, FIREFLY, FLIZZR, GOLDCAR, HERTZ, MARBESOL, NIZA, RECORD, RHODIUM, SIXT, THRIFTY;

    public List<SuppliersEnum> getAllCorporateCarSuppliers() {
        return Lists.newArrayList(AVIS, BUDGET, ENTERPRISE, FIREFLY, HERTZ, SIXT, THRIFTY);
    }
}
