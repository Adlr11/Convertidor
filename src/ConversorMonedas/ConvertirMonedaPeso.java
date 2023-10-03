package ConversorMonedas;

import org.json.JSONException;

import javax.swing.*;

public class ConvertirMonedaPeso {

    TasaDeCambio tasaDeCambio = new TasaDeCambio();

    public void DollarToPeso(double moneda) {

        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.USD, Monedas.MXN);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Dólares = " + numeroFormateado + " Pesos");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void EuroToPeso(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.EUR, Monedas.MXN);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Euros = " + numeroFormateado + " Pesos");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }

    }

    public void YenToPeso(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.JPY, Monedas.MXN);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Yenes = " + numeroFormateado + " Pesos");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void LibraToPeso(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.GBP, Monedas.MXN);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Libras = " + numeroFormateado + " Pesos");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }

    public void WonToPeso(double moneda) {
        if (tasaDeCambio != null) {
            try {

                double resultado = tasaDeCambio.TasaCambio(moneda, Monedas.KRW, Monedas.MXN);

                String numeroFormateado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, moneda + " Wones = " + numeroFormateado + " Pesos");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la información de tipos de cambio.");
        }
    }
}
