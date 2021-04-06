package hotel;

import hotel.interfaces.IAccounting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem3
 * @class Hotels
 * @since 04.04.2021 - 17.35
 **/
public class HotelsIncome {
    public static void main(String[] args) {
        //1. Create two appropriate classes and 5 objects of each one.

        List<IAccounting> list = new ArrayList<>(
                Arrays.asList(
                        new SuiteRoom("Astoria Kremlin Palace", "L22", 170, 5, 2, true, true, false, true, "Pool", 2, false),
                        new SuiteRoom ("Bella Resort", "L8", 140, 3, 5, true, true, false, true, "Mountain", 0, true),
                        new SuiteRoom ("Astoria Kremlin Palace", "L31-L32", 150, 7, 6, true, true, false, true, " Sea", 1, true),
                        new SuiteRoom ("Bella Resort", "L2", 100, 5, 1, false, true, true, true, "Pool", 2, false),
                        new SuiteRoom ("Astoria Kremlin Palace", "L4", 130, 5, 4, false, false, false, true, "Pool", 3, false),
                        new EconomyRoom("Bella Resort", "E9",55,5,2,true,true),
                        new EconomyRoom("Home-house","21",30,3,1,false,false),
                        new EconomyRoom("Bella Resort","E2,E3", 50, 1, 6, true, false),
                        new EconomyRoom("Home-house","13,14",25,7,8,true,false),
                        new EconomyRoom("Home-house","45", 35, 5, 2, true, false )
                )
        );

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getPriceForAllAccommodation());
        }

        //2. Calculate the total income from visitor accommodation in April in three hotels ("Astoria Kremlin Palace", "Bella Resort", "Home-house".

        System.out.println("----- The total income -----");

        double totalIncome = list.stream().mapToDouble(IAccounting::getPriceForAllAccommodation).sum();
        System.out.println(totalIncome);

        //3. Find the largest income from visitor accommodation in April.

        double maxIncome = list.stream().mapToDouble(IAccounting::getPriceForAllAccommodation).max().getAsDouble();
        System.out.println(maxIncome);

        //4. Find the lowest income from visitor accommodation in April.

        double minIncome = list.stream().mapToDouble(IAccounting::getPriceForAllAccommodation).min().getAsDouble();
        System.out.println(minIncome);

        //5.  The average income from visitor accommodation in April in three hotels.
        double averageIncome = list.stream().mapToDouble(IAccounting::getPriceForAllAccommodation).average().getAsDouble();
        System.out.println(averageIncome);

        //6. Who get more income, part-time or full-time employees?


    }
}
