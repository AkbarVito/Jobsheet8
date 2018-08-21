/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class TugasPraktikum {

public static void main(String[] args){

// membuat variabel dan scanner
boolean running =true;
int counter =0;
        String jawab;
        Scanner scan =new Scanner(System.in);

while( running ){
            System.out.println("Apakah anda ingin masuk?");
            System.out.print("Jawab [yes/no]> ");

            jawab = scan.nextLine();

// cek jawabnnya, kalau ya maka berhenti mengulang
if( jawab.equalsIgnoreCase("no")){
                running =false;
}

            counter++;
}

        System.out.println("Anda sudah melakukan perulangan sebanyak "+ counter +"x");

}
}


