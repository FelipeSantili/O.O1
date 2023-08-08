import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetores2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = -1;
        while(true){
            System.out.println("Informe o número do mês ou 0 para sair: ");
            num = Integer.parseInt(reader.readLine());

            if (num == 0){
                break;
            }else {
                Meses meses = new Meses();
                String mes = meses.pegarNomeMes(num);
                if(mes.equals("")){
                    System.out.println("Valor invalido");
            }else {
                System.out.println("O mês é: " + mes);
            }
        }
     }   
    }
}
