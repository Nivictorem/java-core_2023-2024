package lr5;
//Напишите программу с классом, в котором есть два закрытых
//        целочисленных поля (назовем их max и min). Значение поля max не может
//        быть меньше значения поля min. Значения полям присваиваются с помощью
//        открытого метода. Метод может вызываться с одним или двумя
//        целочисленными аргументами. При вызове метода значения полям
//        присваиваются так: сравниваются текущие значения полей и значения
//        аргументов, переданных методу. Самое большое из значений присваивается
//        полю max, а самое маленькое из значений присваивается полю min.
//        Предусмотрите конструктор, который работает по тому же принципу, что и
//        метод для присваивания значений полям. В классе также должен быть метод,
//        отображающий в консольном окне значения полей объекта
public class Task6 {
    private int min;
    private int max;
    public Task6(int a)
    {
        this.max = a;
        this.min = a;
    }
    public Task6(int a, int b)
    {
        this.min = Math.min(a,b);
        this.max = Math.max(a,b);
    }
    public void SetMaxMin(int a)
    {
        this.max = a;
        this.min = a;
    }
    public void SetMaxMin(int a, int b)
    {
        this.min = Math.min(a,b);
        this.max = Math.max(a,b);
    }
    public void PrintNums()
    {
        System.out.printf("min is %d, max is %d\n", this.min, this.max);
    }
}
