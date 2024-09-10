package jg.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // faz com que Calcululadora possa ser adcionar um objeto como componente
public class MyApp implements CommandLineRunner {
    @Autowired   // Faz a injeção de dependencia de calculadora com componente  de um objeto
    private Calculadora calculadora;
    @Override  // sobrescreve o metodo de start inicial passando apenas Sys.out do objeto adcionado como componente por injeção de dependencia
    public void run(String...args) throws Exception{
        System.out.println("o resultado é: " + calculadora.somar(2,7));

    }

}
