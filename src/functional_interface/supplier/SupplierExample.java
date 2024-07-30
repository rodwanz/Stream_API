package functional_interface.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> suporte = () -> "Mandando brasa!";
        List<String> entendendoSuporte = Stream.generate(suporte).limit(5)
                .collect(Collectors.toList());
        entendendoSuporte.forEach(System.out::println);
    }
}
