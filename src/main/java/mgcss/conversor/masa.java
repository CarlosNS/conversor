/**
 * Métodos para convertir unidades de masa del sistema japonés y chino a kilogramos del sistema métrico
 * Esta clase implementa los métodos para convertir koku, kann, kinn, monnme, tael y ku ping a kilogramos
 * @author: Daniel Gil Romero Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class masa {
    /**
     * Método que convierte kokus en kilogramos
     * @param koku double indica los kokus que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double koku(double koku){
           return Math.rint((koku*180.41)*10)/10;
    }
    
    /**
     * Método que convierte kanns en kilogramos
     * @param kann double indica los kanns que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double kann(double kann){
           return Math.rint((kann*3.75)*10)/10;
    }
    
    /**
     * Método que convierte kinns en kilogramos
     * @param kinn double indica los kinns que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double kinn(double kinn){
           return Math.rint((kinn*0.6)*10)/10;
    }
    
    /**
     * Método que convierte monnmes en kilogramos
     * @param monnme double indica los monnmes que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double monnme(double monnme){
           return Math.rint((monnme*0.00375)*10)/10;
    }
    
    /**
     * Método que convierte taels en kilogramos
     * @param tael double indica los taels que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double tael(double tael){
           return Math.rint((tael*0.04)*10)/10;
    }
    
    /**
     * Método que convierte ku pings en kilogramos
     * @param ku_ping double indica los ku pings que deseamos convertir
     * @return double valor en kilogramos
     */
    public static double ku_ping(double ku_ping){
           return Math.rint((ku_ping*0.04)*10)/10;
    }
}
