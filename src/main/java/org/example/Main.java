package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("携帯電話番号を入力してください: ");
      String inputPhoneNumber = scanner.next();

      if (inputPhoneNumber.matches("^0[5-9]0-\\d{4}-\\d{4}$")) {
        System.out.println(inputPhoneNumber + " は有効な電話番号です。");
      } else {
        System.out.println(inputPhoneNumber + " は無効な電話番号です。");
      }
      System.out.println("再度入力しますか？(y or n):  ");
      String yesOrNo = scanner.next();
      if (yesOrNo.equals("n")) {
        scanner.close();
        break;
      } else if (yesOrNo.equals("y")) {
      } else {
        System.out.println("無効な入力です。番号入力へ戻ります。");
      }
    }
  }
}