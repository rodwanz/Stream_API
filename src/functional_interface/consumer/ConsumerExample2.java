package functional_interface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> imprimeNumeroImpar = numero -> {
            if (numero % 2 == 1){
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(imprimeNumeroImpar);
    }
}
