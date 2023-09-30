package ConversorMonedas;

import javax.swing.*;

public class Conversor {

    ConvertirMoneda moneda = new ConvertirMoneda();
    ConvertirMonedaPeso peso = new ConvertirMonedaPeso();
    String [] opciones = {"De Peso a Dólar", "De Peso a Euro", "De Peso a Yen", "De Peso a Libra", "De Peso a Won Coreano",
            "De Dólar a peso", "De Euro a Peso", "De Yen a Peso", "De Libra a Peso", "De Won Coreano a Peso"};

    public void ConvertirMoneda(double Minput) {
        String opcion = JOptionPane.showInputDialog(null, "Elige el tipo de cambio", "Tipos de cambio",
                JOptionPane.PLAIN_MESSAGE, null, opciones,
                opciones[5]).toString();

        switch (opcion) {
            case "De Peso a Dólar": moneda.PesoToDollar(Minput);
            break;
            case "De Dólar a peso": peso.DollarToPeso(Minput);
            break;
        }

    }

}
