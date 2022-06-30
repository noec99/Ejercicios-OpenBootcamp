public class Main {
    static class Coche{
        int puertas = 4;

        int agrega_puerta(int puerta){
            return puertas + puerta;

        }

    }
    public static void main(String[] args) {
            Coche tipo_auto;
            tipo_auto = new Coche();

            int new_puertas = tipo_auto.agrega_puerta(2);

            System.out.println(tipo_auto.puertas);
            System.out.println(new_puertas);

    }
}