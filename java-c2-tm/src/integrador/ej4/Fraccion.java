package integrador.ej4;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    public Fraccion sumar(Fraccion a, Fraccion b) {
        return a.sumar(b);
    }

    public Fraccion sumar(Fraccion f) {
        numerador = denominador * f.getDenominador();
        denominador = numerador * f.getDenominador() + f.getNumerador() * denominador;
        return this;
    }

    public Fraccion sumar(int x) {
        numerador += denominador * x;
        return this;
    }

    public Fraccion restar(Fraccion a, Fraccion b) {
        return a.restar(b);
    }

    public Fraccion restar(Fraccion f) {
        numerador = denominador * f.getDenominador();
        denominador = numerador * f.getDenominador() - f.getNumerador() * denominador;
        return this;
    }

    public Fraccion restar(int x) {
        numerador -= denominador * x;
        return this;
    }

    public Fraccion multiplicar(Fraccion f) {
        setNumerador(numerador * f.getNumerador());
        setDenominador(denominador * f.getDenominador());
        return this;
    }

    public Fraccion multiplicar(int x) {
        setNumerador(numerador * x);
        return this;
    }

    public Fraccion dividir(Fraccion f) {
        setNumerador(numerador * f.getDenominador());
        setDenominador(denominador * f.getNumerador());
        return this;
    }

    public Fraccion dividir(int x) {
        setDenominador(denominador * x);
        return this;
    }

    public void simplificar() {
        int i=2;
        while(i <= numerador && i <= denominador)
        {
            if(numerador%i == 0 && denominador%i == 0) {
                numerador = numerador/i;
                denominador = denominador/i;
            }
            else {
                i++;
            }
        }
    }



    public void imprimir()
    {
        System.out.println(numerador+"/"+denominador);
    }

    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int x)
    {
        numerador=x;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int d)
    {
        if(d==0)
        {
            throw new RuntimeException("El denominador no puede ser cero");
        }

        this.denominador=d;
    }

}
