import java.util.Stack;

class Main {
    public static void main(String[] args) {

        System.out.println ( );

        Stack<String> bcsCharacters = new Stack<>();

        bcsCharacters.push("Jimmy McGill");
        bcsCharacters.push("Chuck McGill");
        bcsCharacters.push("Kim Wexler");
        bcsCharacters.push("Howard Hamlin");
        bcsCharacters.push("Mike Ehrmantraut");
        bcsCharacters.push("Nacho Varga");
        bcsCharacters.push("Gus Fring");
        bcsCharacters.push("Lalo Salamanca");
        bcsCharacters.push("Hector Salamanca");
        bcsCharacters.push("Jesse Pinkman");
        bcsCharacters.push("Walter White");

        //prints out all items in the stack
        System.out.println (bcsCharacters);
        System.out.println ( );

        //returns the number of objects in the stack
        System.out.println (bcsCharacters.size());
        System.out.println ( );

        //searches for a specific element by distance from the top of the stack
        System.out.println (bcsCharacters.search("Nacho Varga"));
        System.out.println ( );

        //Looks at the object at the top of the stack and removes it
        System.out.println (bcsCharacters.peek());
        System.out.println ( );
        
        //removes the object from the top of the stack and returns it
        System.out.println (bcsCharacters.pop());
        System.out.println ( );

        //empty() tests if the stack is empty and returns it true if it is
        while(!bcsCharacters.empty()) {
            System.out.println (bcsCharacters.pop() );
        }
        System.out.println ( );

        System.out.println (bcsCharacters);
        System.out.println ( );

    }
}