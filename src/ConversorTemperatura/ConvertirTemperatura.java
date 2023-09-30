package ConversorTemperatura;

import javax.swing.*;

public class ConvertirTemperatura {

    public void CelciusToFarenheit(double grados) {
        double farenheit = grados * 9 / 5 + 32;
        JOptionPane.showMessageDialog(null,grados + " grados Centígrados es igual a: " + farenheit + " grados Farenheit" );
    }

    public void FarenheitToCelcius(double grados) {
        double celcius = (grados - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null,grados + " grados Farenheit es igual a: " + celcius + " grados Centígrados" );
    }
}
