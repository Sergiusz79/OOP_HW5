package org.example.Controller;

import org.example.Data.ComplexNumbers;
import org.example.Data.RationalNumbers;
import org.example.Service.Calculator;
import org.example.View.View;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;


public class Controller {
    Logger logger = Logger.getLogger(Controller.class.getName());


    Calculator calculator = new Calculator();
    View userView = new View();

    public Controller() throws IOException {
    }

    public void start() {
        logger.info(" Start ");
        userView.set("""
                Выберете числа:
                1 - Комплкесные числа
                2 - рациональные числа
                0 - выход
                """);
        int answer = userView.get();


        switch (answer) {
            case 1:
                logger.info(" User selected = 1 - Комплкесные числа ");
                calculator.createCoupleComplexNumbers();
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 2:
                logger.info(" User selected = 2 - рациональные числа ");
                calculator.createCoupleRationalNumbers();
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 0:
                logger.info(" User selected = 0 - выход ");
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
        int answer = userView.get();
        List<RationalNumbers> list = calculator.getallRationalNumbers();
        RationalNumbers rationalNumber;
        switch (answer) {
            case 1:
                logger.info(" User selected = 1 - сложить числа ");
                rationalNumber = calculator.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 2:
                logger.info(" User selected = 2 - вычесть первое число из второго ");
                rationalNumber = calculator.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 3:
                logger.info(" User selected = 3 - вычесть второе число из первого ");
                rationalNumber = calculator.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 4:
                logger.info(" User selected = 4 - перемножить числа ");
                rationalNumber = calculator.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 5:
                logger.info(" User selected = 5 - разделить первое число на второе ");
                rationalNumber = calculator.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 6:
                logger.info(" User selected = 6 - разделить второе число на первое ");
                rationalNumber = calculator.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 7:
                logger.info(" User selected = 7 - показать все введённые числа и ответы ");
                workWithRationalNumbers(calculator.getallRationalNumbers());
                break;
            case 8:
                logger.info(" User selected = 8 - ввести новые числа ");
                start();
                break;
            case 0:
                logger.info(" User selected = 0 - выход ");
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
        int answer = userView.get();
        List<ComplexNumbers> list = calculator.getAllComplexNumbers();
        ComplexNumbers complexNumber;
        switch (answer) {
            case 1:
                logger.info(" User selected = 1 - сложить числа ");
                complexNumber = calculator.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 2:
                logger.info(" User selected = 2 - вычесть первое число из второго ");
                complexNumber = calculator.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 3:
                logger.info(" User selected = 3 - вычесть второе число из первого ");
                complexNumber = calculator.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 4:
                logger.info(" User selected = 4 - перемножить числа ");
                complexNumber = calculator.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 5:
                logger.info(" User selected = 5 - разделить первое число на второе ");
                complexNumber = calculator.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 6:
                logger.info(" User selected = 6 - разделить второе число на первое ");
                complexNumber = calculator.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 7:
                logger.info(" User selected = 7 - показать все введённые числа и ответы ");
                workWithComplexNumbers(calculator.getAllComplexNumbers());
                break;
            case 8:
                logger.info(" User selected = 8 - ввести новые числа ");
                start();
                break;
            case 0:
                logger.info(" User selected = 0 - выход ");
                return;
            default:
                workWithComplexNumbers(calculator.getAllComplexNumbers());
        }


    }

}
