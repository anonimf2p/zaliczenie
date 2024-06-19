//	22. Napisz program, który znajduje najmniejszą liczbę spośród trzech podanych liczb:
//- Program powinien wczytać trzy liczby całkowite wprowadzone przez użytkownika.
//- Porównać te liczby, aby znaleźć najmniejszą.
//- Wyświetlić najmniejszą liczbę.

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Main {
  public static void main(String[] args) {


System.out.println("podaj kolejno 3 liczby");
Scanner f = new Scanner(System.in);
Scanner g = new Scanner(System.in);
Scanner h = new Scanner(System.in);
double l = f.nextDouble();
double j = g.nextDouble();
double k = h.nextDouble();
if(l<j && l<k){
  System.out.println("najmniejsza liczba to:" + l);
}
if(j<l && j<k){
  System.out.println("najmniejsza liczba to:" + j);
}
if(k<l && k<j){
  System.out.println("najmniejsza liczba to:" + k);
}
return;





  }




}