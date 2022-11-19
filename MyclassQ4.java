//Mehak 19105098
/*
 Question 4. Will the following code snippet compile fine? If yes, what will be the output of
the following program?

public class Myclass {
static int a = 20;
Myclass() {
a++;
}
Void m1() {
a++;
System.out.println(a):
}
public static void main(String[]
args)
{
Myclass obj = new Myclass();
Myclass obj2 = new Myclass();
Myclass obj3 = new Myclass();
obj3.m1();
}
}
 */




//ANSWER------->>
// There were two errors. colon to be replace by semi-colon (:->;) and V of Void was capita (Void -> void). Output is 24
public class MyclassQ4 {
    static int a = 20;
    MyclassQ4() {
    a++;
    }
    void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    MyclassQ4 obj = new MyclassQ4();
    MyclassQ4 obj2 = new MyclassQ4();
    MyclassQ4 obj3 = new MyclassQ4();
    obj3.m1();
    }
    }

