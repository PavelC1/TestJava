package edu.step;

public class math {

    public class calculator{
    public double adunare(double Term1, double Term2){
        return Term1+Term2;
    }
    public int adunare(int Term1, int Term2){
        return Term1+Term2;
    }

    public double scadere(double Term1, double Term2){
        return Term1-Term2;
    }
    public int scadere(int Term1, int Term2){
        return Term1-Term2;
    }

    public double inmultire(double Term1, double Term2){
        return Term1*Term2;
    }
    public int inmultire(int Term1, int Term2){
        return Term1*Term2;
    }

    public double impartire(double Term1, double Term2){
        return Term1/Term2;
    }
    public int impartire(int Term1, int Term2){
        return Term1/Term2;
    }

    public void TablaInmultirii(int var){
        for (int i=0; i<10;i++){
            System.out.println(var*i);
        }

    }

    public double calcul(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++)
            suma += i;
        return suma;
    }
}

}
