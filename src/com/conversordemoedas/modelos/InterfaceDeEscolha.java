package com.conversordemoedas.modelos;

import com.conversordemoedas.calculos.CalcularConversao;

import java.util.Scanner;

public class InterfaceDeEscolha {
    public void Interface() {
        Scanner input = new Scanner(System.in);

        String opcoes = """
                
                ==============================================================
                1 - Dólar -> Peso argentino
                2 - Peso argentino -> Dólar
                3 - Dólar -> Real brasileiro
                4 - Real brasileiro -> Dólar
                5 - Dólar -> Peso colombiano
                6 - Peso colombiano -> Dólar
                7 - Encerrar
                ==============================================================
                
                Selecione uma opção.""";
        int opcao = 0;

        while (opcao != 7) {
            System.out.println(opcoes);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor1 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda1 = new ConverterTipoMoeda("USD", "ARS");
                    CalcularConversao calcularConversao1 = new CalcularConversao();

                    double valorConvertido1 = calcularConversao1.calcularConversao(valor1, converterTipoMoeda1);
                    System.out.println("Valor " + valor1 + " [USD] -> " + valorConvertido1 + " [ARS]");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor2 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda2 = new ConverterTipoMoeda("ARS", "USD");
                    CalcularConversao calcularConversao2 = new CalcularConversao();

                    double valorConvertido2 = calcularConversao2.calcularConversao(valor2, converterTipoMoeda2);
                    System.out.println("Valor " + valor2 + " [ARS] -> " + valorConvertido2 + " [USD]");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor3 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda3 = new ConverterTipoMoeda("USD", "BRL");
                    CalcularConversao calcularConversao3 = new CalcularConversao();

                    double valorConvertido3 = calcularConversao3.calcularConversao(valor3, converterTipoMoeda3);
                    System.out.println("Valor " + valor3 + " [USD] -> " + valorConvertido3 + " [BRL]");
                    break;
                case 4:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor4 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda4 = new ConverterTipoMoeda("BRL", "USD");
                    CalcularConversao calcularConversao4 = new CalcularConversao();

                    double valorConvertido4 = calcularConversao4.calcularConversao(valor4, converterTipoMoeda4);
                    System.out.println("Valor " + valor4 + " [BRL] -> " + valorConvertido4 + " [USD]");
                    break;
                case 5:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor5 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda5 = new ConverterTipoMoeda("USD", "COP");
                    CalcularConversao calcularConversao5 = new CalcularConversao();

                    double valorConvertido5 = calcularConversao5.calcularConversao(valor5, converterTipoMoeda5);
                    System.out.println("Valor " + valor5 + " [USD] -> " + valorConvertido5 + " [COP]");
                    break;
                case 6:
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor6 = input.nextDouble();

                    ConverterTipoMoeda converterTipoMoeda6 = new ConverterTipoMoeda("COP", "USD");
                    CalcularConversao calcularConversao6 = new CalcularConversao();

                    double valorConvertido6 = calcularConversao6.calcularConversao(valor6, converterTipoMoeda6);
                    System.out.println("Valor " + valor6 + " [COP] -> " + valorConvertido6 + " [USD]");
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, escolha entre 1 e 7");
            }
        }
    }
}
