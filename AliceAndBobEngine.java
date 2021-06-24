/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:05 PM
 */
public class AliceAndBobEngine {
    /**
     * return `true` if the input value is "Alice"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice"
     */
    public Boolean isAlice(String input) {
        if ("Alice".equals(input)) {
            return true;
            
            
                };
        return false; 
       };
    /**
     * return `true` if the input value is "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Bob"
     */
    public Boolean isBob(String input) {
       
        if ("Bob".equals(input)) {
        
        return true;
        
        };
        return false;
    }

    /**
     * return `true` if the input value is "Alice" or "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice" or "Bob"
     */
    public Boolean isAliceOrBob(String input) {
        if ("Alice".equals(input)) {
        return true;
        } else if ("Bob".equals(input)) {
            return true;
        };
        return false;
    }

    /**
     * if the input value is "Alice" or "Bob", then
     *      return "Hello PERSONSNAME!",
     * otherwise
     *      return "Begone, PERSONNAME! You're a stranger!",
     * where `PERSONNAME` is replaced with the person's name respectively.
     *
     * @param input - this value is variable: it has the potential to be many things
     * @return respective String value
     */
    public String getGreeting(String input) {
        if ("Alice".equals(input)) {
            return "Hello, Alice!";
        } else if ("Bob".equals(input)) {
            return "Hello, Bob!";
        } else {
            return "Begone, " + input + "! " + "You're a stranger!";
        }
        
    }
}
