import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().listaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("Feminino"))
                .forEach(System.out::println);
    }
}