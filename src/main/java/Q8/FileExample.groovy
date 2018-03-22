package Q8

class FileExample {
    public static void main(String[] args) {
       File f1= new File("/home/ankit/Documents/files/file1.txt")
       File f2= new File("/home/ankit/Documents/files/file2.txt")
       File f3= new File("/home/ankit/Documents/files/result.txt")

        f3.text=""
  //1st way
        /*f3.append(f1.text)
        f3.append(f2.text)
*/

        //2nd way
        f3<< f1.text
        f3<< f2.text

        f3.eachLine {line->printf line}


    }
}
