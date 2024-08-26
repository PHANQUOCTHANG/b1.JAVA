package Baitap1;

public class Staff extends Office{
    private String Work ;

    public Staff(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
        Work = work;
    }
}
