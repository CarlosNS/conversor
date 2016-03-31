/**
 * Métodos para convertir unidades de velocidad a kilómetros por hora
 * Esta clase implementa los métodos para convertir millas por segundo, millas por hora, pies por segundo, nudos naúticos,
 * velocidad de la luz, velocidad del sonido, caminata rápida y velocidad del caracol de jardín a kilómetros por hora
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class velocidad {
   static public double millasxsAkm(double x){
       return x*1.61;
   }
   static public double millasxhAkm(double x){
       return x*(4.47*(double) Math.pow(10, -4));
   }
   
   static public double piesxsAkm(double x){
       return x*(3.05*(double) Math.pow(10, -4));
   }
   static public double nudosAkm(double x){
       return x*(5.14*(double) Math.pow(10, -4));
   }
   static public float vluzAkm(float x){
       return (float)(x*299792.46);
   }
   static public double caminataAkm(double x){
       return x*(1.7*(double)Math.pow(10, -3));
   }
   static public double caracolAkm(double x){
       return x*(double)Math.pow(10, -6);
   }
}
