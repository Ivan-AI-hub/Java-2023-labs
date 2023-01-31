import java.util.Random;

public class MultiplyThread extends Thread
{
    @Override
    public void run()
    {
        Random rn = new Random();
        while (!isInterrupted())
        {
            int a = rn.nextInt(10, 21);
            int b = rn.nextInt(10, 21);
            try
            {
                StaticSequence.Sequence.put(a*b);
            } catch (InterruptedException e)
            {
                break;
            }
        }
    }
}
