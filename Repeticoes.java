public class Repeticoes {
    public static void main(String[] args) {
        int qtde = 5; 

        //For
        System.out.println("Repetição do tipo for:");
        for (int i = 0; i < qtde; i++) {
            System.out.println();
        }
        //While
        System.out.println("Repetições do tipo 'while'");
        int cont = 0;
        while (cont < qtde) {
            System.out.println(cont);
            cont++;
        }
        //Do while
        System.out.println("Repetições do tipo 'do while'");
        cont = 0;
        do {
            System.out.println(cont);
            cont++;
        } while (cont < qtde);
    }
}
