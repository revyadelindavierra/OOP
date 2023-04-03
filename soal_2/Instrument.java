/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_2;

/**
 *
 * @author Revy Adelinda
 */
import java.util.Scanner;

public class Instrument {

    public void play() {
        System.out.println("lihat harga");
    }
}

class Guitar extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga gitar saat ini adalah Rp.650.000,00");
    }
}

class Piano extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga piano saat ini adalah Rp.14.400.000,00");
    }
}

class sexophone extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga saxophone saat ini adalah Rp.9.878.000,00");
    }
}

class drum extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga drum saat ini adalah Rp.8.500.000,00");
    }
}

class biola extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga biola saat ini adalah Rp.782.000,00");
    }
}

class trompet extends Instrument {

    @Override
    public void play() {
        System.out.println("Harga trumpet saat ini adalah Rp.1.987.000,00");
    }
}

class Musician {

    public void playInstrument(Instrument instrument) {
        instrument.play();
    }
}

class Main {

    public static void main(String[] args) {
        Musician musician = new Musician();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Harga untuk alat musik");
            System.out.println("1. Guitar");
            System.out.println("2. Piano");
            System.out.println("3. sexophone");
            System.out.println("4. drum");
            System.out.println("5. biola");
            System.out.println("6. trompet");
            System.out.println("7. Quit");
            System.out.print("Pilih alat musik :");
            int pilih = scanner.nextInt();
            System.out.println("==============");
            System.out.println("======HARGA=======");

            switch (pilih) {
                case 1:
                    musician.playInstrument(new Guitar());
                    break;
                case 2:
                    musician.playInstrument(new Piano());
                    break;
                case 3:
                    musician.playInstrument(new sexophone());
                    break;
                case 4:
                    musician.playInstrument(new biola());
                    break;
                case 5:
                    musician.playInstrument(new drum());
                    break;
                case 6:
                    musician.playInstrument(new trompet());
                    break;
                case 7:
                    System.out.println("ok finee see u");
                    return;
                default:
                    System.out.println("gaadaa woii , coba lagi");
                    break;
            }
            System.out.println("=================");
        }
    }
}
