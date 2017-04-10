/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class SortStudent {
    
   static  Student[] sort(Student arr[],String fieldName)
    {
        
        if(fieldName.equalsIgnoreCase("NAME"))
        
        {
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                
                Student temp;
                
                if(arr[i].getName().compareToIgnoreCase(arr[j].getName())>0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        }
       
        
        else if(fieldName.equalsIgnoreCase("AGE"))
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                
               Student temp;
                
                if(arr[i].getAge()>arr[j].getAge())
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        
        return arr; 
        
    }
    
   
   static void showStudent(Student arr[])
   {
            for(Student obj:arr)
        {
            System.out.println(obj.getName()+"- "+obj.getAge());
        }
       
   }
   
   
   
   static void showSortedStudent(Student arr[])
   {
            for(Student obj:SortStudent.sort(arr,"AGE"))
        {
            System.out.println(obj.getName()+"- "+obj.getAge());
        }
       
   }
   
    
}
