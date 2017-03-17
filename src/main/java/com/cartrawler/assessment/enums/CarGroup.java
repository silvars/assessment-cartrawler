package com.cartrawler.assessment.enums;

public enum CarGroup {


    MINI('M'), ECONOMY('E'), COMPACT('C'), OTHER('O');

    private Character charGroup;

    private CarGroup(Character charGroup) {
        this.charGroup = charGroup;
    }

    public char getCharGroup() {
        return charGroup;

    }

    public static CarGroup valueOfByCharGroup(Character value) {
        for (CarGroup cg : values()) {
            if (cg.charGroup.equals(value)) {
                return cg;
            }
        }

        return OTHER;
    }
}
