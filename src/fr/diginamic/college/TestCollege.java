package fr.diginamic.college;




public class TestCollege {

    public static void main(String[] args) {

        College college = new College("College Diginamic");

        ///  Classe 6A
        Classe classe6A = new Classe("6A");

        Eleve e1 = new Eleve("Dupont", "Jean");
        e1.ajouterNote(new Note(12, "Math"));
        e1.ajouterNote(new Note(14, "Math"));
        e1.ajouterNote(new Note(10, "Français"));
        e1.ajouterNote(new Note(13, "Français"));
        e1.ajouterNote(new Note(15, "Math"));

        classe6A.ajouterEleve(e1);

        college.ajouterClasse(classe6A);

        /// Tests
        System.out.println("Classe 6A moyenne : " + classe6A.calculerMoyenne());
        System.out.println("Moyenne Maths : " + classe6A.calculerMoyenne("Math"));
    }
}
