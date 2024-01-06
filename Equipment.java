/*
Design and implement a set of classes that define various types
of electronics equipment (computers, cell phones, pagers, digital
cameras, and so on). Include data values that describe various
attributes of the electronics, such as the weight, cost, power
usage, and name of the manufacturer. Include methods that are
named appropriately for each class and that print an appropri-
ate message. Create a driver class to instantiate and exercise
several of the classes.
*/
class ElectronicEquipment {
    protected String manufacturer;
    protected double weight;
    protected double cost;
    protected double powerUsage;

    public ElectronicEquipment(String manufacturer, double weight, double cost, double powerUsage) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.cost = cost;
        this.powerUsage = powerUsage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public void diplayInfo() {
        System.out.println("maufacturer: " + this.manufacturer);
        System.out.println("cost: " + this.cost);
        System.out.println("weight: " + this.weight);
        System.out.println("powerUsage: " + this.powerUsage);
    }
}

class Computer extends ElectronicEquipment {
    private int ram;
    private String cpu;
    private int storage;

    public Computer(String manufacturer, double weight, double cost, double powerUsage, int ram, String cpu,
            int storage) {
        super(manufacturer, weight, cost, powerUsage);
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void diplayInfo(){
        super.diplayInfo();
        System.out.println("RAM: "+ram);
        System.out.println("CPU: "+cpu);
        System.out.println("Storage: "+storage);
    }
}

public class Equipment {
    public static void main(String[] args) {
        Computer laptop =new Computer("HP", 1000, 20000, 240,8,"Intel",520);
        laptop.diplayInfo();
    }
}
