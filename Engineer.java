package Baitap1;

public class Engineer extends Office{
    private String Branch ;


    public Engineer(String name, int age, String sex, String address, String branch) {
        super(name, age, sex, address);
        this.Branch = branch;
    }
}
