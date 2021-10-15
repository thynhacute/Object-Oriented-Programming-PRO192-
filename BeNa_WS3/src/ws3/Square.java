package ws3;

import java.util.Scanner;

public class Square {

    public static String owner;
    public static String color;
    public static double edge;

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return edge * 4;
    }

    public void paint() {
        System.out.printf("|%-20s|%-20s|%-20s|%6.2f|%6.2f|%6.2f\n",
                "SQUARE", owner, color, edge, edge, getArea(), getPerimeter());
    }

    public static void informationSquare() {
        Scanner sc = new Scanner(System.in);
        Square s1 = new Square(owner, color, 0);
        System.out.println("Owner: Dad/ Mom/ Lover's older brother");
        System.out.println("Input owner: ");
        s1.setOwner(sc.nextLine());
        System.out.println("Color: Pink/ Green/ Purple");
        System.out.println("Input color");
        s1.setColor(sc.nextLine());
        while (true) {
            try {
                System.out.println("Input edge: ");
                s1.setEdge(Double.parseDouble(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("False input! Please input edge again ^^");
            }
        }
        s1.paint();
    }
}
