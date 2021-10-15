package ws3;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Disk {

    public static String owner;
    public static String color;
    public static double radius;
//    public double getArea();
//    public double getPerimeter();
//    public void paint();
    //constructor

    public Disk(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%6.2f|%6.2f|%6.2f\n",
                "DISK", owner, color, radius, getArea(), getPerimeter());
    }

    public static void informationDisk() {
        Scanner sc = new Scanner(System.in);
        Disk d1 = new Disk(owner, color, radius);
        System.out.println("Owner: Older sister/ Na baby/ Lover's Na");
        System.out.println("Input owner: ");
        d1.setOwner(sc.nextLine());
        System.out.println("Color: Yellow/ Blue/ Red");
        System.out.println("Input color");
        d1.setColor(sc.nextLine());
        while (true) {
            try {
                System.out.println("Input radius: ");
                d1.setRadius(Double.parseDouble(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("False input! Please input radius again ^^");
            }
        }
        d1.paint();
    }
}
