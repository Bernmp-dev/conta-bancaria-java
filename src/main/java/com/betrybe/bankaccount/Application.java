package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * Main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o número da conta:");
    String input = scanner.nextLine();

    if (!StringUtils.isNumeric(input)) {
      System.out.println("Número da conta inválido!");
      return;
    }

    AccountNumberFormatter formatter = new AccountNumberFormatter();
    String formattedAccount = formatter.formatAccountNumber(Integer.parseInt(input));

    System.out.println("Número da conta: " + formattedAccount);
  }
}

