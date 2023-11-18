package lr3;

import java.util.Arrays;

//Напишите программу, в которой создается символьный массив из
//        10 элементов. Массив заполнить большими (прописными) буквами
//        английского алфавита. Буквы берутся подряд, но только согласные (то есть
//        гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам
//        массива
//        нужно пропустить). Отобразите содержимое созданного массива в консольном
//        окне.
public class Example8 {
    public static void main(String[] args) {
        var str = "AEIOUY";
        var arr = new String[10];
        var len = 0;
        for(int i = 0;; i++)
        {
            if(len>=10)
                break;
            var chr = Character.toString((char)(97+i)).toUpperCase();
            if(!str.contains(chr))
            {
                arr[len] = chr;
                len++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
