package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.MyToys;

/**
 *
 * @author NhaThy
 */

public class Cabinet {
    private ArrayList<Shoes> shoesList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    
    public void addNewShoes() {
        String code, name, brandName;
        double price, size;
        int pos;
        do{
            code = MyToys.getCode("Input the Code of the Shoes: ",
                    "The Code of the Shoes must not exist yet.");
            pos = searchShoesByCode(code);
            if (pos >= 0){
                System.out.println("The Code of the Shoes already exists."
                 + " Input another one!");
            }
        } while(pos != -1);
        name = MyToys.getString("Input the Model/Name of the Shoes: ", "The Shoes name is required!");
        brandName = MyToys.getString("Input the Brand Name of the Shoes: ", "The Brand Name of the Shoes is required!");
        size = MyToys.getAnDouble("Input the Size of the Shoes: (Ex: 1, 2, 3,...)",
                "The Size of Shoes must be greater than 0.", 0);
        price = MyToys.getAnDouble("Input the Price of the Shoes",
                 "The Price of Shoes must be greater than 0.", 0);
        shoesList.add(new Shoes(code, name, brandName, size, price));
        System.out.println("A Shoes information is added sucessfully");
        for (Shoes x : shoesList) {
            x.showInformation();
        }
    }
    
    public int searchShoesByCode(String code) {
        int pos;
        if (shoesList.isEmpty())
            return -1;
        for (int i = 0; i < shoesList.size() - 1; i++) {
            if (shoesList.get(i).getCode().equalsIgnoreCase(code))
                return i;
        }
        return -1;
    }
    
    //Đưa Code ---> giày (object)
    public Shoes searchShoesObjectByCode(String code) {
        if (shoesList.isEmpty())
            return null;
        for (Shoes x : shoesList) {
            if (x.getCode().equalsIgnoreCase(code))
                return x;
        }
        return null;
    }

    //Đưa code) ---> show full thông tin giày
    public void searchShoesByCode() {
        String code;
        Shoes x;
        code = MyToys.getString("Input Code of the Shoes you want to find: ", "Shoes Code is required!");
        x = searchShoesObjectByCode(code);

        System.out.println("-------------------");
        if (x == null)
            System.out.println("Not Found!!!");
        else {
            System.out.println("Here is the information of the Shoes"
                    + "that you want to search: ");
            x.showInformation();
        }
    }
    
    //in danh sách giày giảm dần theo giá
    public void printShoesListDescendingByPrice() {
        if (shoesList.isEmpty()) {
            System.out.println("The Shoes Cabinet is empty. Nothing to print");
            return;
        }
        Comparator nameBalance = new Comparator<Shoes>() {
            @Override
            public int compare(Shoes p1, Shoes p2) {
                if (p1.getPrice() < p2.getPrice())
                    return 1;
                return -1;
            }
        };
        Collections.sort(shoesList, nameBalance);
        System.out.println("-----------------------------");
        System.out.println("Here is the Shoes List");
        String header = String.format("|%-10s|%-15s|%-10s|%-10s|%-7s|", "CODE", "NAME",
                "BRANDNAME", "SIZE", "PRICE");
        System.out.println(header);
        for (Shoes x : shoesList) {
            x.showInformation();
        }
    }
    
    //in danh sách giày tăng dần by name
    public void printShoesListAscendingByName(){
        if(shoesList.isEmpty()){
            System.out.println("The Shoes Cabinet is empty. Nothing to print");
            return;
        }
        
        Comparator nameBalance =  new Comparator<Shoes>(){
            @Override
            public int compare(Shoes p1, Shoes p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        };
        Collections.sort(shoesList,nameBalance);
        System.out.println("-------------------------------------");
        System.out.println("Here is the Shoes List");
        String header = String.format("|%-10s|%-15s|%-10s|%-10s|%-7s|", "CODE", "NAME",
                "BRANDNAME", "SIZE", "PRICE");
        System.out.println(header);
        for (Shoes x : shoesList) {
            x.showInformation();
        }
    }
    
    public void printShoesListAscendingByCode(){
        if(shoesList.isEmpty()){
            System.out.println("The Shoes Cabinet is empty. Nothing to print");
            return;
        }
        Comparator nameBalance = new Comparator<Shoes>() {
            @Override
            public int compare(Shoes p1, Shoes p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        };
        Collections.sort(shoesList, nameBalance);
        System.out.println("-----------------------------");
        System.out.println("Here is the Shoes List");
        String header = String.format("|%6s|%-15s|%4s|%4s|%4s|", "ID","NAME",
                "YOB","WEIGHT","SPD");
        System.out.println(header);
        for (Shoes x : shoesList){
            x.showInformation();
        }
    }
}
