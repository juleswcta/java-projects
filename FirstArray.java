public class FirstArray extends Thread
{
    public void run()
    {
        int[] firstArray = {2, 4, 6, 8, 10};
        System.out.println(firstArray[1]);
        System.out.println(firstArray[3]);
    }
}
