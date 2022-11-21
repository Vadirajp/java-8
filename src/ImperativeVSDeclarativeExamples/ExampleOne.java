package ImperativeVSDeclarativeExamples;

import java.util.stream.IntStream;

public class ExampleOne {

    //Print sum of 100 numbers from 0 to 100
    public static void main(String[] args) {

        /**
         * Imperative Way - how style of programming
         */

        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum using Imperative approach : " + sum);


        /**
         * Declarative Way - what style of programming
         */
        int sum1 = IntStream.rangeClosed(0,100)
                .sum();//include 100 value also
        System.out.println("sum using Declarative approach : " + sum1);
    }


}
