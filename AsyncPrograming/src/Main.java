public class Main {
    public static void main(String[] args)
    {
        SumThread sum = new SumThread();
        MultiplyThread multy = new MultiplyThread();
        ConsoleThread cons = new ConsoleThread();
        sum.start();
        multy.start();
        cons.start();

        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        sum.interrupt();
        multy.interrupt();
        cons.interrupt();
        System.out.println("results in queue count: " + StaticSequence.Sequence.stream().count());
    }
}