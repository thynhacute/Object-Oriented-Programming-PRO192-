package ws3;

import java.util.Scanner;

public class Rectangle {

    public static String owner;
    public static String color;
    public static double width;
    public static double length;

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public void paint() {
        System.out.printf("|%-20s|%-20s|%-20s|%6.2f|%6.2f|%6.2f|%6.2f\n",
                "RECTANGLE", owner, color, width, length, getArea(), getPerimeter());
    }

    public static void informationRectangle() {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(owner, color, width, length);
        System.out.println("Owner: Dad/ Mom/ Older brother");
        System.out.println("Input owner: ");
        r1.setOwner(sc.nextLine());
        System.out.println("Color: Red/ Green/ Blue");
        System.out.println("Input color");
        r1.setColor(sc.nextLine());
        while (true) {
            try {
                System.out.println("Input width: ");
                r1.setWidth(Double.parseDouble(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("False input! Please input width again ^^");
            }
        }
        while (true) {
            try {
                System.out.println("Input length: ");
                r1.setLength(Double.parseDouble(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("False input! Please input length again ^^");
            }
        }
        r1.paint();
    }
}
