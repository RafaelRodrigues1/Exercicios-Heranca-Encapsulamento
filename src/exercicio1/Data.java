package exercicio1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *a) Criar uma classe data com os atributos dia, mes e ano,
 * realizando os testes para saber se é uma data válida.
 * @author RafaelRodrigues1
 */

public class Data {
    int dia, mes, ano;
    
    public Data(){
        
    }
    
    public Data(String dataString){
        int data[] = convertToArray(dataString);
        if(validaData(data)){
            this.dia = data[0];
            this.mes = data[1];
            this.ano = data[2];
        }        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setData(String dataString){
        int data[] = convertToArray(dataString);
        this.dia = data[0];
        this.mes = data[1];
        this.ano = data[2];
    }
    
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    private int[] convertToArray(String dataString) {
        String[] dataStringVect = dataString.split("/");
        int[] data = new int[3];
        for(int i=0; i<data.length; i++){
            data[i] = Integer.parseInt(dataStringVect[i]);
        }
        return data;
    }
    
    private boolean validaData(int data[]){
        Date ano = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        if(data[2]>0 && data[2]<=Integer.parseInt(df.format(ano))){
            switch(data[1]){
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if(data[0]>0 && data[0]<=31){
                        return true;                       
                    }else break;                    
                }
                case 4, 6, 9, 11 -> {
                    if(data[0]>0 && data[0]<=30){
                        return true;
                    }else break;
                }
                case 2 -> {
                    if(data[2]%4==0){
                        if(data[0]>0 && data[0]<=29){
                            return true;    
                        }else break;
                    }else{
                        if(data[0]>0 && data[0]<=28){
                            return true;
                        }else break;
                    }
                }default -> {break;}
            }
        }
        return false;
    }
}
