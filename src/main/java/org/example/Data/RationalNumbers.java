package org.example.Data;

public class RationalNumbers {
    private int num;
    private int denum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenum() {
        return denum;
    }

    public void setDenum(int denum) {
        this.denum = denum;
    }

    public RationalNumbers(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return "RationalNumbers{" + num + "/" + denum + '}';
    }
}
