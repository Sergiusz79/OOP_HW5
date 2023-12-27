package org.example;

import org.example.Controller.Controller;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;


public class App {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Controller.class.getName());
//        FileHandler fh = new FileHandler("c:\\Users\\Admin\\OneDrive\\Документы\\Учёба\\Programming" +
//                "\\OOP_HW5\\src\\main\\java\\org\\example\\log.txt");
        FileHandler fh = new FileHandler("c:\\Users\\Admin\\OneDrive\\Документы\\Учёба\\Programming" +
                "\\OOP_HW5\\src\\main\\java\\org\\example\\log.xml");
        logger.addHandler(fh);
//        SimpleFormatter sf = new SimpleFormatter();
//        fh.setFormatter(sf);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);


        Controller controller = new Controller();
        controller.start();
    }


}