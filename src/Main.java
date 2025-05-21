import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veicolo[] veicoli = new Veicolo[2];
        veicoli[0] = new Automobile(5, "Fiat 500", 2020);
        veicoli[1] = new Moto(998, "yamaha R1", 2021);
    }
    
    System.out.println("Quanti veicoli devi inserire?" + "1=Automobile, 2=Moto");
    int NumeroVeicoli = sc.nextInt();
    
switch (NumeroVeicoli) {
        case 1: System.out.println();
        case 2: System.out.println();
    }
    
}





//Modello, anno, e attributo specifico (porte o cilindrata).
//Salva i veicoli in un array.