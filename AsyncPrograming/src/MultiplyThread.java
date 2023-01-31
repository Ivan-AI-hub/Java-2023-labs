import java.util.Random;

public class MultiplyThread extends Thread
{
    @Override
    public void run()
    {
        Random rn = new Random();
        while (true)
        {
            int a = rn.nextInt();
            int b = rn.nextInt();
            StaticSequence.Sequence.push(a*b);
        }
    }
}
