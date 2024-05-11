package _22010310010_SalihaMeryem_Albayrak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		File dosya= new File ("boole.txt");
		Scanner input = new Scanner(dosya);
		String s=input.nextLine();
		System.out.println("boole.txt dosyası okundu.");
		System.out.println("doğruluk tablosu: ");
		fonksiyon fonk =new fonksiyon(s);
		
	}

}
