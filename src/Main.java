import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        //  Zadatak 2
        // Napravite petlju u koju unosite brojeve kada petlja detektuje broj -10, ispise vam se niz brojeva koje ste unjeli.
        // Zatim ce vam se na ekranu pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
        //Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.

       /*
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0, temporary,counter=1;
        String  yesNo;
        do {
            System.out.print("Enter a number :  ");


            if (!input.hasNextInt()) {
                System.out.println("Error! Please enter a number");
                input.nextLine();   //Sprečavanje pogrešnog unosa
                continue;
            }


            temporary = input.nextInt();

            //Provjera da li je unesen broj -10
            if (temporary == -10) {
                System.out.println(Arrays.toString(array));
                System.out.println("Do you want to expand your array ? Y/N");
                input.nextLine();
                yesNo = input.nextLine();
                if (!yesNo.equals("Y"))
                {
                    ++counter;
                    break;
                } else if (!yesNo.equals("N"))
                {
                    continue;
                }
                else if (counter == 2)
                {
                    return;
                }
            }

            //Čuvanje vrijednosti i povećanje indeksa za i-ti element
            array[i] = temporary;
            i++;
        } while (i < array.length);//Nastavi čitati sve dok index nije pokrio sve elemente
        //Ispisivanje niza
        System.out.println("The inputted values are: " + Arrays.toString(array));*/


        //Zadatak 3
        //Napravide funkciju koja provjereava da li je nesto palindrom,
        //Napravite Funkciju koja iz niza izbacuje brojeve koji mi specifikujemo,
        //Napravite funkciju koja provjerava da li je broj djeljiv sa brojem x.
        //Kada se pokrene aplikacija Pojavi vam se meni
        //
        //-Is string a palindrom
        //-Filter an Array
        //-Number is divisible by X.
        //Ukoliko izaberete  broj 2
        //Morate unjeti prvo brojeve za niz i zatim broj koji zelite izbaciti iz niza…




        //Zadatak 1

        Main main = new Main();
        int result = main.sum(1,2);
        result=main.sum(1,2);
        System.out.println(result);
        Scanner input = new Scanner(System.in);
        //1.aa
        //Napravite petlju koja ukoliko ima predefiniran neki broj u varijabli  "total"  koja je deklarisana prije while-a i koji je razlicit od nula
        //While petlja ce traziti da unosite za svaki loop pozitivan broj.
        //Ukoliko unesete negativan broj while petlja zavrsava.
       /* int temporary;
        int total=2;
        while (total!=0)
        {
            System.out.println("Enter a positive number: ");
            input.nextLine();
            temporary = input.nextInt();
            if (temporary > 0) {
                continue;
            }
            else
            {
                return;
            }  */

            //1.aaa
        //Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj traziti da unosite za svaki loop pozitivan broj.
        //Ukoliko unesete negativan broj while petlja zavrsava.

          /*  int i = 0, enteredNumber;

        do {
            System.out.print("Enter a number :  ");


            if (!input.hasNextInt()) {
                System.out.println("Error! Please enter a number");
                input.nextLine();
                continue;
            }
            enteredNumber = input.nextInt();

            if (enteredNumber > 0)
            {

                System.out.println(enteredNumber);
            }
            else
            {
               return;
            }
        } while (enteredNumber > 0);   */


    }
    int result;
    //Metoda za sabiranje
    public int sum(int num1, int num2){
        result = num1+num2;
        return result;
    }
    //Metoda za oduzimanje
    public int substract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    //Metoda za množenje
    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    //Metoda za dijeljenje
    public float divide(int num1, int num2){
        result = num1/num2;
        return result;
    }

    }
