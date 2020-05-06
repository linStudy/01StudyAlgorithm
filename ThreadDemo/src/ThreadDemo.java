/**
 * @author: songlin
 * @date: 2020-05-06 11:09
 * @desc:
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread window = new MyThread();
        Thread w1 = new Thread(window);
        Thread w2 = new Thread(window);
        Thread w3 = new Thread(window);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }

}
