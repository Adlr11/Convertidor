package ConversorMonedas;

public enum Monedas {
    MXN("MXN"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    JPY("JPY"),
    KRW("KRW");

    String valor;
    Monedas(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
