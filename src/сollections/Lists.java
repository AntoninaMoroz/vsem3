package сollections;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem3
 * @class Lists
 * @since 01.04.2021 - 20.53
 **/
public class Lists {
    public static void main(String[] args) {

        //1.  Create ArrayList and LinkedList containing 100 000 Integer elements. Compare time intervals.

        //ArrayList

        List<Integer> arrayList = new ArrayList<>( );

        System.out.println("--- Create 100 000 Integer elements --- ");

        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000 ; i++) {

            arrayList.add(i);
        }
        LocalDateTime finish = LocalDateTime.now();

        int duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList " + arrayList.size());

        //LinkedList

        List<Integer> linkedList = new LinkedList<>( );

        start = LocalDateTime.now();

        for (int i = 0; i < 100000 ; i++) {

            linkedList.add(i);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println("LinkedList duration " + duration);
        System.out.println("size of LinkedList " + linkedList.size());

        // 2. Insert new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.

        //2.1 Insert new 1000 elements  on the  beginning

        //ArrayList
        System.out.println("");
        System.out.println("--- Insert new 1000 elements on the beginning --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.add(0,23);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.add(0,23);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

        //2.2 Insert new 1000 elements on the middle

        //ArrayList

        System.out.println("");
        System.out.println("--- Insert new 1000 elements on the middle --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.add(50000,45);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            linkedList.add(50000,45);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //2.3 Insert new 1000 elements on the end

        //ArrayList

        System.out.println("");
        System.out.println("--- Insert new 1000 elements on the end --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.add(99990,88);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.add(99990,88);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

        //3. Update 1000 elements from the beginning, from  the middle  and from the end of ones. Compare time intervals.

        //3.1 Update 1000 elements on the beginning

        //ArrayList

        System.out.println("");
        System.out.println("--- Update 1000 elements  on the  beginning --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.set(5,61);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.set(5,61);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

        //3.2 Update 1000 elements on the middle

        //ArrayList

        System.out.println("");
        System.out.println("--- Update 1000 elements on the middle --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.set(50500,89);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            linkedList.set(50500,89);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //3.3 Update 1000 elements on the end

        //ArrayList

        System.out.println("");
        System.out.println("--- Update 1000 elements on the end --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.set(99700,100);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.set(99700,100);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

     //4.Delete 1000 elements from the  beginning, from  the middle  and from the end of ones. Compare time intervals.

        //4.1 Delete 1000 elements on the beginning

        //ArrayList

        System.out.println("");
        System.out.println("--- Delete 1000 elements on the beginning --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.remove(10);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.remove(10);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

        //4.2 Delete 1000 elements  on  the middle

        //ArrayList

        System.out.println("");
        System.out.println("--- Delete 1000 elements on the middle --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.remove(51000);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            linkedList.remove(51000);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //4.3 Delete 1000 elements  on the end

        //ArrayList

        System.out.println("");
        System.out.println("--- Delete 1000 elements on the end --- ");

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            arrayList.remove(98000);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "ArrayList duration " + duration);
        System.out.println("size of ArrayList now " + arrayList.size());

        //LinkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000 ; i++) {

            linkedList.remove(98000);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println( "LinkedList duration " + duration);
        System.out.println("size of LinkedList now " + arrayList.size());

     /* result:

--- Create 100 000 Integer elements ---
ArrayList duration 157
size of ArrayList 100000      LinkedList is almost 2 times faster than ArrayList created 100 000 elements
LinkedList duration 69
size of LinkedList 100000

--- Insert new 1000 elements on the beginning ---
ArrayList duration 110
size of ArrayList now 101000    ArrayList much faster insert new 1000 elements on the beginning than LinkedList
LinkedList duration 1
size of LinkedList now 101000

--- Insert new 1000 elements on the middle ---
ArrayList duration 22
size of ArrayList now 102000     ArrayList much slower insert new 1000 elements on the middle than LinkedList
LinkedList duration 435
size of ArrayList now 102000

--- Insert new 1000 elements on the end ---
ArrayList duration 1
size of ArrayList now 103000       ArrayList much faster insert new 1000 elements on the end than LinkedList
LinkedList duration 82
size of LinkedList now 103000

--- Update 1000 elements  on the  beginning ---
ArrayList duration 0
size of ArrayList now 103000        ArrayList is faster than LinkedList Update 1000 elements  on the  beginning
LinkedList duration 1
size of LinkedList now 103000

--- Update 1000 elements on the middle ---
ArrayList duration 1
size of ArrayList now 103000         ArrayList much faster Update 1000 elements on the middle than LinkedList
LinkedList duration 365
size of ArrayList now 103000

--- Update 1000 elements on the end ---
ArrayList duration 0
size of ArrayList now 103000         LinkedList much slower Update 1000 elements on the end than ArrayList
LinkedList duration 12
size of LinkedList now 103000

--- Delete 1000 elements on the beginning ---
ArrayList duration 96
size of ArrayList now 102000           LinkedList much faster delete 1000 elements on the beginning than ArrayList
LinkedList duration 1
size of LinkedList now 102000

--- Delete 1000 elements on the middle ---
ArrayList duration 22
size of ArrayList now 101000         LinkedList much slower delete 1000 elements on the middle than ArrayList
LinkedList duration 243
size of ArrayList now 101000

--- Delete 1000 elements on the end ---
ArrayList duration 1
size of ArrayList now 100000        LinkedList  slower delete 1000 elements on the end  than ArrayList
LinkedList duration 7
size of LinkedList now 100000

     */


    }
}
