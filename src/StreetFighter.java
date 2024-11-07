import Interface.MainMenu;

public class StreetFighter {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
        });
    }
}
