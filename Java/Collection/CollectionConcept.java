import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class CollectionConcept {

    public static void main(String a[])
    {
        System.out.println("Collection Example:");
        //Collection is interface and arraylist is a class implements Collection interface.
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(10); //10 is stored as object type if collection<Integer> was not used.
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);   

        for(Integer n: nums)
        {
            System.out.println(n + 2);
        }

        System.out.println("List Example:");
        //If you want to work with index use list
        //List is also an interface and arraylist is a class implements List interface.
        List<Integer> numList = new ArrayList<Integer>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        System.out.println(numList.get(2)); //30

        System.out.println("Set Example:");
        //If you want unique values use set
        //Set is also an interface and HashSet is a class implements Set interface.
        //it does not have index values

        Set<Integer> numset = new HashSet<Integer>();
        numset.add(10);
        numset.add(20);
        numset.add(30);
        numset.add(40);
        System.out.println(numset);

        //TreeSet is also a class implements Set interface and it stores unique values in sorted order.

        Set<Integer> numTreeset = new TreeSet<Integer>();
        numTreeset.add(40);
        numTreeset.add(30);
        numTreeset.add(50);
        numTreeset.add(10);
        System.out.println(numTreeset);

        //Iterator is parent class of collection.
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }


        //Map does not extend collection interface but it is part of collection API/Framework.
        //Map - it stores data in key value pair.
        //Map is an interface and HashMap is a class implements Map interface.
        //TreeMap is also a class implements Map interface and it stores data in sorted order based on keys.
        System.out.println("Map Example:");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");

        System.out.println(map); //{1=One, 2=Two, 3=Three}
        System.out.println(map.get(2)); //Two
        System.out.println(map.containsKey(3)); //true
        System.out.println(map.containsValue("Four")); //false
        System.out.println(map.size()); //3
        System.out.println(map.isEmpty()); //false
        System.out.println(map.keySet()); //[1, 2, 3]
        System.out.println(map.values()); //[One, Two, Three]

       //map[4] = "Four"; // This is not valid, use put.

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");

        System.out.println(treeMap); //{1=One, 2=Two, 3=Three}

        //Sorting of collection

        List<Integer> numList2 = new ArrayList<>();
        numList2.add(40);
        numList2.add(10);
        numList2.add(30);
        numList2.add(20);
        System.out.println(numList2); //[40, 10, 30, 20]

        //Collections class provides static methods for sorting and searching of collection.
        Collections.sort(numList2);
        
        System.out.println(numList2); //[10, 20, 30, 40

        //Hashtable is a syncronised version of HashMap and it does not allow null key and null value.
        //HashMap allows one null key and multiple null values.
        //Hashtable is Multi-Threading safe
        Map<Integer, String> hashtable1 = new Hashtable<>();
        hashtable1.put(1, "One");
        hashtable1.put(2, "Two");
        //hashtable1.put(null, "Three"); // This will throw NullPointerException
        //hashtable1.put(3, null); // This will throw NullPointerException
        System.out.println(hashtable1); //{1=One, 2=Two}


    }
    
}
