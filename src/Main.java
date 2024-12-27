import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().listaPessoas();

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);
        }
}