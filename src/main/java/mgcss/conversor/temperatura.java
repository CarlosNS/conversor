/**
 * Métodos para convertir unidades de temperatura a grados Kelvin
 * @author: Carlos Naranjo Sanchez Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

/**
 * Esta clase implementa los métodos para convertir celsius, farenheit, Rømer
 * newton y réaumur a kelvin 
 * @author Carlos Naranjo Sánchez
 */
public class temperatura {
    
    /**
     * Método para convertir grados Celsius a Kelvin
     * @param cel Los grados Celsius
     * @return Los grados Kelvin
     */
    public static double celsius_to_kelvin(double cel){
        return cel+273.15;
    }
    
    /**
     * Método para convertir grados Farenheit a Kelvin
     * @param far Los grados Farenheit
     * @return Los grados Kelvin
     */
    public static double farenheit_to_kelvin(double far){
        return (far+459.67)/1.8;
    }
    
    /**
     * Método para convertir grados Rømer a Kelvin
     * @param rom Los grados Rømer
     * @return Los grados Kelvin
     */
    public static double romer_to_kelvin(double rom){
        return (rom-7.5)*40/21+273.15;
    }
    
    /**
     * Método para convertir grados Réaumur a Kelvin
     * @param rea Los grados Réaumur
     * @return Los grados Kelvin
     */
    public static double reaumur_to_kelvin(double rea){
        return rea*1.25+273.15;
    }
    
    /**
     * Método para convertir grados Newton a Kelvin
     * @param newt Los grados Newton
     * @return Los grados Kelvin
     */
    public static double newton_to_kelvin(double newt){
        return (newt/0.33f)+273.15f;
    }
}
