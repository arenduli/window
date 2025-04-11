// klasa koja modelira prozor u Windowsima
public class Window {

    private String naslov;
    private String oznaka;
    private int koordinataX1, koordinataY1, koordinataX2, koordinataY2;
    private String boja;
    private boolean isActive;

    // konstruktor prima samo naslov
    public Window(String naslov) {
        this.naslov = naslov;
        this.oznaka = "test";
        this.koordinataX1 = 0;
        this.koordinataY1 = 0;
        this.koordinataX2 = 80; // Default width
        this.koordinataY2 = 25; // Default height
        this.boja = "crvena";
        this.isActive = false;
    }

    public String getWindowInfo() {
        String status = isActive ? "Aktivan" : "Neaktivan";
        String koordinate = String.format("(%d, %d), (%d, %d)", koordinataX1, koordinataY1, koordinataX2, koordinataY2);
        return String.format("Naslov: %s, Oznaka: %s, Status: %s, Koordinate: %s", naslov, oznaka, status, koordinate);
    }

    // metoda koja racuna sirinu prozora
    public int width() {
        return Math.max(0, koordinataX2 - koordinataX1);
    }

    // metoda koja racuna visinu prozora
    public int height() {
        return Math.max(0, koordinataY2 - koordinataY1);
    }

    // metoda koja racuna povrsinu prozora
    public int area() {
        return width() * height();
    }

    // metoda koja racuna opseg prozora
    public int perimeter() {
        return 2 * (width() + height());
    }

    // metoda koja crta prozor u konzoli
    public void draw() {
        int width = width();
        int height = height();

        // crta gornju ivicu
        System.out.println("*".repeat(width));

        // crta bočne ivice
        for (int i = 0; i < height - 2; i++) {
            System.out.println("*" + " ".repeat(width - 2) + "*");
        }
        // crta donju ivicu
        System.out.println("*".repeat(width));
    }

    // Main metoda za modeliranje prozora
    public static void main(String[] args) {

        Window window1 = new Window("window1");
        System.out.println(window1.getWindowInfo());
        window1.draw();
    }
}
