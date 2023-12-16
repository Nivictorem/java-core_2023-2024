package lr5;
//Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.
public class Task1 {
    private char symb;
    public void SetSymb(char symb)
    {
        this.symb = symb;
    }
    public int GetSymbCode()
    {
        if (Character.isDefined(this.symb))
            return (int)this.symb;
        else
        {
            return -1;
        }
    }
    public void PrintSymb()
    {
        if (Character.isDefined(this.symb))
        {
            System.out.printf("Symbol is: %s his code is: %d", this.symb, GetSymbCode());
        }

    }
}
