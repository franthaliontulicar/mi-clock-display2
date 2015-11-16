
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay minuto;
    private String time;
    
    
    public ClockDisplay(){
    
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);

           
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    
    }
    
    public ClockDisplay(int horaDada, int minutoDado){
     
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
        hora.setValue(horaDada);
        minuto.setValue(minutoDado);
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    
    }
    
    public void setTime(int valorHora, int valorMinuto){
        hora.setValue(valorHora);
        minuto.setValue(valorMinuto);
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
        
    }
    
    
    public String getTime(){
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
        return time;
    }
    
    public void timeTick(){
        minuto.increment();          
        if(minuto.getValue() == 0){
             hora.increment();
            }
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
        }
}
