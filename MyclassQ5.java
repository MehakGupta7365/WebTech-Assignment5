//Mehak 19105098
/*Question 5. What is the output of the following snippet code?

public class Myclass
{
final static int x;

static {
x = 10;
}
public static void main(String[]
args) {
System.out.println(x);
}
} */

//ANSWER->>>>
//Output is 10 as we set the value of x in static block which is run at the starting once.
public class MyclassQ5
{
final static int x;

static {
x = 10;
}
public static void main(String[]
args) {
System.out.println(x);
}
}
