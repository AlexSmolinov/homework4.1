package com.company.train;

import com.company.interfaces.Go;
import com.company.interfaces.Transfere;

public class PassengerTrain extends Train implements Go {

    String typeTrain = "Пассажирский";

    public PassengerTrain(int numberTrain, int quantityWagons) {
        super(numberTrain, "Пассажирский", quantityWagons);
    }

    @Override
    public void requiredStaff() {
        System.out.println("Необходимый персонал для отправки:");
        System.out.println("   1 машинист");
        System.out.println("   1 инженер");
        System.out.println("   " + quantityWagons + " проводников");
    }

    @Override
    public void go(String place) {
        System.out.println("Отпраиться до " + place);
    }
}
