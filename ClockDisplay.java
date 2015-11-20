
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
    private boolean franja; 

    public ClockDisplay(boolean doceHoras){
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
        franja = doceHoras;

        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
    public ClockDisplay(int horaDada, int minutoDado, boolean doceHoras){
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
        franja = doceHoras;
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
        return time;
    }

    public void timeTick(){
        minuto.increment();          
        if(minuto.getValue() == 0){
            hora.increment();
        }
        time = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }

    /**
     * actualiza el reloj a modo de 12 horas
     * /
     */
    public void doceHoras(){
        String tiempo = hora.getDisplayValue();
        String mañana = " am";

        if((hora.getValue() > 12) && (hora.getValue() <= 22)){
            tiempo = "0" + hora; 

        } 

        if(hora.getValue() >= 12) {
            if(hora.getValue() > 12) {
                tiempo = (hora.getValue() - 12) + ""; 
            }
            mañana = "pm";
        }

        if( hora.getValue() == 0){
            tiempo = "12";
        }

        if((hora.getValue() == 12) && (minuto.getValue() == 0) ){
            mañana = "m";
        }
        time = tiempo + ":" + minuto.getDisplayValue() + mañana;  

    } 

}
