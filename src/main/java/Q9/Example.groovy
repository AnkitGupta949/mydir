package Q9

class Example {
    public static void main(String[] args) {
        File f1 = new File("/home/ankit/Documents/files/file1.txt")
        File f3 = new File("/home/ankit/Documents/files/result.txt")

        int i = 0


        f3.text = ""
        /*f3.append(f1.eachLine {line->
            line+"ghgg"

        })
*/

        Closure c = { line ->
            if (i % 2 == 0) {
                int x=i;
                x++;
                f3.append(x+" : "+line+ "\n")
            }
            i++;

        }

        f1.eachLine(c)
    }
}
