import scala.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        //java中没有真正随机的概念
        Random random = new Random(10);

        for(int i=0;i<10;i++){
            System.out.print(random.nextInt()+" ");
        }
        System.out.println();

        random = new Random(10);
        for(int i=0;i<10;i++){
            System.out.print(random.nextInt()+" ");
        }
        System.out.println();
        //是不是发现上述结果是一致的
        System.out.println("----------------------------------");

        //所以一般随机数是利用时间戳来使用的,如果太快了，可能会一样- -
        random = new Random(System.currentTimeMillis());
        for(int i=0;i<20;i++){
            System.out.print(random.nextInt()+" ");
        }
        System.out.println();

        random = new Random(System.currentTimeMillis());
        for(int i=0;i<20;i++){
            System.out.print(random.nextInt()+" ");
        }
        System.out.println();


    }
}
