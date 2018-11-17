package pl.mareksowa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("witaj w calc");
        System.out.println("wybierz 'd' by dodawac lub 'exit' by wyjsc z programu");
        Scanner sc = new Scanner(System.in);
        String operator = sc.next();
        switch (operator){
            case "d":{
                System.out.println("dodajesz");
                break;
            }
            case "exit":{
                System.out.println("dowidzenia");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("nierozposnano komendy");
                break;
            }
        }
    }
}
