//Demonstrate the use of command-line arguments (String[], runtime input)
class RuntimeInput{
    public static void main(String[] args) {

        String name = args[0];              
        int marks = Integer.parseInt(args[1]); 

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
