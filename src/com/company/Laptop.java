package com.company;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Laptop extends Electronics {
    private Double weight;
    private String series;


    public Laptop(String brand, String color, Double weight, String series) {
        super(brand, color);
        this.weight = weight;
        this.series = series;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String toString(String brand, String color, Boolean show) {
        if (show)
            return
                    "Phone{" +
                            "brand='" + brand + '\'' +
                            ", color='" + color + '\'' +
                            ", series='" + series + '\'' +
                            ", weight=" + weight + '\'' +
                            '}';
        else return "LAPTOP NOT AVAILABLE(show is off)";
    }

    @Override
    protected void writeContent(Writer writer) {
        List<Laptop> laptopsList = getLaptops();
        for (Laptop laptop :
                laptopsList) {
            try {
                writer.write("brand: " + laptop.getBrand() + "; color: " + laptop.getColor() +
                        "; weight" + laptop.getWeight() + "; series: " + laptop.getSeries() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected List<Laptop> getLaptops() {
        List<Laptop> laptopList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            laptopList.add(new Laptop("brand" + i, "color" + i, 1.2 + i, "CODJ" + i));
        }
        return laptopList;
    }
}

