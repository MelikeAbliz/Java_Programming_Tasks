package day06;

public class CharacterIdentify {
    public static void main(String[] args) {
      char c='D';
      String result="";
      boolean alphabetic=(c>='a' && c<='z')||(c>= 'A' && c<= 'Z');
      boolean digit=(c>='0' && c<='9');
      boolean special=!(digit || alphabetic);
      if (alphabetic){
          result="Alphabetic Character";
      }if (digit){
            result="digit";
        }
      if(special){
            result="Special Character";
        }
        System.out.println(result);
    }
}
/*
write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table

 */