public class Day2GitGithub {
    /*
    1-) git init--> Local repo olusturmak icin yani git ile klasörümüzü icindeki dosyalari
    iliskilendirmek icin kullanilir
    2-) git add . --> Working space den (yani yerel) dosyalarimi staging area'ya
    (yani commitlemek icin beklenen yer) gonderir
    3-) git status --> working space deki ve staging areada ki durumu gosterir
    4-) git commit -m "mesaj" --> staging area dan commit stora dosyalarimi gondermek icin kullanilir
    (commit yani versiyon surum olusturulmus olur)
    5-) git push --> uzak repo ya (yani remote  Github) gondermek icin kullandigimiz kod
    yalniz git push komutunu direk kullanmak istersek 1 kez
                git remote add origin adress
                git push -u origin master
    Not:  Yukaridaki  iki komutu tek seferde kullandiktan sonra ikinci commit lerim icin sadece git push
    kullaniriz

    6-) git log --oneline --> commit lerimdeki yani versiyonlarimdaki durumu gosterir

     */
    public static void main(String[] args) {
        System.out.println("Github'i da ogrendim ");
    }
}
