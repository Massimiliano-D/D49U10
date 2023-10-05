package entities;

public class Main {
    public static void main(String[] args){
       Dipendente Paolo = new Dipendente("uomoChiamatoContratto",Dipartimento.VENDITE);
       Dipendente Luca = new Dipendente("bubino",Dipartimento.AMMINISTRAZIONE);
       System.out.println(Luca.stampaDatiDipendente());
       System.out.println(Luca.promuovi());
       System.out.println(Dipendente.calcola(Luca));
       System.out.println(Dipendente.calcola(4,Luca));
       System.out.println(Luca.promuovi());
       System.out.println(Dipendente.calcola(4,Luca));
       System.out.println(Luca.promuovi());
       System.out.println(Dipendente.calcola(4,Luca));
       System.out.println(Luca.promuovi());

       System.out.println(Paolo.stampaDatiDipendente());
       System.out.println(Paolo.promuovi());
       System.out.println(Dipendente.calcola(Paolo));
       System.out.println(Dipendente.calcola(4,Paolo));
       System.out.println(Paolo.promuovi());
       System.out.println(Dipendente.calcola(4,Paolo));
       System.out.println(Paolo.promuovi());
       System.out.println(Dipendente.calcola(4,Paolo));
       System.out.println(Paolo.promuovi());
    }

}
