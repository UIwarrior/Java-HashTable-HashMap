import java.util.*;

/*

While registering on a website, a person needs to enter his/her email ID, after which the website will check for duplicate entries.
In other words, it will check to see if the ID has been registered previously by another user.
You are assigned the task of checking whether a particular email ID that comes in for registration already exists or not.
You are given an array of emails that are already registered with the website:
[“chandler.bing@xyz.com”, “ross.geller@xyz.com”, “rachel.greene@xyz.com”, “joey.tribbiani@xyz.com”, “monica.geller@xyz.com”, “phoebe.buffay@xyz.com”,
“sheldon.copper@xyz.com”, “marie.george@xyz.com”].

A new entry called monica.geller@xyz.com comes in. Write a code that checks whether this ID is already registered or not.
If it is, return the number at which it was added into the hash table; if it is not found in the hash table, return false.
 */


class MatchingEmail {
    public static void main(String[] args)
    {
        Hashtable<String,Integer> emails= new Hashtable<String,Integer>();
        emails.put("chandler.bing@xyz.com",1);
        emails.put("ross.geller@xyz.com",2);
        emails.put("rachel.greene@xyz.com",3);
        emails.put("joey.tribbiani@xyz.com",4);
        emails.put("monica.geller@xyz.com",5);
        emails.put("phoebe.buffay@xyz.com",6);
        emails.put("sheldon.copper@xyz.com",7);
        emails.put("marie.george@xyz.com",8);

        String NewEmail = "monica.geller@xyz.com";

        if(emails.containsKey(NewEmail))
        {
            //Complete here
        }
        else System.out.println("False");
    }
}
