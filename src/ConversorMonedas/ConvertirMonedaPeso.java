package ConversorMonedas;

import javax.swing.*;

public class ConvertirMonedaPeso {

    public void DollarToPeso(double moneda) {

        String numeroFormateado = String.format("%.2f", (moneda * 17.55));
        JOptionPane.showMessageDialog(null, "tienes: " + numeroFormateado + " Dólares");
    }
}
