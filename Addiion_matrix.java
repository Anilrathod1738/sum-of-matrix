import java.util.*;
class Addiion_matrix
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner(System.in);
    int row,col;
 
 int[][] a=new int[3][3];
 int[][] b=new int[3][3];
 int[][] c=new int[3][3];

 System.out.println("Enter first matrix elements");
 
 for(row=0;row<3;row++)
  {
   for(col=0;col<3;col++)
    
      a[row][col]=sc.nextInt();
      }


 System.out.println("Enter second matrix elements");
 
 for(row=0;row<3;row++)
  {
   for(col=0;col<3;col++)
    
      b[row][col]=sc.nextInt();
      }
      
 
  for(row=0;row<3;row++)
  {
   for(col=0;col<3;col++)
    
      c[row][col]=a[row][col]+b[row][col];
      }
         System.out.println(" first matrix elements");
 
        for(row=0;row<3;row++)
         {
          for(col=0;col<3;col++)
    
        System.out.print(a[row][col]+" ");
        System.out.println();
      }
      System.out.println(" second matrix elements");
 
        for(row=0;row<3;row++)
         {
          for(col=0;col<3;col++)
    
        System.out.print(b[row][col]+" ");
        System.out.println();
      }
 
         System.out.println(" sum of  matrix elements");
 
        for(row=0;row<3;row++)
         {
          for(col=0;col<3;col++)
    
        System.out.print(c[row][col]+" ");
        System.out.println();
      }
   }
}
 
