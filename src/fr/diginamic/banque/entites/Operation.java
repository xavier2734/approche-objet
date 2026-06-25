package fr.diginamic.banque.entites;
public abstract class Operation {


    protected String date;  // protected = classe parent + classes enfants (classes filles)


    protected double montant; // protected = classe parent + classes enfants (classes filles)


    public Operation(String date, double montant) { // constructeur
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType(); // classe abstract , "vide" qui ne peut pas être instanciée,
                                      // les classes filles peuvent

    public String getDate() {  // affiche la date
        return date;
    }

    public double getMontant() {  // affiche le montant
        return montant;
    }
}


