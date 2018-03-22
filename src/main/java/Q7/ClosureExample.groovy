package Q7;

import groovy.lang.Closure



public class ClosureExample {
    public static void main(String[] args) {


        List<Integer> list=[1,3,5,6]
        /*Closure check={val->
            printf " ${val}"
        }
*/



        /*list.eachWithIndex{ int entry, int i ->
            printf "${entry} :"
            printf "${i} \n"
        }*/


        Closure closure={java.util.List list1 ,x->
            printf "${list1.contains(x)}"
        }

                closure(list,5)
       // list.each {printf "${it}"}



    }
}
