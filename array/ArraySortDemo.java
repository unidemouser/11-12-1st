/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author My
 */
public class ArraySortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student arr[];
        int n=10;
        arr= new Student[n];
       
        
        for(int i=0; i<arr.length; i++)
        {
        int a= (int)(Math.random()*n+1);
        arr[i]= new Student("ram"+a,20+a);
        }
        //pritig unsorted name;
        
        System.out.println("unSorted Array");
         
        SortStudent.showStudent(arr);
        
           //pritig sorted name;
           
          // Student sortobj[]=SortStudent.sort(arr);
           
           
           System.out.println("Sorted Array");
        SortStudent.showSortedStudent(arr);
        
        
        
    }
    
}
