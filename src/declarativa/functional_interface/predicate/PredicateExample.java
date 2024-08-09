package declarativa.functional_interface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "typescript", "elixir", "clojure", "c", "go");
        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;
        palavras.stream()
                .filter(maisCincoCaracteres)
                .forEach(System.out::println);
    }
}
