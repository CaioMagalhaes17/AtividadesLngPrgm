import java.io.IOException;
public class Principal {
    public static void main(String [] args) throws IOException {
        String pathNome = "nome.txt";
        String pathSobrenome = "sobreNome.txt";
        String pathNomeSobrenome = "nomeSobrenome.txt";

        Manipulador.escreverNome(pathNome);
        Manipulador.escreverSobrenome(pathSobrenome);
        Manipulador.lerNome(pathNome);
        Manipulador.lerSobreNome(pathSobrenome);
        Manipulador.escreverNomeSobrenome(pathNomeSobrenome);
        Manipulador.lerNomeSobrenome(pathNomeSobrenome);
    }
}
