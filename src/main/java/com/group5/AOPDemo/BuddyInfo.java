package com.group5.AOPDemo;

public class BuddyInfo {

    private String name;
    private String address;
    private String phone_num;

    public BuddyInfo()
    {
        this.name = "Bob";
        this.address = "Carleton";
        this.phone_num = "111-111-1111";
    }

    public BuddyInfo(String name, String address, String phone_num) {
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_num='" + phone_num + '\'';
    }

    public static void main(String[] args)
    {
        BuddyInfo friend1 = new BuddyInfo("Homer", "Carleton", "613");
        System.out.println ("Hello, " + friend1.getName());
    }
}
