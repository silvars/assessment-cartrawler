package com.cartrawler.assessment.to;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.cartrawler.assessment.enums.CarGroup;
import com.cartrawler.assessment.enums.FuelPolicy;
import com.cartrawler.assessment.enums.SuppliersEnum;

public class CarResultTO implements Serializable, Comparable<CarResultTO> {
    private static final long serialVersionUID = 3984170778063234014L;
    private final String description;
    private final SuppliersEnum supplierName;
    private final String sippCode;
    private final Double rentalCost;
    private final FuelPolicy fuelPolicy;

    public CarResultTO(String description, SuppliersEnum supplierName, String sipp, double cost,
            FuelPolicy fuelPolicy) {
        super();
        this.description = description;
        this.supplierName = supplierName;
        this.sippCode = sipp;
        this.rentalCost = cost;
        this.fuelPolicy = fuelPolicy;
    }

    public String getDescription() {
        return this.description;
    }

    public SuppliersEnum getSupplierName() {
        return this.supplierName;
    }

    public String getSippCode() {
        return this.sippCode;
    }

    public Double getRentalCost() {
        return this.rentalCost;
    }

    public FuelPolicy getFuelPolicy() {
        return this.fuelPolicy;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.rightPad(this.supplierName.name(), 12, " "));
        sb.append(StringUtils.rightPad(this.description, 35, " "));
        sb.append(StringUtils.rightPad(this.sippCode, 5, " "));
        sb.append(StringUtils.leftPad(String.format("%.2f", this.rentalCost), 10, " "));
        sb.append(" ").append(" ");
        sb.append(this.fuelPolicy);

        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((fuelPolicy == null) ? 0 : fuelPolicy.hashCode());
        result = prime * result + ((sippCode == null) ? 0 : sippCode.hashCode());
        result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarResultTO other = (CarResultTO) obj;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (fuelPolicy != other.fuelPolicy)
            return false;
        if (sippCode == null) {
            if (other.sippCode != null)
                return false;
        } else if (!sippCode.equals(other.sippCode))
            return false;
        if (supplierName == null) {
            if (other.supplierName != null)
                return false;
        } else if (!supplierName.equals(other.supplierName))
            return false;
        return true;
    }


    public int compareTo(CarResultTO o) {
        return this.description.compareTo(o.description);
    }

    public CarGroup getCarGroup() {
        return CarGroup.valueOfByCharGroup(this.sippCode.charAt(0));
    }

}


