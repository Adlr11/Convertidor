package ConversorTemperatura;

import javax.swing.*;

public class ConversorTemperatura {

    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    public void ConvertirTemperatura(double Tinput) {
        String opcion = JOptionPane.showInputDialog(null, "Elige la temperatura a convetir", "Temperatura",
                JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Centígrados a Farenheit", "De Farenheit a Centígrados"},
                "Seleccion").toString();

        switch (opcion) {
            case "De Centígrados a Farenheit": temperatura.CelciusToFarenheit(Tinput);
            break;
            case "De Farenheit a Centígrados": temperatura.FarenheitToCelcius(Tinput);
        }
    }
}
