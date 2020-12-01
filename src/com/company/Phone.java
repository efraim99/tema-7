package com.company;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Electronics {
    private Double display;

    public Phone(String brand, String color, Double display) {
        super(brand, color);
        this.display = display;
    }

    public Double getDisplay() {
        return display;
    }

    public void setDisplay(Double display) {
        this.display = display;
    }


    public String toString(String brand, String color) {
        return
                "Phone{" +
                        "brand='" + brand + '\'' +
                        ", color='" + color + '\'' +
                        ", display=" + display +
                        '}';
    }

    protected void writeContent(Writer writer) {
        List<Phone> phoneList = getPhones();

        for (Phone phone :
                phoneList) {
            try {
                writer.write("brand: " + phone.getBrand() + "; color: " + phone.getColor() +
                        "; display" + phone.getDisplay() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected List<Phone> getPhones() {
        List<Phone> phoneList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            phoneList.add(new Phone("brand" + i, "color" + i, i * 0.23));
        }
        return phoneList;
    }
}

