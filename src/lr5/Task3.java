package lr5;
//Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей одного аргумента и с передачей
//        двух аргументов.
public class Task3 {
    private int a;
    private int b;
    public Task3()
    {

    }
    public Task3(int a)
    {
        this.a = a;
    }
    public Task3(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
