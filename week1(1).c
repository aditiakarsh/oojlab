#include <stdio.h>
void main() {
  int num1,num2,opt,flag=11;
  char answer;
  do{
  printf("1-Addition.\n2-Substraction.\n3-Multiplication.\n4-Division.\n5-Greater.\n6-Smaller.\n7-Equality.\n8-Greater than or Equal.\n9-Square.\n10-Cube\n");
  printf("\nInput your option :\n");
  scanf("%d",&opt);
  printf("Enter the first Integer :");
  scanf("%d",&num1);
  printf("Enter the second Integer :");
  scanf("%d",&num2);

       
    switch(opt) 
    {
      case 1:
        printf("The Addition of  %d and %d is: %d\n",num1,num2,num1+num2);
        break;
        
      case 2:
        printf("The Substraction of %d  and %d is: %d\n",num1,num2,num1-num2);
        break;
        
      case 3:
        printf("The Multiplication of %d  and %d is: %d\n",num1,num2,num1*num2);
        break;  
      
      case 4:
        if(num2==0) {
          printf("The second integer is zero. Devide by zero.\n");
        } else {
          printf("The Division of %d  and %d is : %d\n",num1,num2,num1/num2);
        }  
        break;
        
      case 5: 
      if (num1>num2){
      printf("The Greater number is %d",num1);
      }
      else {printf("The Greater number is %d",num2);}
        break; 
        
     case 6:
     if (num1<num2){
      printf("The Smaller number is %d",num1);
      }
      else {printf("The Smaller number is %d",num2);}
        break; 
        
     case 7:
     
     if (num1==num2)
     {
     printf("The numbers are Equal");
         
     }
     else
     {
     printf("The numbers are not Equal");
     }
     break;
  
     case 8:
     if(num1>=num2)
     {
     printf("The Number %d is greater  than or equal to %d",num1,num2);
     } 
     else    
     {
         printf("The Number %d is greater  than or equal to %d",num2,num1);
         
     }
     break;
     case 9:
      
       printf("The Square of %d is %d\n",num1,num1*num1);
       printf("The Square of %d is %d\n",num2,num2*num2);
       break;
    
     case 10:
       printf("The Cube of %d is %d\n",num1,num1*num1*num1);
       printf("The Cube of %d is %d\n",num2,num2*num2*num2);
       break;
       
       
      default:
        printf("Option not available\n");
        break; 
    
    }
  
     printf("Press Y to continue.\n");
     scanf(" %c",&answer); 
  }
  while(answer == 'y' || answer == 'Y');
   
    
}
