package com.java.davoryunsavory.PizzaComp;

public class Item {

    String name;
    int id;
    double measure;
    int max;

    public Item(int id) {
        this.id = id;
    }

    public void setName(String setName) {
        name = setName;
    }

    public void setMeasure(double setMeasure) {
        measure = setMeasure;
    }

    public void setMax(int setMax) {
        max = setMax;
    }
    public void printItem() {
        System.out.println("Name: "+ name );
        System.out.println("ID: " + id );
        System.out.println("Measure: " + measure );
        System.out.println("Max: " + max);
     }

    public static void main(String[] args) {
        Item itemOne = new Item(1);

        itemOne.setMax(2);
        itemOne.setName("Regular Crust");
        itemOne.setMeasure(2);
        itemOne.printItem();
    }
}
