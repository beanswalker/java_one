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
public class PrimitiveData
{
    //Vamos a implementar los tipos de datos básicos de Java:...
    private int return_byte;
    private short return_short;
    private int return_int;
    private char return_char;
    private long return_long;
    private int response;
    
    //Recibimos un string que tendrá un opción especifica
    public void primitive_data(String option)
    {
        switch(option)
        {
            case "byte":
                return_byte = 2;
                response = 1;
            break;
            case "char":
                return_char = 'E';
                response = 2;
            break;
            case "short":
                return_short = 10;
                response = 3;
            break;
            case "int":
                return_int = 400;
                response = 4;
            break;
            
            case "long":
                return_long = 56556674;
               
            default:
                
                response = 0;
            break;
             
        }
        
    
    //Retornamos un valor tipo int, de acuerdo a la opción enviada con anterioridad
    }
    public int return_primitive_data()
    {
        if(response == 1)
            {
                return return_byte;
            }
        else if(response == 4)
            {
                return return_int;
            }
        else if(response == 3)
        {
            return return_short;
        }
       
        else
        {
            return 0;
        }
    }
    
    public long return_primitive_data_long()
    {
        return return_long;
    }
    
    public char return_primitive_data_char()
    {
        if(response == 2)
        {
            return  return_char;
        }
        else
        {
            return '0';
        }
        
    }
}

