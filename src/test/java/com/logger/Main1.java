package com.logger;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException {
        ConstructionCost c = new ConstructionCost();
        Scanner sc = new Scanner(System.in);
        System.out.write("Materials Available:\n 1. Standard Materail \n 2. Above Standard Material\n 3. High Standard Material\n 4. High Standard Material and full automated\n".getBytes());
        System.out.write("Enter type of material\n".getBytes());
        c.type = sc.nextLine();
        System.out.write("Enter the area of the house\n".getBytes());
        c.area = sc.nextDouble();
        if (c.type.equalsIgnoreCase("standard material")) {
            c.standardMaterial();
        } else if (c.type.equalsIgnoreCase("above standard material")) {
            c.abovesStandardMaterial();
        } else if (c.type.equalsIgnoreCase("high standard material")) {
            c.highStandardMaterial();
        } else if (c.type.equalsIgnoreCase("high standard material and full automated")) {
            c.standardMaterialAndAutomatedHome();
        } else {
            System.out.write("enter proper type of materail".getBytes());
        }
    }
}
