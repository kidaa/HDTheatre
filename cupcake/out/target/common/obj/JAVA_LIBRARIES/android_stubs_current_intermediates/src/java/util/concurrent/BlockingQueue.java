package java.util.concurrent;
public interface BlockingQueue<E>
  extends java.util.Queue<E>
{
public abstract  boolean offer(E o);
public abstract  boolean offer(E o, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;
public abstract  E take() throws java.lang.InterruptedException;
public abstract  void put(E o) throws java.lang.InterruptedException;
public abstract  int remainingCapacity();
public abstract  boolean add(E o);
public abstract  int drainTo(java.util.Collection<? super E> c);
public abstract  int drainTo(java.util.Collection<? super E> c, int maxElements);
}
