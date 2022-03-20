package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "i am a");
        map.put("b", "i am b");
        map.put("c", "i am c");
        map.put("d", "i am d");

        Map<String, String> expected = new HashMap<>();
        expected.put("d", "i am d");
        expected.put("a", "i am a");
        expected.put("b", "i am b");
        expected.put("c", "i am c");

        //Test equal, ignore order
        assertThat(map, is(expected));

        //Test Size
        assertThat(map.size(), is(4));

        //test get map
        expected.get("a");
        assertThat("i am a", is("i am a"));

        //Test delete entry
        map.remove("a");
        assertThat(map.size(), is(3));

        //test map clear
        map.clear();
        assertThat(map.size(), is(0));
    }

    @org.junit.Test
    public void testHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("i am a");
        set.add("i am b");
        set.add("i am c");
        set.add("i am d");

        HashSet<String> expected = new HashSet<>();
        expected.add("i am d");
        expected.add("i am a");
        expected.add("i am b");
        expected.add("i am c");

        //Test equal, ignore order
        assertThat(set, is(expected));

        //Test Size
        assertThat(set.size(), is(4));

        //test duplicate value
        expected.add("i am a");
        assertThat(set.size(), is(4));

        //test get map
        assertTrue(expected.contains("i am a"));


        //Test delete entry
        set.remove("i am a");
        assertThat(set.size(), is(3));

        //test map clear
        set.clear();
        assertThat(set.size(), is(0));
    }

    @org.junit.Test
    public void testVector(){
        Vector<Integer> expected = new Vector<>();

        //adding to vector
        expected.add(5);
        expected.add(6);
        expected.add(8);
        expected.add(90);
        expected.add(23);
        System.out.println(expected);

        //testing size
        assertThat(expected.size(), is(5));

        //testing remove
        expected.remove(4);
        assertThat(expected.size(), is(4));

        //test iterator
        expected.iterator().next();
        System.out.println(expected);

        //test clear
        expected.clear();
        assertThat(expected.size(), is(0));
    }

    @org.junit.Test
    public void testArrayList(){
        Vector<Integer> expected = new Vector<>();

        //adding to vector
        expected.add(59);
        expected.add(6);
        expected.add(45);
        expected.add(90);
        expected.add(23);
        System.out.println(expected);

        //testing size
        assertThat(expected.size(), is(5));

        //testing remove
        expected.remove(4);
        assertThat(expected.size(), is(4));

        //test iterator
        expected.iterator().next();
        System.out.println(expected);

        //test clear
        expected.clear();
        assertThat(expected.size(), is(0));
    }
    @org.junit.Test
    public void testLinkedList(){
        LinkedList<Integer> newLinkedList = new LinkedList<>();

        //add to linked list
        newLinkedList.add(6);
        newLinkedList.add(4);
        newLinkedList.add(7);
        newLinkedList.add(6);
        newLinkedList.add(9);
        newLinkedList.add(1);

        //test size
        assertThat(newLinkedList.size(), is(6));

        //test get last
        assertThat(newLinkedList.getLast(), is(1));

        //test get first
        assertThat(newLinkedList.getFirst(), is(6));

        //test remove
        newLinkedList.remove(5);
        assertThat(newLinkedList.size(), is(5));

        //test contains
        assertTrue(newLinkedList.contains(7));

        //test peek
        assertThat(newLinkedList.peek(), is(6));

        //test
        assertThat(newLinkedList.peekLast(), is(9));

    }

    @org.junit.Test
    public void testArrayDeque() {
        ArrayDeque<String> newArr = new ArrayDeque<>();
        newArr.add("hello");
        newArr.add("everyone");
        newArr.add("I");
        newArr.add("am");
        newArr.add("tired.");

        //test insert at head
        newArr.offerFirst("hello one");
        assertThat(newArr.getFirst(), is("hello one"));

        //remove from head
        newArr.pollFirst();
        assertThat(newArr.size(), is(5));

        //add to tail
        newArr.offerLast("still.");
        assertThat(newArr.peekLast(), is("still."));

        //pop
        assertThat(newArr.pop(), is("hello"));

    }

    @org.junit.Test
    public void testTreeMap(){
        TreeMap<String, Integer> newTreeMap = new TreeMap<>();
        newTreeMap.put("hearts", 10);
        newTreeMap.put("clubs", 6);
        newTreeMap.put("diamonds", 8);
        newTreeMap.put("spades", 2);

        //test lower key
        assertThat(newTreeMap.lowerKey("hearts"), is("diamonds"));

        //test ceiling key
        assertThat(newTreeMap.ceilingKey("diamonds"), is("diamonds"));
    }

    @org.junit.Test
    public void testTreeSet(){
        TreeSet<String> newTreeSet = new TreeSet<>();
        newTreeSet.add("hearts");
        newTreeSet.add("clubs");
        newTreeSet.add("diamonds");
        newTreeSet.add("spades");

        //test size
        assertThat(newTreeSet.size(), is(4));

        //test headset
        //assertThat(newTreeSet.headSet("diamonds"), is("clubs"));

        //test tailset
        assertThat(newTreeSet.tailSet("hearts"), is("spades"));
    }










    // Make a bigger test exercising more Stack methods.....
}
