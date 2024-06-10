/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
 class Multhread extends Thread {
public void run(){
     for (int i=1;i<5;i++){
         try{
             Thread.sleep(1000);
         } 
         catch(InterruptedException e){
         System.out.println(e);
     }
         System.out.println(i);
         }
     }
public static void main(String args[]){
    Multhread t1=new Multhread();
    Multhread t2 =new Multhread();
    t1.start();
    t2.start();
}
 }    

