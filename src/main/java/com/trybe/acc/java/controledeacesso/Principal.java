package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal gera um relatorio de controle de acesso.
 */
public class Principal {

  /**
   * Método que controla o acesso pelo console.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Short>> people = new ArrayList<>();
    ArrayList<Short> minor = new ArrayList<>();
    ArrayList<Short> ofLegalAge = new ArrayList<>();
    ArrayList<Short> elderly = new ArrayList<>();
    people.add(minor);
    people.add(ofLegalAge);
    people.add(elderly);

    short option;

    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Acessar o estabelecimento\n"
          + "2 - Finalizar sistema e mostrar relatório");
      option = scan.nextShort();

      if (option == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scan.nextShort();
        personCategories(age, people);
      } else if (option != 2)  {
        System.out.println("Entre com uma opção válida!");
      }
    } while (option != 2);

    makeReport(people);

    scan.close();
  }

  /**
   * Método que separa as pessoas clientes por categoria de idade.
   */
  public static void personCategories(short age, ArrayList<ArrayList<Short>> people) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      people
          .get(0)
          .add(age);
    } else if (age <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
      people
          .get(1)
          .add(age);
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      people
          .get(2)
          .add(age);
    }
  }

  /**
   * Método que gera um relatorio sobre os clientes do dia.
   */
  public static void makeReport(ArrayList<ArrayList<Short>> people) {
    DecimalFormat decimalFormat = new DecimalFormat("0.##");
    ArrayList<Short> minor = people.get(0);
    ArrayList<Short> ofLegalAge = people.get(1);
    ArrayList<Short> elderly = people.get(2);
    int peopleSize = minor.size() + ofLegalAge.size() + elderly.size();

    double percentageMinor = (double) (minor.size() * 100) / peopleSize;
    double percentageOfLegalAge = (double) (ofLegalAge.size() * 100) / peopleSize;
    double percentageElderly = (double) (elderly.size() * 100) / peopleSize;

    System.out.println("----- Quantidade -----\n"
        + "menores: " + minor.size() + "\n"
        + "adultas: " + ofLegalAge.size() + "\n"
        + "a partir de 50: " + elderly.size() + "\n");
    System.out.println("----- Percentual -----\n"
        + "menores: " + decimalFormat.format(percentageMinor) + "%\n"
        + "adultas: " + decimalFormat.format(percentageOfLegalAge) + "%\n"
        + "a partir de 50: " + decimalFormat.format(percentageElderly) + "%\n");
    System.out.println("TOTAL: " + peopleSize);
  }
}
