import java.util.Scanner;

public class atm {
    public void calis(hesap hesap){
        login login = new login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("bankamıza hosgeldinizzzz");
        System.out.println("***************");
        System.out.println("kullanıcı girisi");
        System.out.println("****************");
        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("giris basarili...");
                break;
            } else {
                System.out.println("giris basarisiz...");
                giris_hakki -= 1;
                System.out.println("kalan giris hakkiniz:" + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("giris hakkiniz kalmadi...");
                return;
            }
        }
            System.out.println("************************************");
            String islemler = "1. bakiye görüntüle\n" + "2. para yatirma\n" + "3. para cekme\n" + "cikis icin q ya basin";
            System.out.println(islemler);
            System.out.println("************************************");

            while (true) {
                System.out.println("islemi seciniz:");
                String islem = scanner.nextLine();

                if (islem.equals("q")) {
                    break;
                } else if (islem.equals("1")) {
                    System.out.print("hesap bakiyesi:" +hesap.getBakiye());
                } else if (islem.equals("2")) {
                    System.out.print("yatirmak istediginiz tutari giriniz:");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraYatir(tutar);
                } else if (islem.equals("3")) {
                    System.out.print("cekmek istediginiz tutari giriniz:");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraCekme(tutar);
                }
                else {
                    System.out.println("lütfen gecerli islem giriniz...");
                }
            }
        }
    }
