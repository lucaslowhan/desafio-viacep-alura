package dev.lucaslowhan.viacep.main;

import dev.lucaslowhan.viacep.domain.ConsultaCep;
import dev.lucaslowhan.viacep.domain.Endereco;
import dev.lucaslowhan.viacep.domain.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cep ="";
        while(!cep.equalsIgnoreCase("0")) {
            if(cep.equalsIgnoreCase("0")){
                break;
            }
            System.out.println("Digite um número de cep para consultar:");
            System.out.println("Caso queira sair, aperte 0.");
            cep = sc.nextLine();
            ConsultaCep consultaCep = new ConsultaCep();
            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
                geradorDeArquivo.salvarArquivoJson(novoEndereco);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
