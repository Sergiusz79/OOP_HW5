package org.example.View;

import java.util.List;
import java.util.Scanner;

public class View implements ViewInterface {

    public String log = "";
    Scanner in = new Scanner(System.in);

    public int get() {
        return in.nextInt();
    }

    ;

    @Override
    public void set(String value) {
        System.out.println(value);
    }

    @Override
    public void appendLog(String log) {
        this.log += log + "\n";
    }

    @Override
    public void appendLog(List list) {
        this.log += list.get(list.size() - 2).toString() + " " + list.get(list.size() - 1).toString();
    }

    @Override
    public void showLog() {
        System.out.println(this.log);

    }
}
