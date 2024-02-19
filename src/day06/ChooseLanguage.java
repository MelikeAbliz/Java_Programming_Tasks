package day06;

public class ChooseLanguage {
    public static void main(String[] args) {
        int n=3;
        String result = "";

        if(n==1){
            result="Hello, thank for your call";
        }
        if(n==2){
            result="Hola, gracias para llamar";
        }
        if(n==3){
            result="Merhaba, aradiginiz icin tesekkurler";
        }
        if(n==4){
            result="Privet, spasibo za vash zvonok";
        }
        if(n==5){
            result="Merci ,pour votre appel";
        }
        System.out.println(result);
    }
}
/*

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement

 */