import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982"); //gives index starting at digit 1
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth year = " + birthDate.substring(startingIndex)); //prints remaining content starting at given index

        System.out.println("month = " +birthDate.substring(3,5)); //prints starting at given index and up to but not including ending index

        //this would be a great solution where a comma needed to be inserted into a given list of numbers
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate using .join = " + newDate);

        //the below version will be horribly inefficient for when we could take advantage of the repetition of the '/' but just to demonstrate...
        // appends a string just like the  "text" + "text" method, but not very efficiently with string literals
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate using .concat = " + newDate);

        //another horrible way would be with method chaining like this
        String badIdea = "really";
        badIdea = badIdea.concat(" really").concat(" bad").concat(" idea");
        System.out.println(badIdea);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","-"));

        System.out.println("ABD\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABD\n".repeat(3).indent(8)); //indents 8 space
        System.out.println("-".repeat(20));

        System.out.println("    ABD\n".repeat(3).indent(-2)); // reduced indent by 2 spaces
        System.out.println("-".repeat(20));
    }
}