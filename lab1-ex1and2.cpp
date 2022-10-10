#include <iostream>

using namespace std;

class Car {
    public:
        string color;
        string brand;
        int mileage;
        int amountOfDoors;
};

class Apple {
    public:
        string species;
        string taste;
        double price;
};

class Person {
    public:
        string firstName;
        string lastName;
        int age;
};


int main()
{
    Person person;
    person.firstName = "Jan";
    person.lastName = "Kowalski";
    Apple apple;
    apple.species = "Polskie";
    apple.taste = "Kwaśny";
    apple.price = 1.5;
    Car car;
    car.color = "Czarny";
    car.brand = "Opel";
    car.mileage = 223500;
    car.amountOfDoors = 4;

    return 0;
}
