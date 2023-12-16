package lr5;
//Напишите программу с классом, у которого есть символьное и
//        целочисленное поле. В классе должны быть описаны версии конструктора с
//        двумя аргументами (целое число и символ – определяют значения полей), а
//        также с одним аргументом типа double. В последнем случае действительная
//        часть аргумента определяет код символа (значение символьного поля), а
//        дробная часть (с учетом десятых и сотых) определяет значение
//        целочисленного поля. Например, если аргументом передается число 65.1267,
//        то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//        поле получит значение 12 (в дробной части учитываются только десятые и
//        сотые).

public class Task4 {
    private char char1;
    private int a;
    public Task4 (char char1, int a)
    {
        this.char1 = char1;
        this.a = a;
    }
    public Task4(double b)
    {
        this.char1 = (char)((int)b);
        this.a = (int)(b%1*100);
    }
    public void PrintFields()
    {
        if(Character.isDefined(this.char1))
        {
            System.out.printf("The character is %s the number is %d\n", this.char1, this.a);
        }
    }

}
