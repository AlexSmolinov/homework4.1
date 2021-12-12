package com.company.staff;

import com.company.interfaces.Go;
import com.company.interfaces.Transfere;

public class Engineer extends Staff implements Transfere, Go {

    public Engineer(String name, String surname, int age, char sex) {
        super(name, surname, age, sex, "инженер");
    }

    public void fix() {
        System.out.println("Инженер " + name + " чинит неполадки.");
    }

    @Override
    public void transfer(Object luggage, String place) {
            System.out.printf("Перемещаем %s в %s\n", luggage, place);
    }

    @Override
    public void go(String place) {
        System.out.println("Поийти в " + place);
    }
}
