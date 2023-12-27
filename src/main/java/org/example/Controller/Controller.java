package org.example.Controller;

import org.example.Data.ComplexNumbers;
import org.example.Data.RationalNumbers;
import org.example.Service.Calculator;
import org.example.View.View;

import java.util.List;

public class Controller {
    Calculator calculator = new Calculator();
    View userView = new View();

    public void start() {
        userView.set("""
                Выберете числа:
                1 - Комплкесные числа
                2 - рациональные числа
                0 - выход
                """);
        int answer = userView.get();


        switch (answer) {
            case 1:
                calculator.createCoupleComplexNumbers();
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                userView.appendLog("workWithComplexNumbers");
                break;
            case 2:
                calculator.createCoupleRationalNumbers();
                workWithRationalNumbers(calculator.getallRationalNumbers());
                userView.appendLog("workWithRationalNumbers");
                break;
            case 0:
                return;

            default:
                start();
        }
    }

    private void workWithRationalNumbers(List<RationalNumbers> rationalNumbers) {
        userView.set("""
                Выберете функцию:
                1 - сложить числа
                2 - вычесть первое число из второго
                3 - вычесть второе число из первого
                4 - перемножить числа
                5 - разделить первое число на второе
                6 - разделить второе число на первое
                7 - показать все введённые числа и ответы
                8 - ввести новые числа
                0 - выход
                """);
        userView.appendLog(calculator.getallRationalNumbers());
        int answer = userView.get();
        List<RationalNumbers> list = calculator.getallRationalNumbers();
        RationalNumbers rationalNumber;
        switch (answer) {
            case 1:
                rationalNumber = calculator.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" addition Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 2:
                rationalNumber = calculator.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 3:
                rationalNumber = calculator.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 4:
                rationalNumber = calculator.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" multiplication Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 5:
                rationalNumber = calculator.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 6:
                rationalNumber = calculator.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" division Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 7:
                System.out.println(userView.log);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 8:
                start();
                break;
            case 0:
                return;
            default:
                workWithRationalNumbers(calculator.getallRationalNumbers());
        }
    }

    private void workWithComplexNumbers(List<ComplexNumbers> allComplexNumbers) {
        userView.set("""
                Выберете функцию:
                1 - сложить числа
                2 - вычесть первое число из второго
                3 - вычесть второе число из первого
                4 - перемножить числа
                5 - разделить первое число на второе
                6 - разделить второе число на первое
                7 - показать все введённые числа и ответы
                8 - ввести новые числа
                0 - выход
                """);
        userView.appendLog(calculator.getAllComplexNumbers());
        int answer = userView.get();
        List<ComplexNumbers> list = calculator.getAllComplexNumbers();
        ComplexNumbers complexNumber;
        switch (answer) {
            case 1:
                complexNumber = calculator.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" addition Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 2:
                complexNumber = calculator.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 3:
                complexNumber = calculator.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 4:
                complexNumber = calculator.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" multiplication Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 5:
                complexNumber = calculator.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 6:
                complexNumber = calculator.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 7:
                System.out.println(userView.log);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 8:
                start();
                break;
            case 0:
                return;
            default:
                workWithComplexNumbers(calculator.getAllComplexNumbers());
        }


    }

}
