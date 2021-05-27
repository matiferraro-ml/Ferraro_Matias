package integrador.ej5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    private GregorianCalendar calendar = new GregorianCalendar(anio, mes, dia);

    public Fecha() { }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(GregorianCalendar calendar) {
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH);
        this.anio = calendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);
    }

    public boolean validarFecha(String strDate) {
        if(strDate.trim().equals("")) {
            return true;
        }
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
            sdf.setLenient(false);
            try {
                Date javaDate = sdf.parse(strDate);
                System.out.println(strDate + " es una fecha válida");
            }
            catch (ParseException e) {
                System.out.println(strDate + " es una fecha inválida");
                return false;
            }
            return true;
        }
    }

    public Fecha sumarDia() {
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        if(!validarFecha(calendar.toString())) {
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            if(!validarFecha(calendar.toString())) {
                calendar.add(Calendar.YEAR, 1);
                calendar.set(Calendar.MONTH, 1);
            }
        }
        return (new Fecha(calendar));
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

}
