public class atmprogram {
    public static void main(String[] args) {
        atm atm = new atm();
        hesap hesap = new hesap("berkay bal","313169",5500);
        atm.calis(hesap);
        System.out.println("program bitmistir...");

    }
}
