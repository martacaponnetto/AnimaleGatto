public class Main {
    public static void main(String[] args) {
        Animale animaleGenerale = new Animale();
        Gatto gatto = new Gatto();
        System.out.println("verso generico dell'animale: ");
        animaleGenerale.failVerso();
        System.out.println("\nverso del gatto");
        gatto.failVerso();



    }
}