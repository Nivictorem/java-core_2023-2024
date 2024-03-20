package lr11;
//3.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые начинаются с большой буквы.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = ("Напишите функцию, которая принимает на " +
                "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с большой буквы.").split(" ");
        GetStringArrWithUpp(arr).forEach(System.out::println);
    }

    private static List<String> GetStringArrWithUpp(String[] arr) {

        return Arrays.stream(arr).filter(x -> Character.isUpperCase(x.charAt(0))).collect(Collectors.toList());
    }
}
