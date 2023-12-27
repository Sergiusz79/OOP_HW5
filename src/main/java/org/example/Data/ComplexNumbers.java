package org.example.Data;

public class ComplexNumbers {
    private double real;

    private double im;

    public ComplexNumbers(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public double getNumerator() {
        return real;
    }

    public void setNumerator(double numerator) {
        this.real = numerator;
    }

    public double getImaginaryPart() {
        return im;
    }

    public void setImaginaryPart(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        if (im >= 0) {
            return "ComplexNumber{" + real + "+" + im + "i}";
        } else {
            return "ComplexNumber{" + real + im + "i}";
        }
    }
}
