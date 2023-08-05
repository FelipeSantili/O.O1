public class ExercicioString {
    private static String str2;

    public static void main(String[] args){
        String str1;
        str1 = "Um texto qualquer....     ";
        System.out.println("[" + str1 + "]");
        str1 = str1.trim(); //Remove espaços do final
        System.out.println("[" + str1 + "]");
        System.out.println("Tamanho do str1: " + str1.length());

        //Substituir um substring dentro de um string
        str2 = str1.replace("Texto", "Teste");
        System.out.println("[" + str2 + "]");
        //Copiar um substring
        str2 = str1.substring(6, 10);
        System.out.println("[" + str2 + "]");

        //Procurar um substring 
        str1 = "felipesantili@gmail.com";
        int posicao = str1.indexOf("@");
        System.out.println("O @ está na posição " + posicao);
        System.out.println("Usuario: " + str1.substring(0, 13) );
        System.out.println("Servidor: " + str1.substring(14, 23));

        //Converter de outros tipos para String 
        int valor = 5;
        String str3 = String.valueOf(valor);
        System.out.println(str3);

        String conteudo = "5/6/7/8/22/98/1/0";
        String[] arrayConteudo = conteudo.split("/");
       //System.out.println(arrayConteudo);
        System.out.println(arrayConteudo[1]);

        
    }
}