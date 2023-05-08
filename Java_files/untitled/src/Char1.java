class Casting1
{
    short s = 100;
    byte b;
    //b = s; // Illegal
    b = byte s; // Legal, Narrow Casting, Assign last 8 bits s to b
	System.out.println(s +" " + b); // 100 100

    }
}