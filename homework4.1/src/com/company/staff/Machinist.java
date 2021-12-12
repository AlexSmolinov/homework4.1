package com.company.staff;

import com.company.interfaces.Go;
import com.company.interfaces.Transfere;

public class Machinist extends Staff implements Transfere, Go {

    public Machinist(String name, String surname, int age, char sex) {
        super(name, surname, age, sex,"машинист");
    }

    public void autopilotAndTea () {
        System.out.println("Машинист " + name + " поставил автоплот и пошёл пить чай.");
    }

    @Override
    public void transfer(Object luggage, String place) {
            System.out.printf("Перемещаем %s в %s\n", luggage, place);
    }

    @Override
    public void go(String place) {
        System.out.println("Пойти в " + place);
    }
}
