import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class StaticSequence
{
    public static SynchronousQueue<Integer> Sequence;
    static
    {
        Sequence = new SynchronousQueue();
    }
}
