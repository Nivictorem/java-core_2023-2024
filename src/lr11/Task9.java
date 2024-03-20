package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые содержат только буквы (без цифр и символов).
public class Task9 {
    public static void main(String[] args) {
        String[] arr = ("Напишите функцию, которая принимает на " +
                "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с большой буквы. + 123132654").split(" ");
        GetStringArrWithUpp(arr).forEach(System.out::println);
    }

    private static List<String> GetStringArrWithUpp(String[] arr) {
        return Arrays.stream(arr).filter(Task9::HasSym).collect(Collectors.toList());
    }
    private static boolean HasSym(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if(".,:;+0123456789".contains(Character.toString(str.charAt(i))))
                return false;
        }
        return true;
    }
}
