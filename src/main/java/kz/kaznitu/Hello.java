package kz.kaznitu;

import org.joda.time.LocalDate;

import javax.swing.*;

public class Hello {
    public static void main(String[] args) {
        LocalDate date = new LocalDate() ;
        String dateStr = date.toString() ;

        JOptionPane.showMessageDialog(null, "Hello World! " + dateStr);
    }
}
