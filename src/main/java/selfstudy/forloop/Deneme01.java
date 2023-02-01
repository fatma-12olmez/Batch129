package selfstudy.forloop;

public class Deneme01 {
    public static void main(String[] args) {

//public class Q04_Foreach_Sifreleme {

     /*

    Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek

   şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (for-each loop kullanınız)


     */

        /*
    public static void main(String[] args) {

        System.out.println(sifreleme());

        System.out.println(sifreCoz());

    }

    public static String sifreleme() {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir String giriniz");

        String[] arr = input.nextLine().split("");// {".", ".", "." ... }

        String sifreliString = "";

        for (String w : arr) {

            if (w.equals("z")) {

                sifreliString += "a";

            } else if (w.equals("Z")) {

                sifreliString += "A";

            } else {

                sifreliString += (char) (w.charAt(0) + 1);

            }

        }
        return sifreliString;
    }



    public static String sifreCoz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Şifreli String'i giriniz");
        String[] arr = input.nextLine().split("");// {".", ".", "." ... }
        String SifresizString = "";
        for (String w : arr) {
            if (w.equals("a")) {
                SifresizString += "z";
            } else if (w.equals("A")) {
                SifresizString += "Z";
            } else {
                SifresizString += (char) (w.charAt(0) - 1);
            }
        }

        return SifresizString;
    }
}

        class Q05_Varargs_KullaniciBilgileri {


        */

        // Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.

        /*
    public static void main(String[] args) {


        bilgiler("Ali", "Can", 22, "Ankara", "Konya", "Erzurum", "Ağrı", "Diyarbakır", "Kayseri");
        System.out.println();
        bilgiler2("Ali", "Can", "22", "Ankara", "Konya", "Erzurum", "Ağrı", "Diyarbakır", "Kayseri");
        System.out.println();
        bilgiler2("Ahmet", "Tan", "33", "Hamburg", "Bremen", "Berlin");
    }

    public static void bilgiler(String ad, String soyad, int yas, String... sehirler) {

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.print("Yaşanılmış sehirler: ");
        for (String w : sehirler) {

            System.out.print(w + " ");

        }
    }


    public static void bilgiler2(String... bilgiler) {
        for (int i = 0; i < bilgiler.length; i++) {
            if (i == 0) {
                System.out.println("Ad: " + bilgiler[i]);
            } else if (i == 1) {
                System.out.println("Soyad: " + bilgiler[i]);
            } else if (i == 2) {
                System.out.println("Yaş: " + bilgiler[i]);
                System.out.print("Yaşanılan Şehirler: ");
            } else {
                System.out.print(bilgiler[i] + " ");
            }
        }  /*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
  */
        /*
        public static void main (String[]args){

            int[] arr = {1, 2, 3, 4, 0, 5, 4, 3, 2, 1};

            //Array'i List'e çevir:
            List<Integer> list = new ArrayList<>();
            for (int w : arr) {
                list.add(w);
            }
            System.out.println("list = " + list);

            //Max değeri bul
            int max = list.get(0);
            for (int w : list) {
                if (w > max) {
                    max = w;
                }
            }
            System.out.println("max = " + max);

            //List1
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == max) {
                    break;
                }
                list1.add(list.get(i));
            }
            System.out.println("list1 = " + list1);

            //List2
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {

                if (i < list.indexOf(max)) {
                    continue;
                }

                list2.add(list.get(i));
            }
            System.out.println("list2 = " + list2);

         */
        /*

            //Yedekleyip sırala
            List<Integer> list1Copy = new ArrayList<>(list1);
            List<Integer> list2Copy = new ArrayList<>(list2);

            Collections.sort(list1Copy);
            Collections.sort(list2Copy);
            Collections.reverse(list2Copy);
            System.out.println("list1Copy = " + list1Copy);
            System.out.println("list2Copy = " + list2Copy);

            //Kontrol
            if (list1.equals(list1Copy) && list2.equals(list2Copy)) {
                System.out.println("Mountain Array");
            } else {
                System.out.println("Mountain Array DEĞİL");
            }
        }
    }

         */

    }
}