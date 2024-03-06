/*Nama : Muh. Riandy Dwi Putra
Nim : 13020220121
 */

import javax.swing.*;
public class JOptionPaneee {
    public static void main(String[] args) {

       //input data oleh user
       String Nim = JOptionPane.showInputDialog("Nim: ");
       String Nama = JOptionPane.showInputDialog("Nama: ");
       String Jurusan = JOptionPane.showInputDialog("Jurusan: ");
       String Fakultas = JOptionPane.showInputDialog("Fakultas: ");

       // Output dari inputan oleh user
       System.out.println("--Data Mahasiswa--");
       System.out.println("Nim      : " + Nim);
       System.out.println("Nama     : " + Nama);
       System.out.println("Jurusan  : " + Jurusan);
       System.out.println("Fakultas : " + Fakultas);
    }
}