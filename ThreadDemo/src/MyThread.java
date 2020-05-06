/**
 * @author: songlin
 * @date: 2020-05-06 11:10
 * @desc:
 */
public class MyThread  implements  Runnable{

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){

            synchronized (obj){
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：出票,票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
