/*Find itinerary from ticket
Given: Chennai -> Bangalore,Mumbai->Delhi,Goa->Chennai,Delhi->Goa
Approach map: from,to
*/

package Hashing;
import java.util.*;
public class QsMap {
    public static String getStartpoint(HashMap <String, String> tickets) {
        HashMap<String,String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key); // Reverse the mapping
        }
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Found the starting point
            }
        }
        return null; // No starting point found
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String startPoint = getStartpoint(tickets);
        if (startPoint != null) {
            System.out.println("Starting point: " + startPoint);
            // To print the itinerary
            String currentLocation = startPoint;//store startingpt as current location in the start
            System.out.print("Itinerary: [ " + currentLocation);
            //while current location is present in the tickets, update current location to the next destination and print it
            while (tickets.containsKey(currentLocation)) {
                currentLocation = tickets.get(currentLocation);
                System.out.print(" -> " + currentLocation);
            }
            System.out.println(" ]");
        } else {
            System.out.println("No starting point found.");
        }
    }
    
}
