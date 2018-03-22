package Q5

class TrueFalseInIF {
    public static void main(String[] args) {

       // String test="Test" //true
        //String test='null'  //true

       // String test=null; //false
        // int test=100   //true
       // int test =0  //false
       // int test =-10  //true
       // List<Integer> test=[]; //false
       List<Integer> test=[null,null,null]  //true

        if(test){
           printf "true"
        }
        else{
            printf "false"
        }
    }
}
