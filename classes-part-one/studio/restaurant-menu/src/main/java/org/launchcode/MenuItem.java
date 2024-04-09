package org.launchcode;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.dateAdded = dateAdded;

        Date today = new Date();

        if (today.compareTo(dateAdded) <= 30) {
            isNew = true;
        }
        else {
            isNew = false;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", name='" + name + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }
}