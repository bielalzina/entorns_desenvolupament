/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


/**
 * Amb la classe CCuenta es permet construir un compte corrent amb els atributs:
 * + Nom del titular del compte
 * + Numero de compte
 * + Saldo del compte
 * + Tipus interes
 * El saldo del compte es calcula a partir del saldo inicial augmentat o
 * minorat amb els import ingressats o retirats del compte
 * 
 * @author Gabriel Alzina Alomar
 * @version 1.0
 */


public class CCuenta {

    /**
     * String - Nom del titular del compte
     */
    private String nombre;
    /**
     * String - Numero del compte corrent
     */
    private String cuenta;
    /**
     * Double - Saldo del compte corrent
     */
    private double saldo;
    /**
     * Double - Tipus d'interes
     */
    private double tipoInterés;

    
    /**
     * Constructor per defecte
     */
    
    public CCuenta()
    {
    }

    
    /**
     * Constructor amb parametres
     * 
     * @param nom Nom del titular del compte 
     * @param cue Numero de compte
     * @param sal Saldo inicial
     * @param tipo Tipus interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    /**
     * Metode SET per assignar nom del titular al compte
     * @param nom Nom del titular
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    
    /**
     * Metode GET que retorna el nom del titular del compte
     * @return Nom del titular 
     */
    
    public String obtenerNombre()
    {
        return getNombre();
    }


    /**
     * Metode GET que retorna el saldo del compte
     * @return Saldo del compte
     */
    public double estado()
    {
        return getSaldo();
    }


    
    /**
     * Metode que ens permet ingressar dinners en el compte. Si l'ingres es 
     * correcte es suma al saldo existent
     * @param cantidad Import a ingressar
     * @throws Exception  Llença un excepció si pretenem ingressar un import negatiu
     */
    
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /**
     * Metode que permet retirar dinners del compte. Si l'import a retirar compleix
     * els requisits es minora el saldo existent
     * @param cantidad Import a retirar
     * @throws Exception  Llença una excepció si pretenem retirar un import negatiu
     * o retirar un import superior al saldo actual
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    /**
     * Metode GET que retorna el numero del compte
     * @return Numero del compte
     */

    public String obtenerCuenta()
    {
        return getCuenta();
    }

    
    /**
     * Metode GET que retorna el nom del titular del compte
     * @return Nom del tiular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metode SET per assignar nom del titular al compte
     * @param nombre Nom del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metode GET que retorna el tipus d'interes aplicable al compte
     * @return Tipus interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metode SET per indicar el tipus d'interes aplicable al compte corrent
     * @param tipoInterés Tipus interes aplicable al compte
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Metode GET que retorna el numero del compte corrent
     * @return Numero del compte corrent
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metode SET per indicar el numero del compte corrent
     * @param cuenta Numero de compte corrent
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metode GET que retorna el saldo del compte corrent
     * @return Saldo del compte
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metode SET per indicar el saldo del compte corrent
     * @param saldo - Saldo del compte
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
