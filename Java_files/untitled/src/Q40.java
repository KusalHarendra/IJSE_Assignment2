class Q40 {
    public static void main(String args[]) {
        byte b1 = 10, b2 = 20, b3;
        b3 = b1 + b2; //Line 1
        b3 = b1 + 1; //Line 2
        b3 = b1 * 2; //Line 3
        short s1 = 10, s2 = 20, s3;
        s3 = s1 + s2; //Line 4
        s3 = s1 + 1; //Line 5
        s3 = s * 1; //Line 6
        int x1 = 10, x2 = 20, x3;
        x3 = x1 + x2; //Line 7
        x3 = b1 + b2; //Line 8
        x3 = b1 + 1; //Line 9
        x3 = b1 * 2; //Line 10
        x3 = s1 + s2; //Line 11
        x3 = s1 + 1; //Line 12
        x3 = s1 * 1; //Line 13
    }
}