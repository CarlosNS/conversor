/**
 * Métodos para convertir unidades de velocidad a kilómetros por hora
 * Esta clase implementa los métodos para convertir millas por segundo, millas por hora, pies por segundo, nudos naúticos,
 * velocidad de la luz, velocidad del sonido, caminata rápida y velocidad del caracol de jardín a kilómetros por hora
 *
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase
 * MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class velocidad {

    static public double millasxsAkm(double x) {
        return Redondear (x * 1.61);
    }

    static public double millasxhAkm(double x) {
        return Redondear (x * (4.47 * (double) Math.pow(10, -4)));
    }

    static public double piesxsAkm(double x) {
        return Redondear (x * (3.05 * (double) Math.pow(10, -4)));
    }

    static public double nudosAkm(double x) {
        return Redondear (x * (5.14 * (double) Math.pow(10, -4)));
    }

    static public float vluzAkm(float x) {
        return Redondear ((float) (x * 299792.46));
    }
    
    static public double vsonidoAkm(double x) {
        return Redondear ( (x * 0.34));
    }

    static public double caminataAkm(double x) {
        return Redondear (x * (1.7 * (double) Math.pow(10, -3)));
    }

    static public double caracolAkm(double x) {
        return Redondear (x * (double) Math.pow(10, -6));
    }

    static public double Redondear(double numero) {
        return Math.rint(numero * 100) / 100;
    }
    static public float Redondear(float numero) {
        return (float)(Math.rint(numero * 100) / 100);
    }
}
