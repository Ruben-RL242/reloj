/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author crist
 */
public class reloj {
    int segundos;
    int minutos;
    int horas;

    public reloj() {
    }

    public reloj(int horas, int minutos, int segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public void mostrarHora(){
        int i=1;
        while (i==1){
            aumentarSegundo();
            
    }
        
    }
    
    public void aumentarSegundo(){
        while (segundos<60){
            System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
            segundos++;
        }
        segundos=0;
        minutos++;
        aumentarMinuto();
    }
    
    public void aumentarMinuto(){
        while (minutos<60){
            aumentarSegundo();
        }
        minutos=0;
        horas++;
        aumentarHora();
    }
    
    public void aumentarHora(){
        if (horas==25){
            reset();
        }
        aumentarSegundo();
    }
    
    public void reset(){
        horas=0;
        minutos=0;
        segundos=0;
        
    }
        
    
    
}
