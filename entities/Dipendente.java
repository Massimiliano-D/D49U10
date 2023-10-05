package entities;

public class Dipendente {
    static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraodinario;
    private Livello livello;
    private Dipartimento dipartimento;

    Dipendente(String _matricola, Dipartimento _dipartimento) {
        this.stipendio = stipendioBase;
        this.importoOrarioStraodinario= 30;
        this.livello = Livello.OPERAIO;
        this.matricola = _matricola;
        this.dipartimento = _dipartimento;
    }

    Dipendente (String matricola, int stipendio, double importoOrarioStraodinario, Livello livello,Dipartimento dipartimento ){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraodinario= importoOrarioStraodinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }
    public static double  calcola(Dipendente x){
        x.stipendio = stipendioBase;
        return x.stipendio;
    }
    public static double  calcola(int ore, Dipendente x){
        x.stipendio = stipendioBase + (ore* x.importoOrarioStraodinario);
        return x.stipendio;
    }


    public String stampaDatiDipendente() {
        return "Dipendente [matricola=" + matricola+ ", stipendio=" +stipendio+
               ", importoOrarioStraodinario " +importoOrarioStraodinario+ ", " +
               "livello" +livello+ ", dipartimento" +dipartimento+"]";
    }
    public double getImportoOrarioStraodinario(){
        return importoOrarioStraodinario;
    }
    public void setImportoOrarioStraodinario(double ImportoOrarioStraodinario){
        this.importoOrarioStraodinario= importoOrarioStraodinario;
    }
    public Dipartimento getDipartimento(){
        return dipartimento ;
    }
    public void setDipartimento (Dipartimento dipartimento){
        this.dipartimento= dipartimento;
        }

    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public Livello getLivello() {
        return livello;
    }
    Livello promuovi (){
        switch (livello){
            case OPERAIO :
                livello= Livello.IMPIEGATO;
                stipendioBase =stipendioBase*1.2;
                break;
            case IMPIEGATO:
                livello= Livello.QUADRO;
                stipendioBase =stipendioBase*1.5;
                break;
            case QUADRO:
                livello= Livello.DIRIGENTE;
                stipendioBase =stipendioBase*2;
                break;
            case DIRIGENTE:
                System.out.println("Sei arrivato in cima COMPLIMENTI!!");
        }
        return livello;
    }

};

