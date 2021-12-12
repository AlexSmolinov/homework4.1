package com.company.train;

public abstract class Train{

    int numberTrain;
    String typeTrain;
    int quantityWagons;
    boolean inWay = false;

    public Train (int numberTrain, String typeTrain, int quantityWagons) {
        this.numberTrain = numberTrain;
        this.typeTrain = typeTrain;
        this.quantityWagons = quantityWagons;
    }

    public void info() {
        System.out.println("Номер поезда: " + numberTrain);
        System.out.println("Тип поезда: " + typeTrain);
        System.out.println("Количество вагонов: " + quantityWagons);
    }

    public void requiredStaff () {
        System.out.println("Необходимый персонал для отправки:");
        System.out.println("   1 машинист");
        System.out.println("   1 инженер");
    }

    public void goRoute () {
        if (!inWay) {
            System.out.println("Поезд номер " + numberTrain + " отправляется.");
            System.out.println("Тип поезда: " + typeTrain);
            System.out.println("Количество вагонов: " + quantityWagons);
            inWay = true;
        } else {
            System.out.println("Поезд номер" + numberTrain + "ещё в пути.");
        }
    }

    public void endRoute () {
        if (inWay) {
            System.out.println("Поезд номер " + numberTrain + " прибыл.");
            System.out.println("Тип поезда: " + typeTrain);
            System.out.println("Количество вагонов: " + quantityWagons);
            inWay = false;
        } else {
            System.out.println("Поезд номер" + numberTrain + "ещё не начал путь.");
        }
    }
}
