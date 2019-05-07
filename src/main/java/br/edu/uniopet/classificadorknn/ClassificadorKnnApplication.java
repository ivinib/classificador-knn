package br.edu.uniopet.classificadorknn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClassificadorKnnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClassificadorKnnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/br/edu/uniopet/classificadorknn/lib/iris.arff"));
        String linha = "";
        //String matrizPrincipal[][] = new String[150][5];
        List<String> dados = new ArrayList<>();

        while ((linha = bufferedReader.readLine()) != null){
            if (linha.contains("Iris") && !linha.contains("@") && !linha.contains("%")){
                dados.add(linha);
            }
        }
        bufferedReader.close();
    }
}
