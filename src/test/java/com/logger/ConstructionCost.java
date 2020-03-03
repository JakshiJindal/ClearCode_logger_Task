package com.logger;

import java.io.IOException;

public class ConstructionCost {
    double area, cost;
    String type;
    public void standardMaterial() throws IOException {
        cost = area * 1200;
        System.out.write(("Cost if we use Standard Material :\n" + cost).getBytes());
    }
    public void abovesStandardMaterial() throws IOException {
        cost = area * 1500;
        System.out.write(("Cost if we use Above Standard Material :" + cost).getBytes());
    }
    public void highStandardMaterial() throws IOException {
        cost = area * 1800;
        System.out.write(("Cost if we use High Standard Material :" + cost).getBytes());
    }
    public void standardMaterialAndAutomatedHome() throws IOException {
        cost = area * 2500;
        System.out.write(("Cost if we use High Standard Material and full automated home :" + cost).getBytes());
    }
}
