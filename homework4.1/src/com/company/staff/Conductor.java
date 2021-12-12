package com.company.staff;

import com.company.interfaces.Go;
import com.company.interfaces.Transfere;

public class Conductor extends Staff implements Transfere, Go {

    public Conductor(String name, String surname, int age, char sex) {
        super(name, surname, age, sex, "проводник");
    }

    public void checkTickets () {
        System.out.println("Проводник " + name + " проверяет билеты");
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
