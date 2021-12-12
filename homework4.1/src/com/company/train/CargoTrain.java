package com.company.train;

import com.company.interfaces.Go;
import com.company.interfaces.Transfere;

public class CargoTrain extends Train implements Transfere, Go {

    public CargoTrain(int numberTrain,  int quantityWagons) {
        super(numberTrain, "Грузовой", quantityWagons);
    }

    @Override
    public void transfer(Object luggage, String place) {
            System.out.printf("Перемещаем %s в %s\n", luggage, place);
    }

    @Override
    public void go(String place) {
        System.out.println("Передвигаемся в " + place);
    }
}
