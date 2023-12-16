package lr5;
//Напишите программу с классом, у которого есть два символьных поля и
//        метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//        выводит в консольное окно все символы из кодовой таблицы, которые
//        находятся «между» символами, являющимися значениями полей объекта (из
//        которого вызывается метод). Например, если полям объекта присвоены
//        значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//        выводиться все символы от ‘A’ до ‘D’ включительно.
public class Task2 {
    public char ch1;
    public char ch2;
    public void PrintAllSymbBetween12()
    {
        if(Character.isDefined(this.ch1) && Character.isDefined(this.ch2) )
        {
            var char1 =  (int)ch1 < (int)ch2 ? ch1 : ch2;
            var char2 =  (int)ch1 < (int)ch2 ? ch2 : ch1;
            for (int i = (int)char1; i <= (int)char2; i++)
            {
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}
