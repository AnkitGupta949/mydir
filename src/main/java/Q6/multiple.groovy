package Q6;

public class multiple {
    public static void main(String[] args) {
        int i=0
        10.times {
            i=i+3
            printf "${i} "
        }

        println()

        10.times {
            printf "${(it + 1) * 3} "
        }

                println()
        Closure c={num->num*3}
        for (int j in 1..10){
           printf "${c(j)} "
        }


    }
}
