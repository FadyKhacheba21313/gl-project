package restaurantmanagementsystem.view.console;

import restaurantmanagementsystem.model.order.Order;
import java.util.List;

public class RestaurantConsoleView {

    // ===== MENU PRINCIPAL =====
    public void afficherMenuPrincipal() {
        System.out.println("=== RESTAURANT MANAGEMENT SYSTEM ===");
        System.out.println("1. Voir le menu");
        System.out.println("2. Passer une commande");
        System.out.println("3. Voir les commandes en cours");
        System.out.println("4. Payer une commande");
        System.out.println("5. Quitter");
        System.out.print("Choix : ");
    }

    // ===== COMMANDES EN COURS =====
    public void afficherCommandes(List<Order> commandes) {
        System.out.println("=== COMMANDES EN COURS ===");
        for (Order cmd : commandes) {
            System.out.println(cmd); // utilisation de toString()
        }
    }

    // ===== MESSAGES =====
    public void afficherMessage(String message) {
        System.out.println("[INFO] " + message);
    }

    public void afficherErreur(String erreur) {
        System.err.println("[ERREUR] " + erreur);
    }
}
