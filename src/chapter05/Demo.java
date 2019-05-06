package chapter05;

/**
 * ÃèÊö:
 *
 * @author junxi.chen
 * @create 2019-04-18 22:07
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));


        System.out.println(9 & 0x0000FFFF);
        System.out.println(9 >>> 16);
        System.out.println(9 + 1);
        System.out.println(9 + (1 << 16));
        System.out.println(1 << 16);
        System.out.println(65545 >>> 16);
        System.out.println(0x0000FFFF);
        System.out.println(0x00010000);

        System.out.println(65545 & 0x0000FFFF);
        System.out.println(0x00000011);
        System.out.println(9 & (1 << 16) - 1);
    }
}
