public class Main
{
    public static void main(String[] args)
    {
        String name1, name2, producent1, producent2;
        float price1, price2;

        name1 = "Mleko";
        name2 = "Czekolada";
        producent1 = "Mlekowita";
        producent2 = "Wedel";
        price1 = 2.5f;
        price2 = 2.19f;

        System.out.println("Produkt1:");
        System.out.print(name1 + " " + producent1 + " " + price1 + '\n');
        System.out.println("Produkt2:");
        System.out.print(name2 + " " + producent2 + " " + price2 + '\n');


        float number1 = 0.5f;
        String name = "John";
        float number2 = 2.5f;
        number2 = 3.8f;
        System.out.println(number1 + " " + number2 + " " + name);

        int number = 10;
        System.out.println(++number +"+"+number+"="+(number+number));
        System.out.println(++number+number++);
        System.out.println(--number+number++);
        System.out.println(++number+number--);
        System.out.println(--number);

        float liczba1, liczba2, wynik1, wynik2, wynik3;
        double wynik4;
        boolean wynik1bool, wynik2bool, wynik3bool, wynik4bool;
        liczba1 = 12.0f;
        liczba2 = 5.5f;
        wynik1=liczba1+liczba2;
        wynik2=liczba1-liczba2;
        wynik3=liczba1*liczba2;
        wynik4=liczba1/liczba2;

        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);

        wynik1bool=wynik1>0;
        wynik2bool=(wynik2/2==0);
        wynik3bool=wynik1>100||wynik2>100;
        wynik4bool=wynik1>100 && wynik2 >100;

        System.out.println("Czy a jest większe od 0?" + " " + wynik1bool);
        System.out.println("Czy suma jest parzysta?"+ " " + wynik2bool);
        System.out.println("A lub B większe od 100?"+ " " + wynik3bool);
        System.out.println("A i B większe od 100?"+ " " + wynik4bool);

        Product produkt1 = new Product("Guma","AAA",2.50);
        Product produkt2 = new Product();
        Product produkt3 = new Product();
        Product produkt4 = produkt3;

        //produkt1.nazwaprod = "Guma";
        produkt2.nazwaprod = "Pasta";
        produkt3.nazwaprod = "Woda";
        //produkt1.cena = 2.50;
        produkt2.cena = 5.40;
        produkt4.cena = 2.45;

        System.out.println(produkt1.nazwaprod + " " + produkt1.cena);
        System.out.println(produkt2.nazwaprod + " " + produkt2.cena);
        System.out.println(produkt3.nazwaprod + " " + produkt3.cena);
        System.out.println(produkt4.nazwaprod + " " + produkt4.cena);
    }
}
