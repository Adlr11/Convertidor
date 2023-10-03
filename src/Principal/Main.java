package Principal;

import ConversorMonedas.Conversor;
import ConversorTemperatura.ConversorTemperatura;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {

        Conversor moneda = new Conversor();
        ConversorTemperatura temperatura = new ConversorTemperatura();
        boolean continuar = true;

        while (continuar) {


            String[] options = {"Convertidor de moneda", "Convertidor de temperartura"};

            String selectOption = (String) JOptionPane.showInputDialog(null, "Elige el convertidor", "Convertidor de moneda",
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (selectOption) {
                case "Convertidor de moneda":
                    String input = JOptionPane.showInputDialog("ingrese el monto a convertir");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        moneda.ConvertirMoneda(Minput);

                    }
                break;

                case "Convertidor de temperartura":
                    String temp = JOptionPane.showInputDialog("Ingrese los grados a convertir");
                    if (ValidarNumero(temp)) {
                        double Timput = Double.parseDouble(temp);
                        temperatura.ConvertirTemperatura(Timput);
                    }
                break;

            }
            int result = JOptionPane.showConfirmDialog(null, "Desea continuar usando el convertidor");
            if (result >= 1) {
                continuar = false;
                JOptionPane.showMessageDialog(null,"Hasta luego!! :)");
            }

        }
    }

    private static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x <= 0 || x >= 0)
                return true;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"El monto ingresado es invalido");
            return false;
        }
        return false;
    }

}