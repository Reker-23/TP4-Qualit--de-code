public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        total = reductionCategorieItem(typeProduit,total);

        total = reductionSurTotal(total);

        return total;
    }
    //retourne le prix après la réduction selon le type de produit
    public double reductionCategorieItem(String typeProduit, double total){
        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }
        return total;
    }

    //applique une réduction si le total est supérieur à 1000
    public double reductionSurTotal(double total){
        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }

}
