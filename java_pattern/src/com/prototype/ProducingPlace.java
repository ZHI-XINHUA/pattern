package com.prototype;

public class ProducingPlace implements Cloneable{
    private String province;
    private String city;

    public ProducingPlace(String province,String city){
        this.province = province;
        this.city =city;
        System.out.println("ProducingPlace constructor");
    }

    public ProducingPlace clone(){
        ProducingPlace p = null;
        try {
            p = (ProducingPlace)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public String toString() {
        return "ProducingPlace:"+super.toString();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
