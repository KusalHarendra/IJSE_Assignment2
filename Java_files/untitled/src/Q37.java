public class Q37 {
    public void main(String args[]){
        int num1 = 10;
        String binaryOf10 = Integer.toBinaryString(num1);
        System.out.println(binaryOf10);

        String octalOf10 = Integer.toOctalString(num1);
        System.out.println(octalOf10);

        String hexOf10 = Integer.toHexString(num1);
        System.out.println(hexOf10);

        int num2 = 16;
        String binaryOf16 = Integer.toBinaryString(num2);
        System.out.println(binaryOf16);

        String octalOf16 = Integer.toOctalString(num2);
        System.out.println(octalOf16);

        String hexOf16 = Integer.toHexString(num2);
        System.out.println(hexOf16);

        int num3 = 128;
        String binaryOf128 = Integer.toBinaryString(num3);
        System.out.println(binaryOf16);

        String octalOf128 = Integer.toOctalString(num3);
        System.out.println(octalOf16);

        String hexOf128 = Integer.toHexString(num3);
        System.out.println(hexOf16);
    }
}
