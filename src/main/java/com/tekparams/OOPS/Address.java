package com.tekparams.OOPS;

public class Address {
    // Data Memebers or Variables
    String doorNo;
    String street;
    String city;
    int pinCode;
    boolean flag;

    // Default Constructor
    Address(){
        doorNo="D100";
        street="ABC Street";
        city="Bangalore";
        pinCode=560076;
    }
    Address(String doorNo, String street, String city, int pinCode){
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
        this.pinCode=pinCode;
    }

    // Method
    void printAddress(){
        System.out.println(doorNo);
        System.out.println(street);
        System.out.println(city);
        System.out.println(pinCode);
    }
    boolean changeAddress(String doorNo, String street, String city, int pinCode){
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
        this.pinCode=pinCode;
        boolean flg =true;
        return flg;
    }
    public static void main(String[] args){
        Address address = new Address();
        Address address1 = new Address();
        Address address2 = new Address("D400","BCS Street","Hyderabad",654645);
        address.printAddress();
        address.doorNo="D200";
        address.street="XYZ Street";
        address.city="Bangalore";
        address.pinCode=560001;
        address.printAddress();
        System.out.println();
        address1.printAddress();
        address1.doorNo="D300";
        address1.street="MNC Street";
        address1.city="Chennai";
        address1.pinCode=600001;
        System.out.println();
        address1.printAddress();
        System.out.println();
        address2.printAddress();
        address2.doorNo="D500";
        address2.street="FDADFAF";
        address2.city="Mumbai";
        address2.pinCode=54646;
        System.out.println();
        address2.printAddress();
        boolean flag1=address2.changeAddress("45","sdaf","Bangalore",565001);
        if (flag1==true){
            System.out.println("Address printed");
        }
    }
}
