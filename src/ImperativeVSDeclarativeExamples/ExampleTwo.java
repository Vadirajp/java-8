package ImperativeVSDeclarativeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTwo {

    //Remove duplicates from List of Integers
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(1,2,3,3,4,5,6,7,8,8,9,10);

        /**
         * Imperative approach
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer integer : integersList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println(uniqueList);

        /**
         * Declarative approach
         */
        List<Integer> uniqueList1 = integersList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList1);
    }
}
