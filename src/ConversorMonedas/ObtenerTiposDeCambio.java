package ConversorMonedas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ObtenerTiposDeCambio {
    private static final String API_KEY_CURRENCY = "6f9bbc6034af04db41a2d18cbdafdf7119ab50e2";
/*

    public ObtenerTiposDeCambio(Monedas baseCurrency) {
        String apiUrl = "https://api.getgeoapi.com/v2/currency/convert?api_key=" + API_KEY_CURRENCY + "&from=" + baseCurrency;
    }
*/

    public static String obtenerTiposDeCambio(Monedas baseCurrency) {
        try {
            // URL de la API de Fixer.io con tu clave de acceso
            String apiUrl = "https://api.getgeoapi.com/v2/currency/convert?api_key=" + API_KEY_CURRENCY + "&from=" + baseCurrency;

            // Realizar una solicitud GET a la API
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta de la API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Cerrar la conexión
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
