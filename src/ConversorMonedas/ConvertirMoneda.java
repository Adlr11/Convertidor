package ConversorMonedas;

import javax.swing.*;

public class ConvertirMoneda {

    public void PesoToDollar(double moneda) {

        String numeroFormateado = String.format("%.2f", (moneda * 0.057408906));
        JOptionPane.showMessageDialog(null, "tienes: " + numeroFormateado + " Dólares");
    }

}
