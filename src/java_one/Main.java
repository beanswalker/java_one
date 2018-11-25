/*
           * * * * * * * * * * * * * * * * * * * * * * * * * *
         * * Copyleft(C)  2018 GNU General Public License V3 * * 
       * * *         Made with love in Colombia!!!           * * *
         * *         @Author:... ==>BEANSWALKER<==           * *
           * * * * * * * * * * * * * * * * * * * * * * * * * *
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * This program is free software: you can redistribute it and/or modify
     * it under the terms of the GNU General Public License as published by
     * the Free Software Foundation, either version 3 of the License, or
     * (at your option) any later version.
     * You should have received a copy of the GNU General Public License
     * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package java_one;

/**
 *
 * @author beanswalker
 */
public class Main
{
 public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println(" Hello, I am demonscript!!!:... ");
        
        //Creamos una instancia de la Clase PrimitiveData
        PrimitiveData datos_primitivos = new PrimitiveData();
        
        //llamamos al método de los enteros similares:..
        datos_primitivos.primitive_data("no");
        System.out.println("El valor del dato tipo byte por defecto es "+datos_primitivos.return_primitive_data());
        datos_primitivos.primitive_data("byte");
        System.out.println("Ahora El dato byte es "+datos_primitivos.return_primitive_data());
        System.out.println("");
        

        datos_primitivos.primitive_data("no");
        System.out.println("El valor del dato tipo short por defecto es "+datos_primitivos.return_primitive_data());
        datos_primitivos.primitive_data("short");
        System.out.println("Ahora el dato tipo short es "+datos_primitivos.return_primitive_data());
        System.out.println("");
        
                   
        datos_primitivos.primitive_data("no");
        System.out.println("El valor del dato tipo int por defecto es "+datos_primitivos.return_primitive_data());
        datos_primitivos.primitive_data("int");
        System.out.println("Ahora el dato tipo int es "+datos_primitivos.return_primitive_data());
        System.out.println("");
        
        /*llamamos al método de los datos tipo char porque siutilizamos al método
         *de enteros similares nos devuelve un número que representa a la letra E
        */
        System.out.println("El valor del dato tipo char por defecto es "+datos_primitivos.return_primitive_data_char());
        datos_primitivos.primitive_data("char");
        System.out.println("Ahora el dato tipo char es "+datos_primitivos.return_primitive_data_char());
        System.out.println("");
        
        /*llamamos al método de los datos tipo long porque int no soporta a long,
         *que es mucho mas grande porque int es 32 bit mientras que long es 64 bit
        */
        datos_primitivos.primitive_data("no");
        System.out.println("El valor del dato tipo long por defecto es "+datos_primitivos.return_primitive_data());
        datos_primitivos.primitive_data("long");
        System.out.println("Ahora el dato tipo int es "+datos_primitivos.return_primitive_data_long());
        System.out.println("");
    }   
} //Fin del cuerpo de la clase Main
