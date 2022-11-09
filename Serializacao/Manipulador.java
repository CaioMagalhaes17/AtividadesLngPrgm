import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Manipulador {

    public static ArrayList<String> nome = new ArrayList();
    public static ArrayList<String> sobrenome = new ArrayList();

    public static void escreverNomeSobrenome (String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        for (int i=0; i < nome.size(); i++){
            buffWrite.append(nome.get(i) + " " + sobrenome.get(i) + "\n");
        }
        buffWrite.close();
    }
    public static void adicionarNome(String nomes){
        nome.add(nomes);
    }

    public static void adicionarSobrenome(String sobrenomes){
        sobrenome.add(sobrenomes);
    }
    public static void escreverNome(String path) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner ler = new Scanner(System.in);
        for (int i=0; i < 10; i++) {
            System.out.println("Escreva o nome nº " + i + " : ");
            linha = ler.nextLine();
            adicionarNome(linha);
            buffWrite.append(linha + "\n");
        }
        buffWrite.close();
    }

    public static void escreverSobrenome(String path) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner ler = new Scanner(System.in);
        for (int i=0; i < 10; i++) {
            System.out.println("Escreva o sobrenome nº " + i + " : ");
            linha = ler.nextLine();
            adicionarSobrenome(linha);
            buffWrite.append(linha + "\n");
        }
        buffWrite.close();
    }

    public static void lerNomeSobrenome(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public static void lerNome(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void lerSobreNome(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
