package org.example.Service;

import org.example.Data.ComplexNumbers;
import org.example.Data.RationalNumbers;

import java.util.List;

public interface CalcInterface {
    public List<ComplexNumbers> getAllComplexNumbers();

    public List<RationalNumbers> getallRationalNumbers();

    public void createCoupleComplexNumbers();

    public void createCoupleRationalNumbers();

    public ComplexNumbers addition(ComplexNumbers x, ComplexNumbers y);

    public ComplexNumbers subtraction(ComplexNumbers x, ComplexNumbers y);

    public ComplexNumbers multiplication(ComplexNumbers x, ComplexNumbers y);

    public ComplexNumbers division(ComplexNumbers x, ComplexNumbers y);

    public RationalNumbers addition(RationalNumbers x, RationalNumbers y);

    public RationalNumbers subtraction(RationalNumbers x, RationalNumbers y);

    public RationalNumbers multiplication(RationalNumbers x, RationalNumbers y);

    public RationalNumbers division(RationalNumbers x, RationalNumbers y);
}
