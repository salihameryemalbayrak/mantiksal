package _22010310010_SalihaMeryem_Albayrak;

import java.util.Arrays;
import java.util.LinkedList;

public class fonksiyon {
	int[] degerler;
	String fonkAdi;
	degisken[] degiskenler;
	LinkedList<String> girdi;
	LinkedList<String> mintermler;
	LinkedList<String> maxtermler;
	fonksiyon(String s){
		this.fonkAdi=s.charAt(0)+"";
		this.degiskenler=degiskenOlustur(s);
		this.girdi=terimAlma(s);
		degerler= new int[(int) Math.pow(2,4)];
		mintermler= new LinkedList<String>();
		maxtermler= new LinkedList<String>();
		fonkOlusturma(degiskenler);
		System.out.println("Fonksiyon ifadeleri: ");
		acikMintermYazdirma();
		kapaliMinterm();
		acikMaxtermYazdirma();
		kapaliMaxterm();
	}
	public void fonkOlusturma(degisken[] degiskenler) {
		int counter=0;
		for (int i=0;i<2;i++) {
			degiskenler[0].deger=i;
			for(int j=0;j<2;j++) {
				degiskenler[1].deger=j;
				for(int k=0;k<2;k++) {
					degiskenler[2].deger=k;
					for(int l=0;l<2;l++) {
						degiskenler[3].deger=l;
						String s="";
						String s2="";
						if(degiskenler[0].deger==1) {
							s=s+ degiskenler[0].degiskenAdi;
							s2="("+s2+degiskenler[0].degili+" + ";
						}
						else {
							s=s+ degiskenler[0].degili;
							s2="("+s2+degiskenler[0].degiskenAdi+" + ";
						}
						if(degiskenler[1].deger==1) {
							s=s+ degiskenler[1].degiskenAdi;
							s2=s2+degiskenler[1].degili+" + ";
						}
						else {
							s=s+ degiskenler[1].degili;
							s2=s2+degiskenler[1].degiskenAdi+" + ";
						}
						if(degiskenler[2].deger==1) {
							s=s+degiskenler[2].degiskenAdi;
							s2=s2+degiskenler[2].degili+" + ";
						}
						else {
							s=s+ degiskenler[2].degili;
							s2=s2+degiskenler[2].degiskenAdi+" + ";
						}
						if(degiskenler[3].deger==1) {
							s=s+degiskenler[3].degiskenAdi;
							s2=s2+degiskenler[3].degili+ ")";
						}
						else {
							s=s+ degiskenler[3].degili;
							s2=s2+degiskenler[3].degiskenAdi+ ")";
						}
						for(int b=0;b<this.girdi.size();b++) {
							if(s.contains(girdi.get(b))&&!s.contains(girdi.get(b)+"'")) {
								this.degerler[counter]=1;
								this.mintermler.add(s);
							}
						}
						if(this.degerler[counter]==0) {
							this.maxtermler.add(s2);
						}
						System.out.println(i+ " "+ j+ " "+k + " " + l +" "+this.degerler[counter]);
						counter++;
					}
				}
			}
		}
	}
	
	public LinkedList<String> terimAlma(String s) {
		LinkedList<String> tarananTerimler= new LinkedList<String>();
		String k="";
		for(int i=4;i<s.length();i++) {
			if(s.charAt(i)== ' ') {
				tarananTerimler.add(k);
				k="";
				i=i+3;
			}
			k=k+s.charAt(i);
		}
		tarananTerimler.add(k);
		return tarananTerimler;
	}
	public degisken[] degiskenOlustur(String s) {
		
		String degiskenler="";
		int d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=this.fonkAdi.charAt(0) && Character.isLetter(s.charAt(i))&& (degiskenler.indexOf(s.charAt(i))==-1)) {
				degiskenler=degiskenler+s.charAt(i);
				d++;
			}
		}
		char[] dizi= new char[4];
		for(int i=0;i<degiskenler.length();i++) {
			dizi[i]=degiskenler.charAt(i);
		}
		Arrays.sort(dizi);
		
		degisken[] degiskenlerListesi =new degisken[4];
		for(int i=0;i<4;i++) {
			degisken degis= new degisken("" +dizi[i]);
			degiskenlerListesi[i]=degis;
			System.out.print(degis.degiskenAdi+ " ");
		}
		System.out.println(this.fonkAdi);
		return degiskenlerListesi;
		
	}
	public void acikMintermYazdirma() {
		System.out.print(this.fonkAdi+" = "+ this.mintermler.get(0));
		for(int i=1;i<this.mintermler.size();i++) {
			System.out.print(" + "+this.mintermler.get(i));
		}
		System.out.println();
	}
	public void acikMaxtermYazdirma() {
		System.out.print(this.fonkAdi+" = "+ this.maxtermler.get(0));
		for(int i=1;i<this.maxtermler.size();i++) {
			System.out.print("." +this.maxtermler.get(i));
		}
		System.out.println();
	}
	public void kapaliMinterm() {
		LinkedList<Integer> mint=new LinkedList<Integer>();
		System.out.print(this.fonkAdi+" = E");
		for(int i=0;i<this.degerler.length;i++) {
			if(this.degerler[i]==1) {
				mint.add(i);
			}
		}
		System.out.println(mint);
	}
	public void kapaliMaxterm() {
		LinkedList<Integer> maxt=new LinkedList<Integer>();
		System.out.print(this.fonkAdi+" = M");
		for(int i=0;i<this.degerler.length;i++) {
			if(this.degerler[i]==0) {
				maxt.add(i);
			}
		}
		System.out.println(maxt);
	}

}
