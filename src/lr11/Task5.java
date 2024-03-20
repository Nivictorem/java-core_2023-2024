package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5.	Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые содержат заданную подстроку.
public class Task5 {
    public static void main(String[] args) {
        String[] arr = ("Напишите функцию, которая принимает на " +
                "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с большой буквы.").split(" ");
        GetStringArrWithUpp(arr, "ок").forEach(System.out::println);
    }

    private static List<String> GetStringArrWithUpp(String[] arr, String subStr) {
        return Arrays.stream(arr).filter(x -> x.contains(subStr)).collect(Collectors.toList());
    }
}
