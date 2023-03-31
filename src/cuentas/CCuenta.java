package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Contiene atributos para el nombre del titular, número de cuenta, saldo y tipo de interés.
 * También contiene métodos para consultar y modificar los atributos, y para ingresar y retirar dinero.
 */
public class CCuenta {

    private String nombre; //nombre del titular de la cuenta
    private String cuenta; //número de cuenta bancaria
    private double saldo; //saldo actual de la cuenta
    private double tipoInteres; //tipo de interés de la cuenta

    /**
     * Constructor por defecto. Inicializa los atributos a valores por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor que recibe todos los atributos de la cuenta.
     * @param nom el nombre del titular de la cuenta.
     * @param cue el número de cuenta bancaria.
     * @param sal el saldo actual de la cuenta.
     * @param tipo el tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta.
     * @return el saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que modifica el saldo actual de la cuenta.
     * @param saldo el nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el nombre del titular de la cuenta.
     * @return el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre del titular de la cuenta.
     * @param nombre el nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el número de cuenta bancaria.
     * @return el número de cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que modifica el número de cuenta bancaria.
     * @param cuenta el nuevo número de cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el tipo de interés de la cuenta.
     * @return el tipo de interés de la cuenta.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método que modifica el tipo de interés de la cuenta.
     * @param tipoInteres el nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta.
     * @return el saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}