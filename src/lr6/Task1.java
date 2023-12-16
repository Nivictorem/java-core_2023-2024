package lr6;
//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//        В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//        вызывается с символьным аргументом, то соответствующее значение присваивается
//        символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//        значение текстового ноля. Методу аргументом также может передаваться символьный
//        массив. Если массив состоит из одного элемента, то он определяет значение символьного
//        поля. В противном случае (если в массиве больше одного элемента) из символов массива
//        формируется текстовая строка и присваивается значением текстовому полю.

public class Task1 {
    private char char1;
    private String str1;
    public void SetField(char char1)
    {
        this.char1 = char1;
    }
    public void SetField(String str1)
    {
        this.str1 = str1;
    }
    public void SetField(char[] str)
    {
        if (str.length == 1)
        {
            this.char1 = str[0];
        }
        else if (str.length > 1)
        {
            this.str1 = new String(str);
        }
    }
    public void PrintFields()
    {
        if(Character.isDefined(this.char1))
        {
            System.out.println(this.char1);
        }
        if(str1 != null)
        {
            System.out.println(this.str1);
        }
    }
}
