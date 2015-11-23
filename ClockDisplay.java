
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
    private NumberDisplay dia;
    private NumberDisplay mes;
    private NumberDisplay año;

    public ClockDisplay(boolean doceHoras){
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
        dia  = new NumberDisplay(31);
        dia.setValue(22);
        mes  = new NumberDisplay(13);
        mes.setValue(11);
        año  = new NumberDisplay(100);
        año.setValue(15);
        doceHoras();
        franja = doceHoras;

    }

    public ClockDisplay(int horaDada, int minutoDado, boolean doceHoras, int diaDado, int mesDado, int añoDado){
        hora = new NumberDisplay(24);
        hora.setValue(horaDada);
        minuto = new NumberDisplay(60);
        minuto.setValue(minutoDado);
        franja = doceHoras;

        dia  = new NumberDisplay(31);
        dia.setValue(diaDado);
        mes  = new NumberDisplay(13);
        mes.setValue(mesDado);
        año  = new NumberDisplay(100);
        año.setValue(añoDado);

        doceHoras();
    }
    public void setTime(int valorHora, int valorMinuto, int diaDado, int mesDado, int añoDado){
        hora.setValue(valorHora);
        minuto.setValue(valorMinuto);
        dia.setValue(diaDado);
        mes.setValue(mesDado);
        año.setValue(añoDado);
        doceHoras();

    }
    public String getTime(){
        return time;
    }

    public void timeTick(){

        minuto.increment();          
        if(minuto.getValue() == 0){
            hora.increment();
            if(hora.getValue() == 0){
                dia.increment();
                if(dia.getValue() == 0){
                    mes.increment();
                    dia.increment();
                    if( mes.getValue() == 0){
                        año.increment();
                        mes.increment();
                    }
                
                }
            }   
        }

        doceHoras();
    }

   

    /**
     * actualiza el reloj a modo de 12 horas
     * /
     */
    public void doceHoras(){
        String tiempo = hora.getDisplayValue();
        String mañana = " am";
        if (franja == true){
            if(hora.getValue() == 0) {
                tiempo = "12";
            }

            if((hora.getValue() > 12) && (hora.getValue() < 22)){
                tiempo = "0" + hora; 

            } 

            if((hora.getValue() > 0) && (hora.getValue() < 10)){
                tiempo = "0" + hora; 

            } 

            if(hora.getValue() >= 12) {
                if(hora.getValue() > 12) {
                    tiempo = (hora.getValue() - 12) + ""; 
                }
                mañana = "pm";
            }

            if((hora.getValue() == 12) && (minuto.getValue() == 0) ){
                mañana = "m";
            }
            
            
            time = tiempo + ":" + minuto.getDisplayValue() + mañana + "//"+  dia.getValue() + 
            " / "+ (mes.getValue()) + " / "+ año.getDisplayValue();  
        }
        else{
            time = hora.getDisplayValue() + " : " + minuto.getDisplayValue()+  " // " + (dia.getValue() ) + 
            " / "+ (mes.getValue()) + " / "+ año.getDisplayValue();
        }
    } 

    public void changeFormat(){
        if(franja){

            franja = false;
        }
        else{
            franja = true;
        }

    }

}
