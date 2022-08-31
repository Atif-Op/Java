package com.java.java_lesson;


interface Test{
   //void get();
    int sum(int input1 ,int input2);
}
public class LamdaExpression {

   public static void main(String args[]) throws Exception {

       //Lambda experssion by passing parameters....
//       Test t=(int input1 ,int input2)->
//               System.out.println(input1+input2);s
//      t.sum(10,20);


       //return using lamda expression....

       Test t=(int input1 ,int input2)-> input1+input2;    //no need to write return keyword
       System.out.println(t.sum(10,20));
       if(10<20){
           throw new RuntimeException("True");
       }


   }


}
