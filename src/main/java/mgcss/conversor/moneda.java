/**
 * Metodos para convertir distintas monedas a euro.
 * @author: Equipo <indicar 5> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 * @author: Juan José Medina Martín
 * @author: Rocío Ponce Chaves
 */
package mgcss.conversor;

public class moneda {
   
	/**
         * Metodo para convertir de libra britanica a euro
         * @param l float para convertir
         * @return El resultado de la conversion
         */
	public float deLibra(float l){
		return l*1.25f;
	}
        /**
         * Metodo para convertir de corona sueca a euro
         * @param c float para convertir
         * @return El resultado de la conversion
         */
	public float deCoronaSueca(float c){
		return c*0.11f;
	}
        /**
         * Metodo para convertir de franco suizo a euro
         * @param f float para convertir
         * @return El resultado de la conversion
         */
	public float deFrancoSuizo(float f){
		return f*0.91f;
	}
        /**
         * Metodo para convertir de franco suizo a euro
         * @param f float para convertir
         * @return El resultado de la conversion
         */
	public float deCoronaNoruega(float c){
		return c*0.1f;
	}
        /**
         * Metodo para convertir de dolar americano a euro
         * @param d float para convertir
         * @return El resultado de la conversion
         */
	public float deDolarUSA(float d){
		return d*0.88f;
	}
	
}
