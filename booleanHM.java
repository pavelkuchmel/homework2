import java.util.Scanner;
public class booleanHM {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*
--------Кучмель Павел------------------------------------------------------------------------------------------
         */
        //Boolean1.
        //Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        boolean m=a>0;
        System.out.println("Введенное число является положительным: "+m);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean2
        //Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        int a1=a%2;
        boolean m=a1==1;
        System.out.println("Введенное число является нечетным: "+m);
        */
        /*
--------------------------------------------------------------------------------------------------------------
         */
        //Boolean3. Дано целое число A.
        //Проверить истинность высказывания: «Число A является четным».
        /*
        System.out.print("Введите число: ");
        int a=in.nextInt();
        int a1=a%2;
        boolean m=a1==0;
        System.out.println("Введенное число является четным: "+m);
         */
        /*
--------------------------------------------------------------------------------------------------------------
         */
        //Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        boolean sa=a>2;
        boolean sb=b<=3;
        boolean sab=sa==sb;
        System.out.println("Число А больше 2ух: "+sa);
        System.out.println("Число B меньше/равно 3ем: "+sb);
        System.out.println("Число А больше двух, а число В меньше/равно 3ем: "+sab);
         */
        /*
----------------------------------------------------------------------------------------------------------------
         */
        //Boolean5. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        boolean sa=a>=0;
        boolean sb=b<-2;
        boolean sab=sa==sb;
        System.out.println("Число А больше/равно 0: "+sa);
        System.out.println("Число B меньше -2: "+sb);
        System.out.println("Число А больше/равно 0, а число В меньше -2: "+sab);
        */
        /*
----------------------------------------------------------------------------------------------------------------
         */
        //Boolean6. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean spnr=a<b&b<c;
        System.out.println("Двойное неравенство А<B<C справедливо: "+spnr);
        */
        /*
----------------------------------------------------------------------------------------------------------------
         */
        //Boolean7. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Число B находится между числами A и C».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean spnr=a<b&b<c;
        boolean spnro=c<b&b<a;
        boolean finsr=spnr^spnro;
        System.out.println("Число В находится медлу числами А и С: "+finsr);
        */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean8. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Каждое из чисел A и B нечетное»
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1==1;
        int b1=b%2;
        boolean srb=b1==1;
        boolean  ressr=sra&srb;
        System.out.println("Верно ли, что каждое из введеных чисел нечетное: "+ressr);
        */
        /*
----------------------------------------------------------------------------------------------------------------
         */
        //Boolean9. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1==1;
        int b1=b%2;
        boolean srb=b1==1;
        boolean  ressr=sra|srb;
        System.out.println("Верно ли, что хотя бы одно из введеных чисел нечетное: "+ressr);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean10. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1==1;
        int b1=b%2;
        boolean srb=b1==1;
        boolean  ressr=sra^srb;
        System.out.println("Ровно одно из введеных чисел нечетное: "+ressr);
        */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean11. Даны два целых числа: A, B.
        //Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        int a1=a%2;
        boolean sra=a1==1;
        int b1=b%2;
        boolean srb=b1==1;
        boolean  ressr=sra==srb;
        System.out.println("Числа А и В имеют одинаковую четность: "+ressr);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean12. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean pra=a>=0;
        boolean prb=b>=0;
        boolean prc=c>=0;
        boolean prab=pra&prb;
        boolean prac=prb&prc;
        boolean prall=prab&prac;
        System.out.println("Каждое из чисел А, В, С положительное: "+prall);
        */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean13. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».
        /*
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean pra=a>=0;
        boolean prb=b>=0;
        boolean prc=c>=0;
        boolean prab=pra|prb;
        boolean prac=prb|prc;
        boolean prall=prab|prac;
        System.out.println("Хотя бы одного из чисел положительное: "+prall);
        */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean14◦
        //Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
        /*
        НЕ СМОГ РЕШИТЬ
        System.out.print("Введите число A: ");
        int a=in.nextInt();
        System.out.print("Введите число В: ");
        int b=in.nextInt();
        System.out.print("Введите число C: ");
        int c=in.nextInt();
        boolean pra=a>=0;
        boolean prb=b>=0;
        boolean prc=c>=0;
        boolean pr1=pra^prb;
        boolean pr2=prb^prc;
        boolean pr3=prc^pra;
        System.out.println("Ровно одно из чисел положительное: "+pr1);
        System.out.println("Ровно одно из чисел положительное: "+pr2);
        System.out.println("Ровно одно из чисел положительное: "+pr3);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean15. Даны три целых числа: A, B, C.
        //Проверить истинность высказывания: «Ровно два из чисел A, B, C являются положительными».
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //Boolean16. Дано целое положительное число.
        //Проверить истинность высказывания: «Данное число является четным двузначным».
        /*
        System.out.print("Введите целое число: ");
        int num=in.nextInt();
        boolean dz=(9<num)&(num<100);
        int chetn=num%2;
        boolean chet1=chetn==0;
        System.out.println("Данное число является четным двузначным: "+(dz&chet1));
        */
        /*
----------------------------------------------------------------------------------------------------------------
         */
        //Boolean17.
        //Дано целое положительное число.
        //Проверить истинность высказывания: «Данное число является нечетным трехзначным».
        /*
        System.out.print("Введите целое число: ");
        int num=in.nextInt();
        boolean dz=(99<num)&(num<1000);
        int chetn=num%2;
        boolean chet1=chetn==1;
        System.out.println("Данное число является нечетным трехзначным: "+chet1);
        */
        /*
------------------------------------------------------------------------------------------------------------------
         */
        //Boolean18. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        /*
        System.out.print("Введите целое число: ");
        int a=in.nextInt();
        System.out.print("Введите целое число: ");
        int b=in.nextInt();
        System.out.print("Введите целое число: ");
        int c=in.nextInt();
        boolean sovp=(a==b)|(b==c)|(a==c);
        System.out.println("Среди введенных чисел есть повторяющиеся: "+sovp);
        */
        /*
---------------------------------------------------------------------------------------------------------------------
         */
        //Boolean19. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».
        /*
        System.out.print("Введите целое число: ");
        int a=in.nextInt();
        System.out.print("Введите целое число: ");
        int b=in.nextInt();
        System.out.print("Введите целое число: ");
        int c=in.nextInt();
        int otrA=a*(-1);
        int otrB=b*(-1);
        int otrC=c*(-1);
        boolean srav=(a==otrB)|(b==otrC)|(a==otrC);
        System.out.println("Среди введенных чисел есть хотя бы одна пара взаимно противоположных: "+srav);
        */
        /*
-----------------------------------------------------------------------------------------------------------------
         */
        //Boolean20. Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».
        /*
        System.out.print("Введите целое трехзначное число: ");
        int num=in.nextInt();
        int sot=num/100;
        int des=num/10%10;
        int ed=num%10;
        boolean sotIdes=sot!=des;
        boolean desIed=des!=ed;
        boolean sotdesIdesed=sotIdes&desIed;
        boolean sotIed=sot!=ed;
        boolean sotdesidesedIsotied=sotdesIdesed&sotIed;
        System.out.println(sotdesidesedIsotied);
        */
    }
}
