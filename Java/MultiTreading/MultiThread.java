abstract class ClassE
{
    public abstract void display();
}

class ClassZ extends ClassE implements Runnable
{
    public void display()
    {
        System.out.println("Class Z: Display method");
    }
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Class Z: Welcome!");
            try {
                Thread.sleep(10); // wait for 10 milliseconds before printing the next message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class classA extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Class A: Hi");
            try {
                Thread.sleep(10); // wait for 10 milliseconds before printing the next message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class classB extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Class B: Hello");
            try {
                Thread.sleep(10); // wait for 10 milliseconds before printing the next message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultiThread {
    public static void main(String[] a)
    {
        classA objA = new classA();
        classB objB = new classB();
        //Thread priority - only suggest scheduler to execute thread first, but not guarantee
        //1 - lowest
        //10 - highest
        //5 - default(average)
        System.out.println("Priority of Class A: " + objA.getPriority());
        System.out.println("Priority of Class B: " + objB.getPriority());
        objA.start();
        try {
            Thread.sleep(5); // wait for 5 milliseconds before starting the next thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objB.start();

        ClassZ objZ = new ClassZ();
        //Runnable objz = new ClassZ(); // This is also valid since ClassZ implements Runnable
        Thread threadZ = new Thread(objZ);
        threadZ.start(); // This will run in a separate thread

        Runnable objR = () -> 
        {
                for(int i=0; i<5; i++)
                {
                    System.out.println("Anonymous Runnable: Welcome!");
                    try {
                        Thread.sleep(10); // wait for 10 milliseconds before printing the next message
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Thread threadR = new Thread(objR);
        threadR.start(); // This will run in a separate thread
    }
}
