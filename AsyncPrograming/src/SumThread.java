import java.util.Random;

public class SumThread extends Thread
{
    @Override
    public void run()
    {
        Random rn = new Random();
        while (!isInterrupted())
        {
            int a = rn.nextInt(0, 10);
            int b = rn.nextInt(0, 10);
            try {
                StaticSequence.Sequence.put(a+b);
            }
            catch (InterruptedException e) {
                break;
            }
        }
    }
}
