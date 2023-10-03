package ConversorMonedas;

import org.json.JSONException;
import javax.swing.*;


public class ConvertirMoneda {

    TasaDeCambio tasaDeCambio = new TasaDeCambio();

    public void PesoToDollar(double moneda) {

        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda,Monedas.MXN, Monedas.USD);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Pesos = " + numeroFormateado + " Dólares");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void PesoToEuro(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.MXN, Monedas.EUR);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Pesos = " + numeroFormateado + " Euros");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void PesoToYen(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.MXN, Monedas.JPY);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Pesos = " + numeroFormateado + " Yenes");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void PesoToLibra(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.MXN, Monedas.GBP);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Pesos = " + numeroFormateado + " Libras");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void PesoToWon(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.MXN, Monedas.KRW);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Pesos = " + numeroFormateado + " Wones");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }
}
