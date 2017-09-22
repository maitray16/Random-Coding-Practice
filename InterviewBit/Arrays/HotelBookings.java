// A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K rooms. 
// Bookings contain an arrival date and a departure date. He wants to find out whether there are enough rooms in the hotel to satisfy the demand. Write a program that solves this problem in time O(N log N) .

// Input : 
//         Arrivals :   [1 3 5]
//         Departures : [2 6 8]
//         K : 1

// Return : False / 0 
// This program outputs the minimum number of rooms needed to handle all the guests.

import java.util.*;

class HotelBookings
{

	public static void main(String[] args)
	{
		int[] arr = {1,3,5};
		int[] dept = {2,6,8};

		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		for(int i=0; i<arr.length; i++)
		{
			treeMap.put(arr[i], "ARR");
			treeMap.put(dept[i], "DEPT");
		}

		iterateMap(treeMap);
		
	}
	public static <K, V> void iterateMap(Map<K, V> map) {
		int count = 0;
		int result = -1;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if(entry.getValue() == "ARR")
            {
            	count += 1;
            	if(count > result)
            		result = count;
            }
            if(entry.getValue() == "DEPT")
            {
            	count -= 1;
            	if(count > result)
            		result = count;
            }
        }
 
        System.out.println("Min Rooms needed : " + result);
    }
}