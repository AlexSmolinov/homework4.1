package com.company.staff;

public abstract class Staff {

    String name;
    String surname;
    int age;
    char sex;
    int workingDaysInTheCompany = 0;
    boolean working = false;

    public Staff(String name, String surname, int age, char sex, String post) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        System.out.println(surname + " " + name + " рады видеть у нас в команде на должности " + post + ".");
        System.out.println();
    }

    public void startWorkingDay () {
        if (!working) {
            workingDaysInTheCompany += 1;
            System.out.println( surname + " " + name + " начал рабочий день.");
            working = true;
        } else {
            System.out.println("Предыдущий рабочий день не завершён!");
        }

    }

    public void endWorkingDay () {
        if (working) {
            System.out.println( surname + " " + name + " закончил рабочий день.");
            System.out.println("Отработанных дней в компании: " + workingDaysInTheCompany);
            working = false;
        } else {
            System.out.println("Рабочий день ещё не начался!");
        }
    }

}
