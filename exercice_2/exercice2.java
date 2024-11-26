/**
 * Cette classe gère des notes d'élèves
 */

public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {

        afficherNotes(nomEtudiant, notes);
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    //calul la moyenne d'un élève
    public double calculerMoyenne(int[] note) {
        // Calcul de la somme des notes
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        // Affichage de la moyenne
        double moyenne = (double) somme / notes.length;
    }

    //affiche les notes d'un étudiant
    public void afficherNotes(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }
}
