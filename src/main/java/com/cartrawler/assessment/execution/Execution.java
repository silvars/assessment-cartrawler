package com.cartrawler.assessment.execution;

import com.cartrawler.assessment.filter.AssessmentFilter;
import com.cartrawler.assessment.filter.impl.AssessmentFilterImpl;

public class Execution {

    private AssessmentFilter assessmentFilter;

    public Execution() {
        assessmentFilter = new AssessmentFilterImpl();
    }

    public static void main(String[] args) {
        new Execution().process();
    }

    private void process() {


    }

}
