import java.util.*;
import java.io.*;
 class Rational

{
  private int numenator;
  private int denominator;

 public Rational()
 {
   numenator=denominator=0;
 }
 public Rational(int numenator,int denominator)
 {
   this.numenator=numenator;
   this.denominator=denominator;
 }
 public Rational(Rational rn)
 {
    numenator=rn.numenator;
    denominator=rn.denominator;
 }

 public void read()
 {
  Scanner sc=new Scanner(System.in);
  int numenator=sc.nextInt();
  int denominator=sc.nextInt();
 }
 public void show()
 {
   System.out.println("The Rational Number is :" +numenator+"/"+denominator);
 }
}

class Program
{
 public static void main(String []args)
 {
  Rational r=new Rational();
  r.show();
  Rational r1=new Rational(8,13);
  r1.show();
  Rational r2=new Rational(r1);
   r2.show();
  
 
 }
}
