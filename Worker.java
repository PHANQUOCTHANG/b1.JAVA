package Baitap1;

public class Worker extends Office{
    private int Tier ;

    public Worker(String name, int age, String sex, String address, int tier) {
        super(name, age, sex, address);
        Tier = tier;
    }
}
