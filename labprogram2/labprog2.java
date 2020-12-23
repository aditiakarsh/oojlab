import java.util.*;
class Student {
 private String usn;
 private String name;
 private int n;
    private int credits[] = new int[n];
 private int marks[] = new int[n];


 void accept()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter student details");
  System.out.println("USN:");
  usn=s.nextLine();
  System.out.println("Name:");
  name=s.nextLine();
  System.out.println("Enter the number of subjects:");
  n=s.nextInt();
  System.out.println("Enter credits and marks attained by the student in each subject");
  for(int i=0;i<n;i++)
  {
   credits[i]=s.nextInt();
   marks[i]=s.nextInt();
  }
 }
 void display()
 {
  System.out.println("Student details:");
  System.out.println("USN:"+usn);
  System.out.println("Name:"+name);
  System.out.println("Marks in each subject:");
  for(int i=0;i<n;i++)
  {
   System.out.println("Subject "+(i+1)+":"+marks[i]);
  }
 }
 double calc()
 {
  int tcp=0,tc=0;
  for(int i=0;i<n;i++)
  {
   tc=tc+credits[i];
   if(marks[i]>=40)
   {
   tcp=tcp+(((marks[i]/10)+1)*credits[i]);
   }
  }
  return (double)tcp/tc;
 }
}
 class Main
 {
  
 public static void main(String args[]) {
  Student s1=new Student();
  s1.accept();
  s1.display();
  System.out.println("SGPA: "+s1.calc());
 }
}
