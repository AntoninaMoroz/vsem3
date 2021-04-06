package hotel;

import hotel.interfaces.IAccounting;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem3
 * @class EconomyRoom
 * @since 04.04.2021 - 15.49
 **/
public class EconomyRoom implements IAccounting {

        private String nameOfTheHotel;
        private String roomNumber; //may contain the character
        private double pricePerDay; //price per day in the room
        private int days; //number of days of stay
        private int numberOfPersons;
        //additional offers:
        private boolean isHasWifi;
        //discounts
        private boolean isregularCustomer;

    public EconomyRoom() {
    }

    public EconomyRoom(String nameOfTheHotel, String roomNumber, double pricePerDay, int days, int numberOfPersons, boolean isHasWifi, boolean isregularCustomer) {
        this.nameOfTheHotel = nameOfTheHotel;
        this.roomNumber = roomNumber;
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.numberOfPersons = numberOfPersons;
        this.isHasWifi = isHasWifi;
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

    public boolean isHasWifi() {
        return isHasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        isHasWifi = hasWifi;
    }

    public boolean isIsregularCustomer() {
        return isregularCustomer;
    }

    public void setIsregularCustomer(boolean isregularCustomer) {
        this.isregularCustomer = isregularCustomer;
    }

    @Override
    public String toString() {
        return "EconomyRoom{" +
                "nameOfTheHotel='" + nameOfTheHotel + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", days=" + days +
                ", numberOfPersons=" + numberOfPersons +
                ", isHasWifi=" + isHasWifi +
                ", isregularCustomer=" + isregularCustomer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EconomyRoom that = (EconomyRoom) o;
        return Double.compare(that.getPricePerDay(), getPricePerDay()) == 0 && getDays() == that.getDays() && getNumberOfPersons() == that.getNumberOfPersons() && isHasWifi() == that.isHasWifi() && isIsregularCustomer() == that.isIsregularCustomer() && getNameOfTheHotel().equals(that.getNameOfTheHotel()) && getRoomNumber().equals(that.getRoomNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheHotel(), getRoomNumber(), getPricePerDay(), getDays(), getNumberOfPersons(), isHasWifi(), isIsregularCustomer());
    }

    @Override
    public double getPriceForAllAccommodation() {

        //the cost of wifi per day is 5$

        if (this.isHasWifi == true) {
            this.pricePerDay += 5;
        }

        //calculation of discounts for groups and regular customers

        double discount = 0;

        if (this.numberOfPersons>=5 ) {
            discount = 0.05;
        }
        if (this.isregularCustomer == true) {
            discount += 0.03;
        }

        return this.pricePerDay * this.numberOfPersons * this.days * (1 - discount);
    }
}

