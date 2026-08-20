package day4;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++){
            System.out.println(
                    "Downloading file.... " + (i * 20) + "%"
            );
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)

        {
            System.out.println(e);
        }
        System.out.println("Download Compleated");
    }
}
public class DownloadThread06

{
    public static void main(String[]args)
    {
        MyThread d = new MyThread();
        d.start();
    }
}