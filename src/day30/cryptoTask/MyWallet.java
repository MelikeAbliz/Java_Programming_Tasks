package day30.cryptoTask;

public class MyWallet {
    public static void main(String[] args) {
        CryptoToken bitcoin = new Bitcoin(150, 15, 1111, 222, true);
        System.out.println(bitcoin);
    }
}
/*
3. create a class named MyWallet

		create one object for each CryptoToken

		calculate the total Asset
 */