package org.example.Service;

import org.example.Data.ComplexNumbers;
import org.example.Data.RationalNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator implements CalcInterface {

    private List<ComplexNumbers> complexNumbers;
    private List<RationalNumbers> rationalNumbers;

    public Calculator() {
        this.complexNumbers = new ArrayList<>();
        this.rationalNumbers = new ArrayList<>();
    }


    @Override
    public List<ComplexNumbers> getAllComplexNumbers() {
        return complexNumbers;
    }

    @Override
    public List<RationalNumbers> getallRationalNumbers() {
        return rationalNumbers;
    }

    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        ComplexNumbers complexNumber1 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        ComplexNumbers complexNumber2 = new ComplexNumbers(x, y);
        complexNumbers.add(complexNumber2);
    }

    @Override
    public void createCoupleRationalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        List<RationalNumbers> list = new ArrayList<>();
        System.out.println("Введите числитель первого числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель первого числа");
        y = scanner.nextInt();
        RationalNumbers rationalNumber1 = new RationalNumbers(x, y);
        rationalNumbers.add(rationalNumber1);
        System.out.println("Введите числитель второго числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель второго числа");
        y = scanner.nextInt();
        RationalNumbers rationalNumber2 = new RationalNumbers(x, y);
        rationalNumbers.add(rationalNumber2);

    }

    @Override
    public ComplexNumbers addition(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(x.getNumerator() + y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() + y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumbers subtraction(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(x.getNumerator() - y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumbers multiplication(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator((x.getNumerator() * y.getNumerator()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        z.setImaginaryPart((x.getImaginaryPart() * y.getNumerator()) +
                (x.getNumerator() * y.getImaginaryPart()));
        return z;
    }

    @Override
    public ComplexNumbers division(ComplexNumbers x, ComplexNumbers y) {
        ComplexNumbers z = new ComplexNumbers(0.0, 0.0);
        z.setNumerator(((x.getNumerator() * y.getNumerator()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart())));
        z.setImaginaryPart((((x.getImaginaryPart() * y.getNumerator()) -
                (x.getNumerator() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart()))));
        return z;
    }

    @Override
    public RationalNumbers addition(RationalNumbers x, RationalNumbers y) {
        return x;
    }

    @Override
    public RationalNumbers subtraction(RationalNumbers x, RationalNumbers y) {
        return x;
    }

    @Override
    public RationalNumbers multiplication(RationalNumbers x, RationalNumbers y) {
        return x;
    }

    @Override
    public RationalNumbers division(RationalNumbers x, RationalNumbers y) {
        return x;
    }
}
