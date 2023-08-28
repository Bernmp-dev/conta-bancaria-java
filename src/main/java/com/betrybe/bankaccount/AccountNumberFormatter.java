package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountStr = Integer.toString(literalAccountNumber);

    if (accountStr.length() < 6) {
      return StringUtils.leftPad(accountStr, 6, '0');
    } else if (accountStr.length() > 6) {
      return accountStr.substring(accountStr.length() - 6);
    } else {
      return accountStr;
    }
  }

}