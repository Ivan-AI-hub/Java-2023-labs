import java.util.Random;

public class ConsoleThread extends Thread
{
    @Override
    public void run()
    {
        while (!isInterrupted())
        {
            int a;
            try
            {
                a = StaticSequence.Sequence.take();
            } catch (InterruptedException e)
            {
                break;
            }
            System.out.println("new result: " + a);
        }
    }
}
