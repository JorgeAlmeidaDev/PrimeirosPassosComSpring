package jg.springboot;

import org.springframework.stereotype.Component;
// sem precisar explicitar o uso de new em nossa aplicação
@Component  // anotada como um componente para ser usada em outros metodos e ter a possbilidade de ser injetada
public class Calculadora {
    public int somar(int numero1, int numero2)
    {
        return numero1+numero2;
    }
}
