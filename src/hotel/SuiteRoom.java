package hotel;

import hotel.interfaces.IAccounting;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem3
 * @class SuiteRoom
 * @since 04.04.2021 - 19.05
 **/

public class SuiteRoom implements IAccounting {
        private String nameOfTheHotel;
        private String roomNumber; //may contain the character
        private double pricePerDay; //price per day in the room
        private int days; //number of days of stay
        private int numberOfPersons;
        //additional offers:
        private boolean hasBalcony;
        private boolean isAllInclusiveMeals;
        private boolean hasGymMembership;
        private boolean hasPool;
        private String view;
        private int numberOfExcursions;
        //discounts
        private boolean isregularCustomer;

    public SuiteRoom() {
    }

    public SuiteRoom(String nameOfTheHotel, String roomNumber, double pricePerDay, int days, int numberOfPersons, boolean hasBalcony, boolean isAllInclusiveMeals, boolean hasGymMembership, boolean hasPool, String view, int numberOfExcursions, boolean isregularCustomer) {
        this.nameOfTheHotel = nameOfTheHotel;
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.numberOfPersons = numberOfPersons;
        this.hasBalcony = hasBalcony;
        this.isAllInclusiveMeals = isAllInclusiveMeals;
        this.hasGymMembership = hasGymMembership;
        this.hasPool = hasPool;
        this.view = view;
        this.numberOfExcursions = numberOfExcursions;
        this.isregularCustomer = isregularCustomer;
    }

    public String getNameOfTheHotel() {
        return nameOfTheHotel;
    }

    public void setNameOfTheHotel(String nameOfTheHotel) {
        this.nameOfTheHotel = nameOfTheHotel;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isAllInclusiveMeals() {
        return isAllInclusiveMeals;
    }

    public void setAllInclusiveMeals(boolean allInclusiveMeals) {
        isAllInclusiveMeals = allInclusiveMeals;
    }

    public boolean isHasGymMembership() {
        return hasGymMembership;
    }

    public void setHasGymMembership(boolean hasGymMembership) {
        this.hasGymMembership = hasGymMembership;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getNumberOfExcursions() {
        return numberOfExcursions;
    }

    public void setNumberOfExcursions(int numberOfExcursions) {
        this.numberOfExcursions = numberOfExcursions;
    }

    public boolean isIsregularCustomer() {
        return isregularCustomer;
    }

    public void setIsregularCustomer(boolean isregularCustomer) {
        this.isregularCustomer = isregularCustomer;
    }

    @Override
    public String toString() {
        return "SuiteRoom{" +
                "nameOfTheHotel='" + nameOfTheHotel + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", days=" + days +
                ", numberOfPersons=" + numberOfPersons +
                ", hasBalcony=" + hasBalcony +
                ", isAllInclusiveMeals=" + isAllInclusiveMeals +
                ", hasGymMembership=" + hasGymMembership +
                ", hasPool=" + hasPool +
                ", view='" + view + '\'' +
                ", numberOfExcursions=" + numberOfExcursions +
                ", isregularCustomer=" + isregularCustomer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuiteRoom suiteRoom = (SuiteRoom) o;
        return Double.compare(suiteRoom.getPricePerDay(), getPricePerDay()) == 0 && getDays() == suiteRoom.getDays() && getNumberOfPersons() == suiteRoom.getNumberOfPersons() && isHasBalcony() == suiteRoom.isHasBalcony() && isAllInclusiveMeals() == suiteRoom.isAllInclusiveMeals() && isHasGymMembership() == suiteRoom.isHasGymMembership() && isHasPool() == suiteRoom.isHasPool() && getNumberOfExcursions() == suiteRoom.getNumberOfExcursions() && isIsregularCustomer() == suiteRoom.isIsregularCustomer() && getNameOfTheHotel().equals(suiteRoom.getNameOfTheHotel()) && getRoomNumber().equals(suiteRoom.getRoomNumber()) && getView().equals(suiteRoom.getView());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheHotel(), getRoomNumber(), getPricePerDay(), getDays(), getNumberOfPersons(), isHasBalcony(), isAllInclusiveMeals(), isHasGymMembership(), isHasPool(), getView(), getNumberOfExcursions(), isIsregularCustomer());
    }

    @Override
    public double getPriceForAllAccommodation() {

        //prices for additional offers:

        this.pricePerDay = this.pricePerDay + ((this.hasBalcony) ? 10 : 0)
                +((this.isAllInclusiveMeals) ? 50 : 0)
                + ((this.hasGymMembership) ? 20 : 0)
                +((this.hasPool) ? 15 : 0 );

        if (this.view =="Mountain" || this.view =="Sea"){
            this.pricePerDay += 15;
        }
        else if (this.view =="Garden" || this.view =="Pool"){
            this.pricePerDay += 10;
        }

        //calculation of discounts for groups and regular customers:

        double discount = 0;

        if (this.numberOfPersons >= 5) {
            discount = 0.05;
        }
        if (this.isregularCustomer == true) {
            discount += 0.03;
        }

        //cost of one excursion 30$

        return this.pricePerDay * this.numberOfPersons * this.days * (1 - discount) + (this.numberOfExcursions * 30);
    }
}
