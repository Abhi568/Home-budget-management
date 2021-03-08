/*
Expense means name of things(ex. outing ,tax,party,movie)
actual means how much money you have epended (ex, at outing i expended 500);
expected means how much money you assumed for spending(ex, 450);
diff ,calculate your profit of each and every expense(eg,450-500 (expected-actual),here loss of 50 )
*/


import java.util.*;
import java.lang.*;
import java.util.ArrayList;

interface x
{
void print();
}
class Myexception extends Throwable
{
public Myexception(int i)
{
System.out.println("ERROR!!!!...you have entered the length." +i +": that is not acceptable");
}
}
class home_budget
{
public void show(int n1) throws Myexception
{
if(n1==0)
{
throw new Myexception(n1);
}
else
{
ArrayList <String> Expenses= new ArrayList<String>();
ArrayList <Integer> Expected = new ArrayList<Integer>();
ArrayList <Integer> Actual = new ArrayList<Integer>();
ArrayList <Integer> diffe = new ArrayList<Integer>();
Scanner s=new Scanner(System.in);
for (int i=0;i<n1;i++)
{
System.out.println("Make your budget");
System.out.println("Enter your expenes:");
String E=s.next();
Expenses.add(E);
System.out.print("Enter the actual price for "+E+" which you had expended :");
int A=s.nextInt();
Actual.add(A);
System.out.print("Enter the Expected price for "+E+" which you had expended :");
int E1=s.nextInt();
Expected.add(E1);
int diff=E1-A;
diffe.add(diff);
}
int sum=0;
for (int i=0;i<diffe.size();i++)
{
sum=sum+diffe.get(i);
}
System.out.println("YOUR BUDGET TABLE IS");
System.out.println("Expenses  "+"\t"+"Actual  "+"\t" +"Expected"+"\t"+" Diff");
for (int j=0;j<n1;j++)
{
System.out.println(Expenses.get(j)+"\t\t"+Actual.get(j)+"\t\t"+Expected.get(j)+"\t\t "+diffe.get(j)+"\t");
}
System.out.println("If u want to add press 2 , for delete any Expenses press 1, for update press 0,for exit press any other key");
int enter=s.nextInt();
switch(enter)
{
case 2:
add_expenses(Expenses,Actual,Expected,diffe);
break;
case 1:
del_expenses(Expenses,Actual,Expected,diffe);
break;
case 0:
update_expenses(Expenses,Actual,Expected,diffe);
break;
default:
System.out.println("U entered wrong");
if (sum==0)
{
System.out.println("You have'nt saved any rupee in this month: "+sum+" RS");
}
else if(sum>0)
{System.out.println("You saved a handsome amount of mony this month: "+sum+" RS");
}
else
{System.out.println("You spended Rs out of buget :"+sum+" RS");
}
}
}
}
void add_expenses(ArrayList <String>Expenses1,ArrayList<Integer>Actual1,ArrayList<Integer>Expected1,ArrayList <Integer>diffe1)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your expenes:");
String E=s.next();
Expenses1.add(E);
System.out.print("Enter the actual price for "+E+" which you had expended :");
int A=s.nextInt();
Actual1.add(A);
System.out.print("Enter the Expected price for "+E+" which you had expended :");
int E1=s.nextInt();
Expected1.add(E1);
int diff=A-E1;
diffe1.add(diff);
int sum=0;
for (int i=0;i<diffe1.size();i++)
{
sum=sum+diffe1.get(i);
}
System.out.println("If u wany to view your budget press 1 otherwise 0");
int n=s.nextInt();
if (n==1)
{
System.out.println("YOUR BUDGET TABLE IS");
System.out.println("Expenses  "+"\t"+"Actual  "+"\t" +"Expected"+"\t"+" Diff");
for (int j=0;j<Expected1.size();j++)
{
System.out.println(Expenses1.get(j)+"\t\t"+Actual1.get(j)+"\t\t"+Expected1.get(j)+"\t\t "+diffe1.get(j)+"\t\t");
}
if (sum==0)
{
System.out.println("You have'nt saved any rupee in this month: "+sum+" RS");
}
else if(sum>0)
{System.out.println("you saved a handsome amount of mony this month: "+sum+" RS");
}
else
{System.out.println("You spended Rs out of buget :"+sum+" RS");
}
}
}
void del_expenses(ArrayList <String>Expenses1,ArrayList<Integer>Actual1,ArrayList<Integer>Expected1,ArrayList <Integer>diffe1)
{
System.out.println("Enter you Expense name whic u want to delete ");
Scanner s1=new Scanner(System.in);
String ss=s1.next();
int sum=0;

if (true==Expenses1.contains(ss))
{
int pos=Expenses1.indexOf(ss);
if (pos<=Expected1.size())
{
Actual1.remove(pos);
Expected1.remove(pos);
diffe1.remove(pos);
for (int i=0;i<diffe1.size();i++)
{
sum=sum+diffe1.get(i);
}
System.out.println("If u wany to view your budget press 1 otherwise 0");
int n=s1.nextInt();
if (n==1)
{
System.out.println("YOUR BUDGET TABLE IS");
System.out.println("Expenses  "+"\t"+"Actual  "+"\t" +"Expected"+"\t"+" Diff");
for (int j=0;j<Expected1.size();j++)
{
System.out.println(Expenses1.get(j)+"\t\t"+Actual1.get(j)+"\t\t"+Expected1.get(j)+"\t\t "+diffe1.get(j)+"\t");
}
if (sum==0)
{
System.out.println("You have'nt saved any rupee in this month: "+sum+" RS");
}
else if(sum>0)
{System.out.println("You saved a handsome amount of mony this month: "+sum+" RS");
}
else
{System.out.println("You spended Rs out of buget :"+sum+" RS");
}
}
}
}
else
{
System.out.println();
System.out.println("----You entered wrong ,Next time Please! try to  Enter correct Expense Name----");
}
if (Expected1.size()==0)
{
System.out.println("***************************NULL bUDGET,please enter some details of your budget***********************");
}
}
void update_expenses(ArrayList <String>Expenses1,ArrayList<Integer>Actual1,ArrayList<Integer>Expected1,ArrayList <Integer>diffe1)
{
int sum=0;
System.out.println("Enter you Expense name :");
Scanner s1=new Scanner(System.in);
String ss=s1.next();
if (true==Expenses1.contains(ss))
{
int pos=Expenses1.indexOf(ss);
System.out.println("If you want to update Expense name Enter 1 ,for actual price Enter 2 ,For Expected enter 3 ,For changing both press 4,if don;t make any changes press any other key! :");
int enter=s1.nextInt();
switch(enter)
{
case 1:
System.out.println("Enter you new Expense name:");
String ss1=s1.next();
Expenses1.set(pos,ss1);
break;
case 2:
System.out.println("Enter your new  Actual Expense price:");
int act=s1.nextInt();
Actual1.set(pos,act);
int diff=Expected1.get(pos)-Actual1.get(pos);
diffe1.set(pos,diff);
break;
case 3:
System.out.println("Enter your new Expected Expense price:");
int exp=s1.nextInt();
Expected1.set(pos,exp);
int diff1=Expected1.get(pos)-Actual1.get(pos);
diffe1.set(pos,diff1);
break;
case 4:
System.out.println("Enter your new  Actual Expense price:");
int act1=s1.nextInt();
Actual1.set(pos,act1);
System.out.println("Enter your new Expected Expense price:");
int exp1=s1.nextInt();
Expected1.set(pos,exp1);
int diff2=Expected1.get(pos)-Actual1.get(pos);
diffe1.set(pos,diff2);
break;
default:
System.out.println("You have'nt made any changes");
}
}
else
{
System.out.println();
System.out.println("----You entered wrong ,Next time Please! try to  Enter correct Expense Name----");
}
for (int i=0;i<diffe1.size();i++)
{
sum=sum+diffe1.get(i);
}
System.out.println("If u wany to view your budget press 1 otherwise 0");
int n=s1.nextInt();
if (n==1)
{
System.out.println("YOUR BUDGET TABLE IS");
System.out.println("Expenses  "+"\t"+"Actual  "+"\t" +"Expected"+"\t"+" Diff");
for (int j=0;j<Expected1.size();j++)
{
System.out.println(Expenses1.get(j)+"\t\t"+Actual1.get(j)+"\t\t"+Expected1.get(j)+"\t\t "+diffe1.get(j)+"\t");
}
}
if (sum==0)
{
System.out.println("You have'nt saved any rupee in this month: "+sum+" RS");
}
else if(sum>0)
{System.out.println("You saved a handsome amount of mony this month: "+sum+" RS");
}
else
{System.out.println("You spended Rs out of buget :"+sum+" RS");
}
}
void show()
{
System.out.println();
System.out.println("************************************You have successful made your Home Budget***************************************");
}

public static void main(String args[])
{

System.out.println("***********************************************Start making ur HOME BUDGET*********************************************");

System.out.println("HOw many of no of expenses U want to enter");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
home_budget obj=new home_budget();
try
{
obj.show(n);
obj.show();
}
catch(Throwable e)
{
System.out.println("catched exception is "+e);
}

}
}
