package Baitap1;

public class Office {
    private String Name ;
    private int Age ;
    private String Sex ;
    private String Address ;


    public Office(String name, int age, String sex, String address) {
        Name = name;
        Age = age;
        this.Sex = sex;
        this.Address = address;
    }

    @Override
    public String toString() {
        return "Office{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Sex='" + Sex + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }

    public String getAddress() {
        return Address;
    }
}
