package org.example.View;


import java.util.Scanner;

public class View implements ViewInterface {

    Scanner in = new Scanner(System.in);

    public int get() {
        return in.nextInt();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }

}
