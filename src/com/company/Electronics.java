package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public abstract class Electronics {
    private String brand;
    private String color;

    public Electronics(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void exportFile(String fileName) {
        File file = new File(fileName);
        try (
                Writer writer = new FileWriter(file)) {
            writeContent(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract void writeContent(Writer writer);

}
