import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorNomes {
    
    public final String arquivo = "nomes.txt";

    public void  salvarnome(String nome){
        try (FileWriter escrita = new FileWriter(arquivo, true)) {
            escrita.write(nome);
            escrita.write(System.lineSeparator());
            
        } catch (IOException e) {
             System.out.println("Erro ao salvar o nome!!!");
        }
        
    }

    public void lernomes(){
        try(BufferedReader ler = new BufferedReader(new FileReader(arquivo))) {
            
           String linha;

            while ((linha = ler.readLine()) !=null) {
                System.out.println(linha);
            }
            
        } catch (IOException e) {
            System.out.println("Sem nomes!!!");
        }
    }
}
