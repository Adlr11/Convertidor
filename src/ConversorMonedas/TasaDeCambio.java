package ConversorMonedas;

import org.json.JSONObject;

import static ConversorMonedas.ObtenerTiposDeCambio.obtenerTiposDeCambio;

public class TasaDeCambio {

    public double TasaCambio(double moneda,Monedas baseCurrency, Monedas cambio) {
    String jsonResponse = obtenerTiposDeCambio(baseCurrency);
    JSONObject json = new JSONObject(jsonResponse);
    JSONObject rates = json.getJSONObject("rates");

        // Analiza la respuesta JSON

        JSONObject currency = rates.getJSONObject(cambio.getValor());

        // Obtiene la tasa de cambio

        double tasaCambio = currency.getDouble("rate");

        // Realiza la conversión
        double resultado= moneda * tasaCambio;

        return resultado;
    }

}
