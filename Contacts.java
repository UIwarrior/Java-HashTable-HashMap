import java.util.*;
import java.util.Hashtable; //import the Hashtable API.
class Contacts {
    public static void main(String args[]) {
        Hashtable<String, Integer> contacts = new Hashtable<String, Integer>();
        /*
        Hashtable API
         the put function adds value to the hash table.
        */
        contacts.put("Ross", 24434);
        contacts.put("Rachel", 24244);
        contacts.put("Chandler", 12444);
        contacts.put("Monica", 13144);
        //to check if any key is contained in the hash table.
        System.out.println(contacts.containsKey("Chandler")); //returns a bool value.
        //Let's search for some names in this phone book.
        System.out.println(contacts.get("Chandler"));
        //the get function gets the value of the key sent in the function.
        Set<String> keys = contacts.keySet(); //to get all the keys present in the hash table.
        for (String key : keys) {
            System.out.println("Number of " + key + " is: " + contacts.get(key));
        }
        // to remove an entry from the hash table.
        contacts.remove("Chandler");
        System.out.println(contacts.containsKey("Chandler"));
        //to check if the key has been removed.
        contacts.clear(); //to clear the hashtable completely.
    }
}
