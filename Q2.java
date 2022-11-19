//Mehak 19105098

/*All the banks operating in India are controlled by RBI. RBI has set a well
defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum
withdrawal limit etc) which all banks must follow. For example, suppose RBI has set
minimum interest rate applicable to a saving bank account to be 4% annually; however,
banks are free to use 4% interest rate or to set any rates above it.

Write a program to implement bank functionality in the above scenario. Note: Create few
classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI,
PNB etc). Assume and implement required memonthlyBalanceer variables and functions in each class. */



import java.util.Scanner;

  class Account{

      String accType,branchType;

  }
  class Customer{

    String name,address;

    int age;

  }

  class RBI{ 

      int withLimit,n;

      double A,P,r;

      float t;

      long average,total,monthlyBalance;

     

      int setWithdrawalLimit() {

          Scanner input = new Scanner(System.in);

          String actype=input.nextLine();

          String brtype=input.nextLine();

          if(actype=="SAVINGS" && brtype=="METRO") {

              withLimit = 10000;

          }else {

              withLimit = 5000;

          }
          input.close();

      return withLimit;

      }

     

      double setInterestRate() {

          A=(P+r)/n*t;

          return A;

      }

     

      long setMAB() {

          monthlyBalance=(average+total)/31;

          return monthlyBalance;

      }

  }

 

  class HDFC extends RBI{ // Children class1

      double setInterestRate() {

          A=P*(1+r/n)+n*t;

          return A;

      }

      long setMAB() {

          monthlyBalance=(average+total)/30;

          return monthlyBalance;


      }
  }

 

  class HSBC extends RBI{ // Children class2

      double setInterestRate() {

          A=(P*r)/n+t;

          return A;

      }

     

      int setWithdrawalLimit() {

          withLimit=7000;

          return withLimit;

      }

  }

public class Q2 { //Testing the code

public static void main(String args[]) {

HDFC hdfc = new HDFC();

HSBC hbsc = new HSBC();

hdfc.P=10.433;

hdfc.r=7.42;

hdfc.n=5;

hdfc.t=7;

Double hdfcInt=hdfc.setInterestRate();

System.out.println("HDFC interest rate is:"+hdfcInt);

int hbscWL= hbsc.setWithdrawalLimit();

System.out.println("HSBC withdraw limit is:"+hbscWL);

}

}