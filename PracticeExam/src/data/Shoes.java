/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
/**
 *
 * @author NhaThy
 */

public class Shoes {
    private String code;
    private String name;
    private String brandName;
    private double size;
    private double price;

    public Shoes(String code, String name, String brandName, double size, double price) {
        this.code = code;
        this.name = name;
        this.brandName = brandName;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes{" + "code=" + code + ", name=" + name + ", brandName=" + brandName + ", size=" + size + ", price=" + price + '}';
    }

    
    public void showInformation() {
        String msg = String.format("|%-10s|%-15s|%-10s|%10.2f|%7.2f|",
                code, name, brandName, size, price);
        System.out.println(msg);
    }
}
