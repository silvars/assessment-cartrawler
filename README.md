# assessment-cartrawler

This application is an application that currently lists CarResult objects.

## using

Generate the jar, using:

```
mvn clean install
``` 

Over target directory you'll find assessment-0.0.1-SNAPSHOT-jar-with-dependencies.jar, execute the following command:

```
java -jar assessment-0.0.1-SNAPSHOT-jar-with-dependencies.jar 
``` 
Will be executed all goals:

1. Remove any duplicates from the list (duplicates = same make, model, supplier, SIPP, FuelPolicy)
2. Sort the list so that all corporate cars appear at the top. Note corporate cars are those supplied by AVIS, BUDGET, ENTERPRISE, FIREFLY, HERTZ, SIXT, THRIFTY.
3. Within both the corporate and non-corporate groups, sort the cars into “mini”, “economy”, “compact” and “other” based on SIPP beginning with M, E, C respectively.
4. Within each group sort low-to-high on price.
5. Render the sorted list at the end of the process.
6. If time allows, include an optional step to remove all FuelType.FULLFULL cars that are priced above the median price within their groups. Hint: Google “Median Price”.

## tests

To launch the application's tests, run:

```
mvn clean test
``` 

