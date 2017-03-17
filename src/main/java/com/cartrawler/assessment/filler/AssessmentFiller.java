package com.cartrawler.assessment.filler;

import java.util.Collection;
import java.util.Collections;

import com.cartrawler.assessment.enums.FuelPolicy;
import com.cartrawler.assessment.enums.SuppliersEnum;
import com.cartrawler.assessment.to.CarResultTO;
import com.google.common.collect.Lists;

public abstract class AssessmentFiller {

    private Collection<CarResultTO> CARS;

    protected Collection<CarResultTO> getAllCars() {

        if (CARS == null) {
            CARS = Lists.newArrayList();
        }

        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.NIZA, "EDMR", 12.81d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford C-Max Diesel", SuppliersEnum.NIZA, "CMMD", 22.04d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Scenic Diesel", SuppliersEnum.NIZA, "JGAD", 93.67d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.NIZA, "MDMR", 9.78d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.NIZA, "CDMR", 18.07d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Audi A3 Diesel", SuppliersEnum.NIZA, "CDMD", 41.16d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.NIZA, "IVMD", 55.47d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mini Cooper", SuppliersEnum.NIZA, "EDMR", 16.75d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 2 Series Gran Tourer Diesel", SuppliersEnum.NIZA, "JVAD",
                146.62d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.NIZA, "EDMR", 22.65d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford C-Max Diesel", SuppliersEnum.NIZA, "CMMD", 43.98d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic Diesel", SuppliersEnum.NIZA, "JGAD", 115.58d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.NIZA, "MDMR", 18.6d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.NIZA, "CDMR", 33.06d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Audi A3 Diesel", SuppliersEnum.NIZA, "CDMD", 63.07d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.NIZA, "IVMD", 77.41d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mini Cooper", SuppliersEnum.NIZA, "EDMR", 36.92d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.CENTAURO, "CMMV", 33.15d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate Diesel", SuppliersEnum.CENTAURO, "CWMD", 67.26d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.CENTAURO, "CDMR", 26.96d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.CENTAURO, "EDMD", 25.02d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Juke Diesel", SuppliersEnum.CENTAURO, "HFMD", 34.32d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.CENTAURO, "CDMD", 40.91d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford C-Max Diesel", SuppliersEnum.CENTAURO, "CMMD", 69.2d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVAR", 99.8d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.CENTAURO, "EDMR", 11.08d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.CENTAURO, "CWMR", 59.12d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy Diesel", SuppliersEnum.CENTAURO, "FVMD", 148.23d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.CENTAURO, "SVMR",
                163.73d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVMR", 72.29d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.CENTAURO, "IVMD", 80.43d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.CENTAURO, "MCMR", 9.53d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.CENTAURO, "CMMV", 65.15d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate Diesel", SuppliersEnum.CENTAURO, "CWMD",
                100.27d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.CENTAURO, "CDMR", 58.77d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.CENTAURO, "EDMD", 56.77d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Nissan Juke Diesel", SuppliersEnum.CENTAURO, "HFMD", 66.35d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.CENTAURO, "CDMD", 73.14d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford C-Max Diesel", SuppliersEnum.CENTAURO, "CMMD", 102.27d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVAR", 133.79d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.CENTAURO, "EDMR", 42.41d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.CENTAURO, "CWMR", 91.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy Diesel", SuppliersEnum.CENTAURO, "FVMD", 183.66d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.CENTAURO, "SVMR",
                199.62d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVMR", 105.45d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.CENTAURO, "IVMD",
                113.83d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.CENTAURO, "MCMR", 40.82d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.CENTAURO, "CMMV", 34.11d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate Diesel", SuppliersEnum.CENTAURO, "CWMD", 69.24d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.CENTAURO, "CDMR", 27.73d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.CENTAURO, "EDMD", 25.74d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Juke Diesel", SuppliersEnum.CENTAURO, "HFMD", 35.31d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.CENTAURO, "CDMD", 42.1d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford C-Max Diesel", SuppliersEnum.CENTAURO, "CMMD", 71.23d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVAR", 102.75d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.CENTAURO, "EDMR", 11.38d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.CENTAURO, "CWMR", 60.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy Diesel", SuppliersEnum.CENTAURO, "FVMD", 152.63d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.CENTAURO, "SVMR",
                168.59d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.CENTAURO, "IVMR", 74.42d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.CENTAURO, "IVMD", 82.8d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.CENTAURO, "MCMR", 9.78d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.GOLDCAR, "IDMR", 301.95d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Juke", SuppliersEnum.GOLDCAR, "CFMR", 146.54d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.GOLDCAR, "CLMR", 52.02d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen C4 Grand Picasso", SuppliersEnum.GOLDCAR, "IVAR", 399.28d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.GOLDCAR, "IDAR", 116.68d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.GOLDCAR, "CWMR", 126.08d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.GOLDCAR, "IVMR", 366.84d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen DS3", SuppliersEnum.GOLDCAR, "ESMR", 63.69d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Audi A3", SuppliersEnum.GOLDCAR, "ICMR", 84.46d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.GOLDCAR, "CMMV", 53.89d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.GOLDCAR, "EDMR", 31.71d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.GOLDCAR, "JGMR", 139.95d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.GOLDCAR, "FDAR", 436.43d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.GOLDCAR, "MCMR", 26.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.GOLDCAR, "SVMR", 621.7d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.GOLDCAR, "CDMR", 39.79d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.GOLDCAR, "IDMR", 243.55d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Nissan Juke", SuppliersEnum.GOLDCAR, "CFMR", 127.33d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.GOLDCAR, "CLMR", 54.13d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen C4 Grand Picasso", SuppliersEnum.GOLDCAR, "IVAR", 326.7d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.GOLDCAR, "IDAR", 97.31d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.GOLDCAR, "CWMR", 114.01d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.GOLDCAR, "IVMR", 303.43d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen DS3", SuppliersEnum.GOLDCAR, "ESMR", 60d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Audi A3", SuppliersEnum.GOLDCAR, "ICMR", 74.04d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.GOLDCAR, "CMMV", 70.83d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.GOLDCAR, "EDMR", 44.99d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.GOLDCAR, "JGMR", 120.59d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.GOLDCAR, "FDAR", 353.17d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.GOLDCAR, "MCMR", 39.63d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.GOLDCAR, "SVMR", 509.37d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.GOLDCAR, "CDMR", 49.58d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 4 Series Convertible", SuppliersEnum.MARBESOL, "RTAV",
                189.85d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Megane Convertible", SuppliersEnum.MARBESOL, "CTMR",
                59.22d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.MARBESOL, "CMMV", 10.53d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.MARBESOL, "CWMR", 16.11d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Passat Diesel", SuppliersEnum.MARBESOL, "IDMD", 38.15d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Clio Estate", SuppliersEnum.MARBESOL, "EWMR", 10.93d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.MARBESOL, "SVMR",
                108.04d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMM", 4.8d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.MARBESOL, "FVMR", 45.07d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDAR", 74.03d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.MARBESOL, "IVMR", 35.64d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.MARBESOL, "CDMD", 8.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Yaris", SuppliersEnum.MARBESOL, "EDAR", 16.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.MARBESOL, "MDMR", 4d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Qashqai", SuppliersEnum.MARBESOL, "IFMR", 45.07d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.MARBESOL, "EDMD", 5.11d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.MARBESOL, "IDMR", 36.57d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDMR", 8.05d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDAR", 25.24d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMR", 4.49d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Passat", SuppliersEnum.MARBESOL, "SDAR", 44.14d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDMR", 47.55d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Citan", SuppliersEnum.MARBESOL, "CMMD", 10.53d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 4 Series Convertible", SuppliersEnum.MARBESOL, "RTAV",
                189.85d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Megane Convertible", SuppliersEnum.MARBESOL, "CTMR",
                59.22d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.MARBESOL, "CMMV", 10.53d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.MARBESOL, "CWMR", 16.11d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Passat Diesel", SuppliersEnum.MARBESOL, "IDMD", 38.15d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Renault Clio Estate", SuppliersEnum.MARBESOL, "EWMR", 10.93d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.MARBESOL, "SVMR",
                108.04d, FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMM", 4.8d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.MARBESOL, "FVMR", 45.07d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDAR", 74.03d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.MARBESOL, "IVMR", 35.64d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.MARBESOL, "CDMD", 8.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Yaris", SuppliersEnum.MARBESOL, "EDAR", 16.86d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.MARBESOL, "MDMR", 4d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Qashqai", SuppliersEnum.MARBESOL, "IFMR", 45.07d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.MARBESOL, "EDMD", 5.11d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.MARBESOL, "IDMR", 36.57d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDMR", 8.05d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDAR", 25.24d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMR", 4.49d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Passat", SuppliersEnum.MARBESOL, "SDAR", 44.14d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDMR", 47.55d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Citan", SuppliersEnum.MARBESOL, "CMMD", 10.53d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("BMW 4 Series Convertible", SuppliersEnum.MARBESOL, "RTAV",
                516.52d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Megane Convertible", SuppliersEnum.MARBESOL, "CTMR",
                204.47d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.MARBESOL, "CMMV", 78.06d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.MARBESOL, "CWMR", 85.54d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Passat Diesel", SuppliersEnum.MARBESOL, "IDMD", 98.2d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Clio Estate", SuppliersEnum.MARBESOL, "EWMR", 82.37d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.MARBESOL, "SVMR",
                231.59d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMM", 70.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.MARBESOL, "FVMR", 213.53d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDAR", 199.93d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.MARBESOL, "IVMR", 168.28d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Passat Diesel", SuppliersEnum.MARBESOL, "IDAD",
                127.59d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.MARBESOL, "CDMD", 76.94d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Yaris", SuppliersEnum.MARBESOL, "EDAR", 91.44d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.MARBESOL, "JGMR", 86.44d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.MARBESOL, "MDMR", 69.93d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Nissan Qashqai", SuppliersEnum.MARBESOL, "IFMR", 88.27d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Fiesta Diesel", SuppliersEnum.MARBESOL, "EDMD", 73.78d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.MARBESOL, "IDMR", 95.47d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDMR", 75.14d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.MARBESOL, "CDAR", 109.5d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.MARBESOL, "EDMR", 70.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen C4 Cactus", SuppliersEnum.MARBESOL, "CGAR", 114.03d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Passat", SuppliersEnum.MARBESOL, "SDAR", 123.09d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.MARBESOL, "FDMR", 195.43d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 1 Series", SuppliersEnum.MARBESOL, "IDAR", 172.81d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Citan", SuppliersEnum.MARBESOL, "CMMD", 78.06d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.RECORD, "CMMV", 33.26d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.RECORD, "CDMR", 26.52d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Nissan Juke", SuppliersEnum.RECORD, "CFMR", 28.64d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.RECORD, "IFMR", 36.3d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.RECORD, "FVMR", 154.59d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.RECORD, "EDMR", 22.23d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.RECORD, "MCMR", 19.1d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.RECORD, "CMMV", 34.8d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.RECORD, "FVAR", 160.75d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Audi A3", SuppliersEnum.SIXT, "ICMR", 186.37d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 2 Series Active Tourer", SuppliersEnum.SIXT, "JDAR", 239.18d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.SIXT, "CWMR", 222.56d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.SIXT, "EDMR", 128.93d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes A Class", SuppliersEnum.SIXT, "ICAV", 254.02d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.SIXT, "MCMR", 97.08d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 2 Series Active Tourer", SuppliersEnum.SIXT, "JDMR", 183.14d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Smart Fortwo", SuppliersEnum.SIXT, "MUMR", 115.76d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.SIXT, "CDMR", 134.45d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Corsa", SuppliersEnum.SIXT, "ECMN", 107.58d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mini Convertible", SuppliersEnum.SIXT, "NTMR", 248.85d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen C4 Cactus", SuppliersEnum.SIXT, "CGAR", 191.54d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.SIXT, "PDAR", 403.22d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.SIXT, "IFAR", 328.62d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.SIXT, "PDMR", 325.38d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.SIXT, "IFMR", 276.73d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Passat Estate", SuppliersEnum.SIXT, "SWMR", 292.78d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.SIXT, "FVMR", 692.45d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.SIXT, "FDMR", 225.18d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.SIXT, "FDAR", 295.22d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.SIXT, "JGMR", 245.09d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.AVIS, "IDMR", 373.69d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.AVIS, "CCMR", 203.32d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.AVIS, "IVAD", 520.49d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.AVIS, "PDAR", 948.24d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.AVIS, "PDAR", 790.36d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.AVIS, "IVMD", 495.74d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Skoda Octavia Diesel", SuppliersEnum.AVIS, "IDMD", 310.22d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.AVIS, "CWMR", 291.28d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Viano", SuppliersEnum.AVIS, "OVAR", 572.44d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy Diesel", SuppliersEnum.AVIS, "FVMD", 520.49d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.AVIS, "MCMR", 145.52d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.AVIS, "IDAR", 465.34d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.AVIS, "EDMR", 160.73d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.AVIS, "SVMR", 624.38d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes A Class", SuppliersEnum.AVIS, "ICAV", 310.56d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.AVIS, "CDMD", 258.69d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.AVIS, "IDMR", 373.69d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.AVIS, "CCMR", 203.32d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.AVIS, "IVAD", 520.49d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.AVIS, "PDAR", 948.24d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes E Class", SuppliersEnum.AVIS, "PDAR", 790.36d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran Diesel", SuppliersEnum.AVIS, "IVMD", 495.74d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Skoda Octavia Diesel", SuppliersEnum.AVIS, "IDMD", 310.22d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.AVIS, "CWMR", 291.28d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Viano", SuppliersEnum.AVIS, "OVAR", 572.44d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy Diesel", SuppliersEnum.AVIS, "FVMD", 520.49d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.AVIS, "MCMR", 145.52d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.AVIS, "IDAR", 465.34d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.AVIS, "EDMR", 160.73d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.AVIS, "SVMR", 624.38d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes A Class", SuppliersEnum.AVIS, "ICAV", 310.56d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf Diesel", SuppliersEnum.AVIS, "CDMD", 258.69d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.BUDGET, "IDMR", 211.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.BUDGET, "CCMR", 177.15d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.BUDGET, "CDMR", 268.97d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.BUDGET, "IDMR", 234.91d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.BUDGET, "CCMR", 196.21d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.BUDGET, "CDMR", 298.48d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.BUDGET, "IDMR", 211.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.BUDGET, "CCMR", 177.15d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.BUDGET, "CDMR", 268.97d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.BUDGET, "IDMR", 211.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.BUDGET, "CCMR", 177.15d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.BUDGET, "CDMR", 268.97d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.BUDGET, "IDMR", 211.89d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Astra", SuppliersEnum.BUDGET, "CCMR", 177.15d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.BUDGET, "CDMR", 268.97d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.DELPASO, "CWMR", 31.35d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Up", SuppliersEnum.DELPASO, "MDMR", 5.92d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.DELPASO, "CDMR", 11.49d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.DELPASO, "IFMR", 41.16d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.DELPASO, "EDMR", 6.23d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.DELPASO, "SVMR", 121.26d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.DELPASO, "MCMR", 5.92d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.THRIFTY, "MCMR", 67.03d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.THRIFTY, "MCMR", 67.03d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Clio Estate", SuppliersEnum.FIREFLY, "EWMR", 45.16d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.FIREFLY, "MCMR", 26.57d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.FIREFLY, "EDMR", 29.79d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.FIREFLY, "CMMV", 35.67d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.FIREFLY, "IVMR", 125.92d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.FIREFLY, "CDMR", 33.84d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.HERTZ, "MCMR", 67.98d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.HERTZ, "MCMR", 60.34d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.ENTERPRISE, "MCMR", 78.1d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Passat", SuppliersEnum.ENTERPRISE, "SDMR", 206.5d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.ENTERPRISE, "EDMR", 105.51d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.ENTERPRISE, "FVMR", 512.95d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.ENTERPRISE, "IVAR", 392.35d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.ENTERPRISE, "CMMV", 212.23d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.ENTERPRISE, "IDMR", 124.84d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.ENTERPRISE, "CDAR", 516.28d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.ENTERPRISE, "JGMR", 268.42d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.ENTERPRISE, "IDAR", 413.05d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.ENTERPRISE, "SVMR",
                579.11d, FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.ENTERPRISE, "IMMR", 224.74d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.ENTERPRISE, "CDMR", 142.05d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Renault Scenic", SuppliersEnum.RHODIUM, "JGMR", 180.47d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("BMW 3 Series", SuppliersEnum.RHODIUM, "FDAR", 409.68d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Focus Estate", SuppliersEnum.RHODIUM, "CWMR", 177.09d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen DS3", SuppliersEnum.RHODIUM, "ESMR", 116.51d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.RHODIUM, "CDAR", 243.55d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.RHODIUM, "CDMR", 104.53d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.RHODIUM, "IDMR", 300.05d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Audi A3", SuppliersEnum.RHODIUM, "ICMR", 130.54d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.RHODIUM, "CMMV", 114.01d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.RHODIUM, "EDMR", 92.9d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Ford Galaxy", SuppliersEnum.RHODIUM, "FVMR", 509.37d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.RHODIUM, "CLMR", 109.76d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.RHODIUM, "IVMR", 359.93d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 107", SuppliersEnum.RHODIUM, "MCMR", 87.36d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.RHODIUM, "IVAR", 383.03d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Mercedes Vito Traveliner", SuppliersEnum.RHODIUM, "SVMR", 565.88d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Avensis", SuppliersEnum.RHODIUM, "IDAR", 153.82d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.FLIZZR, "IFMR", 75.93d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Opel Corsa", SuppliersEnum.FLIZZR, "EBMN", 49.29d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Peugeot 2008", SuppliersEnum.FLIZZR, "EGMR", 78.43d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen C3 Picasso", SuppliersEnum.FLIZZR, "EMMV", 75.93d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.FLIZZR, "CDMR", 87.91d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.FLIZZR, "EDMR", 49.29d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen DS3", SuppliersEnum.FLIZZR, "ESMR", 53.56d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Citroen C1", SuppliersEnum.FLIZZR, "MBMR", 42.54d,
                FuelPolicy.FULLEMPTY));
        CARS.add(new CarResultTO("Toyota Rav4", SuppliersEnum.FLIZZR, "IFMR", 87.73d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Opel Corsa", SuppliersEnum.FLIZZR, "EBMN", 56.51d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Peugeot 2008", SuppliersEnum.FLIZZR, "EGMR", 90.23d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen C3 Picasso", SuppliersEnum.FLIZZR, "EMMV", 87.73d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Golf", SuppliersEnum.FLIZZR, "CDMR", 101.62d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Polo", SuppliersEnum.FLIZZR, "EDMR", 56.51d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen Berlingo", SuppliersEnum.FLIZZR, "CMMV", 113.91d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen DS3", SuppliersEnum.FLIZZR, "ESMR", 61.44d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Volkswagen Touran", SuppliersEnum.FLIZZR, "IVMR", 159.66d,
                FuelPolicy.FULLFULL));
        CARS.add(new CarResultTO("Citroen C1", SuppliersEnum.FLIZZR, "MBMR", 49.08d,
                FuelPolicy.FULLFULL));

        return Collections.unmodifiableCollection(CARS);
    }



}
