import java.util.Scanner;

public class Main {
    public static void main(String[] args) {





        //Zadatak 1

        Main main = new Main();
        int result = main.sum(1, 2);
        result = main.sum(1, 2);
        System.out.println(result);
        Scanner input = new Scanner(System.in);
        //Zadatak 1.aa
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

        //Zadatak 1.aaa
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


        //Zadatak 1.b
      /*  int numberTaskB;
        do {
            System.out.println("Please enter any integer :");
            numberTaskB = input.nextInt();

            if (numberTaskB == -1000) {
                System.out.println("Exit number -1000 is detected.");
            }
        } while (numberTaskB != -1000);   */


        //zadatak 1.c

      /*  int numberTaskC = 0;
        int sumTaskC = 0;
        do {
            System.out.println("Please enter integer:");
            numberTaskC = input.nextInt();
            input.nextLine();

            if (numberTaskC == -1000) {
                System.out.println("Exit number -1000 is detected.");
                break;
            }

            sumTaskC = sumTaskC + numberTaskC ;

        } while (numberTaskC != -1000); */




     /*   //ZAdatak 1.d i 1.e


        double a, b;
        char operator;
        System.out.println("Enter operator (+, -, *, /) ");
        operator = input.next().charAt(0);
        System.out.print("Enter first number : ");
        a=input.nextInt();
        System.out.print("Enter second number : ");
        b=input.nextInt();
        double addition  = a+b;
        double subtraction  = a-b;
        double multiplication  = a*b;
        double division  = a/b;

        if (operator == '+')
        {
            System.out.print("Total after Addition is : " + addition);
        }    else if(operator == '-')
        {
            System.out.print("Total after Subtraction is : " +subtraction);
        }
        else if(operator == '*')
        {
            System.out.print("Total after Multiplication is : "+multiplication);
        }
        else if(operator == '/')
        {
            System.out.print("Total after Division is : "+division);
        } else
        {
            System.out.print("Please select proper operator");
        }

        */
        //Zadatak 1.f

        int numberTaskF = 0;
        while (true) {
            System.out.println("Which operation would you like to use: *,/,+,-,= ?");
            char operation = input.next().charAt(0);
            if (operation != '+' && operation != '-' && operation != '*' && operation != '/' && operation != '=') {
                System.out.println("Please select proper operator.");
                continue;
            } else if (operation == '=') {
                if (numberTaskF == 0) {
                    System.out.println("You have not entered any values");
                } else {
                    System.out.println("Total is " + numberTaskF);
                }
                break;
            }
            System.out.println("Please enter integer");
            int numberYouEntered = input.nextInt();
            if (numberYouEntered == -1000) {
                System.out.println("Exit number -1000 has been detected");
                break;
            } else if (operation == '+') {
                numberTaskF = numberTaskF + numberYouEntered;
            } else if (operation == '-') {
                numberTaskF = numberTaskF + numberYouEntered;
            } else if (operation == '*') {
                numberTaskF = numberTaskF * numberYouEntered;
            } else if (operation == '/') {
                numberTaskF = numberTaskF/ numberYouEntered;
            }
        }
    }





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

    int result;
    //Metoda za sabiranje
    public static int sum(int num1, int num2){
       int result = num1+num2;
        return result;
    }
    //Metoda za oduzimanje
    public static int substract(int num1, int num2){
        int result = num1-num2;
        return result;
    }
    //Metoda za množenje
    public static int multiply(int num1, int num2){
       int result = num1*num2;
        return result;
    }
    //Metoda za dijeljenje
    public static int divide(int num1, int num2){
        if (num2 == 0)
        {
            System.out.println("Not possible to divide with 0.");
        } else {
            int result = num1 / num2;
            return result;
        }
        return num1;
    }

    }
