
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int numero;
    private int max;
    
    
    public NumberDisplay(int limite){
        
        numero = limite;
               
        if(limite > 99){
            numero = 0;
        
        }
       
        
           
    }
    
    
    public void setValue(int valor){
       
        numero =  valor;
        if(valor >= max){
        numero = valor - max;
        
        }
        
         else if(valor < 0){
             numero = 0;
        
        }
        
    }
    
    public String getDisplayValue(){
        String cadenaValor = Integer.toString(numero);
        
        String cadenaDisplay = cadenaValor;
        if(numero < 10){
        
            cadenaDisplay = "0"+ numero;
        
        }
        
        return cadenaDisplay;
    
    }
    
    public int getValue(){
    
        int valorNumero = numero;
        return valorNumero;
    }
    
    public void increment(){
        numero++;
    
        if(numero > 99){
            numero = 0;
    
        }
    
   
    
    
    
    }
    
}
