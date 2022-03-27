package com.company
import CIE.*;
import SEE,*;
import java.util.Scanner;
public class total
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
CIE.student st[]=new CIE.student[n];
CIE.internal in[]=new CIE.internal[n];
SEE.external ex[]=new SEE.external[n];
for(int i=0;i<n;;i++)
{
st[i]=new CIE.student();
st[i].details();
int[i]=new CIE.internals();
int[i].acceptmark();
ex[i]=new SEE.external();
ex[i].acceptmarks();
}