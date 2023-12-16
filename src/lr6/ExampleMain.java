package lr6;


import java.util.Arrays;

public class ExampleMain {
    public static void main(String[] args) {
        CallTask10();
    }

    private static void CallTask10() {

        System.out.println(Arrays.toString(Task10.ReturnMinMaxValue(12)));;
    }

    private static void CallTask9() {
        var someArr = new int[]{1, 2, 3, 4};
        Task9.RecombinateNums(someArr);
        System.out.println(Arrays.toString(someArr));
    }

    private static void CallTask8() {
        System.out.println(Task8.GetAvarageNum(new int[]{1,1,2,3,4,5,6}));
    }

    private static void CallTask7() {
        System.out.println(Arrays.toString((Task7.CastToCode(new char[] {'a', 'b', 'c'}))));
    }

    private static void CallTask6() {
        System.out.println(Arrays.toString(Task6.CreateArr(new int[] {0, 2, 3, 4 ,5}, 10)));
    }

    private static void CallTask5() {
        Task5.SumSquare(5);
    }

    private static void CallTask4() {
        Task4.DoubleFactorial(5);
    }

    private static void CallTask3() {
        Task3.GetMinMAxMiddleNums( new int[]{1, 2, 3});
        Task3.GetMinMAxMiddleNums( new int[]{3, 2, 3});
        Task3.GetMinMAxMiddleNums(2,2,5);
    }

    private static void CallTask2() {
        Task2.PrintCounter();
        Task2.PrintCounter();
    }

    private static void CallTask1() {
        var t1 = new Task1();
        char[] chM = {'1'};
        t1.SetField(chM.clone());
        t1.PrintFields();
        char[] chM1 = {'1', '2'};
        t1.SetField(chM1);
        t1.PrintFields();
    }
}
