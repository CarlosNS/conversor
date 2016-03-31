/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir barril, picotazo, galón, cuarto de galón y onza líquita a litros
 * @author: Alvaro Perez Garcia Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class volumen {
    // TODO resto de métodos
    
    public static double redondear(double numero)
    {
          return Math.round(numero * 100.0) / 100.0;
    }
    
    /**
     * Método que convierte barriles británicos a litros del sistema métrico
     * @param barril double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double barril(double barril){
            // TODO código del conversor
           return redondear(barril*163.65);
    }
    
    /**
     * Método que convierte picotazos británicos a litros del sistema métrico
     * @param picotazo double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double picotazo(double picotazo){
            // TODO código del conversor
           return redondear(picotazo*8.80);
    }
    
    /**
     * Método que convierte galones británicos a litros del sistema métrico
     * @param galon double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double galon(double galon){
            // TODO código del conversor
           return redondear(galon*4.54);
    }
    
    /**
     * Método que convierte cuartos de galon británicos a litros del sistema métrico
     * @param cuarto_galon double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double cuarto_galon(double cuarto_galon){
            // TODO código del conversor
           return redondear(cuarto_galon*1.13);
    }
    
    /**
     * Método que convierte onzas liquidas británicss a litros del sistema métrico
     * @param onza_liquida double indica los barriles que deseamos convertir
     * @return double valor en litros
     */
    public static double onza_liquida(double onza_liquida){
            // TODO código del conversor
           return redondear(onza_liquida*0.028);
    }
}
