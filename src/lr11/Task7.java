package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7.	Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые имеют длину больше заданного значения.
public class Task7 {
    public static void main(String[] args) {
        String[] arr = ("Напишите функцию, которая принимает на " +
                "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с большой буквы.").split(" ");
        GetStringArrWithUpp(arr, 7).forEach(System.out::println);
    }

    private static List<String> GetStringArrWithUpp(String[] arr, int len) {
        return Arrays.stream(arr).filter(x -> x.length() > len).collect(Collectors.toList());
    }
}
