package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem myItem = new MenuItem("Food", 5.00, "Something to eat", "Food", new Date("1/1/2024"));
        System.out.println(myItem);

    }
}
