package lr6;
//Напишите программу, в которой описан статический метод для вычисления
//        двойного факториала числа, переданного аргументом методу. По определению, двойной
//        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
public class Task4 {
    public static void DoubleFactorial(int a)
    {
        int sum = 1;
        for (int i = a; i > 0; i=i-2)
        {
            sum*=i;
        }
        System.out.println(sum);
    }

}
