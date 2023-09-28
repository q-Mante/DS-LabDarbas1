/** @author Eimutis Karčiauskas, KTU IF Programų inžinerijos katedra, 2014 09 23
 *
 * Tai yra demonstracinė automobilių sąrašo bandymų klasė, kuri skirta tiesiog
 * veiksmų su sąrašais išbandymui.
 *************************************************************************** */
package com.ktu;

import util.*;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public class ManualTest {

    CarList cars = new CarList();
    ArrayStack<Car> arrayStack = new ArrayStack<>();
    LinkedListStack<Car> linkedListStack = new LinkedListStack<>();
    ArrayQueue<Car> arrayQueue = new ArrayQueue<>();
    LinkedListQueue<Car> linkedListQueue = new LinkedListQueue<>();


    void execute() {
        // initial tests
        createCars();
        createCarList();
        countRenault();
        appendCarList();
        checkCarMarketFilters();
        checkCarMarketSorting();

        // iterator remove() tests
//        testIteratorRemove();

        // stack interface implementation tests
//        createCarArrayStack();
//        createCarListStack();

        // queue interface implementation tests
//        createCarArrayQueue();
//        createCarListQueue();
    }

    void createCarArrayStack() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        Car c4 = new Car("Renault", "Laguna", 2001, 115900, 7500);
        Car c5 = new Car("Renault", "Megane", 1946, 365100, 9500);
        Car c6 = new Car("Honda", "Civic", 2007, 36400, 8500.3);

        Ks.ou(arrayStack.isEmpty());
        Ks.oun("REZULTATAS: true");
        arrayStack.push(c1);
        arrayStack.push(c2);
        arrayStack.push(c3);
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Toyota Corolla 2001 20000 8500.8");
        Ks.ou(arrayStack.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        arrayStack.push(c4);
        Ks.ou(arrayStack.peak());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(arrayStack.isEmpty());
        Ks.oun("REZULTATAS: false");
        arrayStack.push(c5);
        arrayStack.push(c6);
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Honda Civic 2007 36400 8500.3");
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Renault Megane 1946 365100 9500");
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(arrayStack.pop());
        Ks.oun("REZULTATAS: Renault Laguna 1997 50000 1700");
        Ks.ou(arrayStack.isEmpty());
        Ks.oun("REZULTATAS: true");
    }
    void createCarListStack() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        Car c4 = new Car("Renault", "Laguna", 2001, 115900, 7500);
        Car c5 = new Car("Renault", "Megane", 1946, 365100, 9500);
        Car c6 = new Car("Honda", "Civic", 2007, 36400, 8500.3);

        Ks.ou(linkedListStack.isEmpty());
        Ks.oun("REZULTATAS: true");
        linkedListStack.push(c1);
        linkedListStack.push(c2);
        linkedListStack.push(c3);
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Toyota Corolla 2001 20000 8500.8");
        Ks.ou(linkedListStack.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        linkedListStack.push(c4);
        Ks.ou(linkedListStack.peak());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(linkedListStack.isEmpty());
        Ks.oun("REZULTATAS: false");
        linkedListStack.push(c5);
        linkedListStack.push(c6);
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Honda Civic 2007 36400 8500.3");
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Renault Megane 1946 365100 9500");
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(linkedListStack.pop());
        Ks.oun("REZULTATAS: Renault Laguna 1997 50000 1700");
        Ks.ou(linkedListStack.isEmpty());
        Ks.oun("REZULTATAS: true");
    }
    void createCarArrayQueue() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        Car c4 = new Car("Renault", "Laguna", 2001, 115900, 7500);
        Car c5 = new Car("Renault", "Megane", 1946, 365100, 9500);
        Car c6 = new Car("Honda", "Civic", 2007, 36400, 8500.3);

        Ks.ou(arrayQueue.isEmpty());
        Ks.oun("REZULTATAS: true");
        arrayQueue.enqueue(c1);
        arrayQueue.enqueue(c2);
        arrayQueue.enqueue(c3);
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Laguna 1997 50000 1700");
        Ks.ou(arrayQueue.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        arrayQueue.enqueue(c4);
        Ks.ou(arrayQueue.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(arrayQueue.isEmpty());
        Ks.oun("REZULTATAS: false");
        arrayQueue.enqueue(c5);
        arrayQueue.enqueue(c6);
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Toyota Corolla 2001 20000 8500.8");
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Megane 1946 365100 9500");
        Ks.ou(arrayQueue.dequeue());
        Ks.oun("REZULTATAS: Honda Civic 2007 36400 8500.3");
        Ks.ou(arrayQueue.isEmpty());
        Ks.oun("REZULTATAS: true");
    }
    void createCarListQueue() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        Car c4 = new Car("Renault", "Laguna", 2001, 115900, 7500);
        Car c5 = new Car("Renault", "Megane", 1946, 365100, 9500);
        Car c6 = new Car("Honda", "Civic", 2007, 36400, 8500.3);

        Ks.ou(linkedListQueue.isEmpty());
        Ks.oun("REZULTATAS: true");
        linkedListQueue.enqueue(c1);
        linkedListQueue.enqueue(c2);
        linkedListQueue.enqueue(c3);
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Laguna 1997 50000 1700");
        Ks.ou(linkedListQueue.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        linkedListQueue.enqueue(c4);
        Ks.ou(linkedListQueue.peak());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(linkedListQueue.isEmpty());
        Ks.oun("REZULTATAS: false");
        linkedListQueue.enqueue(c5);
        linkedListQueue.enqueue(c6);
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Megane 2001, 20000, 3500");
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Toyota Corolla 2001 20000 8500.8");
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Laguna 2001 115900 7500");
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Renault Megane 1946 365100 9500");
        Ks.ou(linkedListQueue.dequeue());
        Ks.oun("REZULTATAS: Honda Civic 2007 36400 8500.3");
        Ks.ou(linkedListQueue.isEmpty());
        Ks.oun("REZULTATAS: true");
    }

    void testIteratorRemove() {
        CarList cars0 = new CarList();
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        cars0.add(c3);cars0.add(c2);cars0.add(c2);cars0.add(c3);cars0.add(c1);cars0.add(c1);cars0.add(c2);cars0.add(c3);cars0.add(c3);

        cars0.println();

        Iterator<Car> it = cars0.iterator();
        while (it.hasNext()) {
            Car element = it.next();
            if (element.equals(c3)) {
                it.remove();
            }
        }

        cars0.println();
    }


    void createCars() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        Car c4 = new Car();
        Car c5 = new Car();
        Car c6 = new Car();
        c4.parse("Renault Laguna 2001 115900 7500");
        c5.parse("Renault Megane 1946 365100 9500");
        c6.parse("Honda   Civic  2007  36400 8500,3");

        Ks.oun(c1);
        Ks.oun(c2);
        Ks.oun(c3);
        Ks.oun("Pirmų 3 auto ridos vidurkis= "
                + (c1.getMileage() + c2.getMileage() + c3.getMileage()) / 3);
        Ks.oun(c4);
        Ks.oun(c5);
        Ks.oun(c6);
        Ks.oun("Kitų 3 auto kainų suma= "
                + (c4.getPrice() + c5.getPrice() + c6.getPrice()));
    }

    void createCarList() {
        Car c1 = new Car("Renault", "Laguna", 1997, 50000, 1700);
        Car c2 = new Car("Renault", "Megane", 2001, 20000, 3500);
        Car c3 = new Car("Toyota", "Corolla", 2001, 20000, 8500.8);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.println("Pirmi 3 auto");
        cars.add("Renault Laguna 2001 115900 7500");
        cars.add("Renault Megane 1946 365100 9500");
        cars.add("Honda Civic 2007 36400 8500.3");

        cars.println("Visi 6 auto");
        cars.forEach(System.out::println);
        Ks.oun("Pirmų 3 auto ridos vidurkis= "
                + (cars.get(0).getMileage() + cars.get(1).getMileage()
                + cars.get(2).getMileage()) / 3);

        Ks.oun("Kitų 3 auto kainų suma= "
                + (cars.get(3).getPrice() + cars.get(4).getPrice()
                + cars.get(5).getPrice()));
        // palaipsniui atidenkite sekančias eilutes ir išbandykite
        cars.add(0, new Car("Mazda","6",2007,50000,27000));
        cars.add(6, new Car("Hyundai","Lantra",1998,9500,777));
        cars.set(4, c3);
        cars.println("Po įterpimų");
        cars.remove(7);
        cars.remove(0);
        cars.println("Po išmetimų");
        cars.remove(0); cars.remove(0); cars.remove(0);
        cars.remove(0); cars.remove(0); cars.remove(0);
        cars.println("Po visų išmetimų");
        cars.remove(0);
        cars.println("Po visų išmetimų");
    }

    void countRenault() {
        int sk = 0;
        for (Car c : cars) {
            if (c.getMake().compareTo("Renault") == 0) {
                sk++;
            }
        }
        Ks.oun("Renault automobilių yra = " + sk);
    }

    void appendCarList() {
        for (int i = 0; i < 8; i++) {
            cars.add(new Car("Ford", "Focus",
                    2009 - i, 40000 + i * 10000, 36000 - i * 2000));
        }
        cars.add("Ford Mondeo  2009 37000 36000.0");
        cars.add("Fiat Bravo   2008 27000 32500,0");
        cars.add("Ford Fiesta  2009 37000 16000,0");
        cars.add("Audi A6      2006 87000 36000,0");
        cars.println("Testuojamų automobilių sąrašas");
        cars.save("ban.txt");
    }
    
    void checkCarMarketFilters() {
        CarMarket market = new CarMarket();

        market.allCars.load("ban.txt");
        market.allCars.println("Bandomasis rinkinys");

        cars = market.getNewerCars(2001);
        cars.println("Pradedant nuo 2001");

        cars = market.getByPrice(3000, 10000);
        cars.println("Kaina tarp 3000 ir 10000");

        cars = market.getHighestMileageCars();
        cars.println("Daugiausiai nuvažiavę");

        cars = market.getByMakeAndModel("F");
        cars.println("Turi būti tik Fiatai ir Fordai");

        cars = market.getByMakeAndModel("Ford M");

        cars.println("Turi būti tik Ford Mondeo");
        int n = 0;
        for (Car c : cars) {
            n++;    // testuojame ciklo veikimą
        }
        Ks.oun("Ford Mondeo kiekis = " + n);
    }

    void checkCarMarketSorting() {
        CarMarket market = new CarMarket();

        market.allCars.load("ban.txt");
        Ks.oun("========" + market.allCars.get(0));
        market.allCars.println("Bandomasis rinkinys");
        market.allCars.sortBuble(Car.byMakeAndModel);
        market.allCars.println("Rūšiavimas pagal Markę ir Modelį");
        market.allCars.sortBuble(Car.byPrice);
        market.allCars.println("Rūšiavimas pagal kainą");
        market.allCars.sortBuble(Car.byYearAndPrice);
        market.allCars.println("Rūšiavimas pagal Metus ir Kainą");
        market.allCars.sortBuble(byMileage);
        market.allCars.sortBuble(Comparator.comparingInt(Car::getMileage));
        market.allCars.println("Rūšiavimas pagal Ridą");
        market.allCars.sortBuble();
        market.allCars.println("Rūšiavimas pagal compareTo - Kainą");
    }

    static Comparator<Car> byMileage = (car1, car2) -> {
        int m1 = car1.getMileage();
        int m2 = car2.getMileage();
        // rida atvirkščia mažėjančia tvarka, pradedant nuo didžiausios
        if (m1 < m2) {
            return 1;
        }
        if (m1 > m2) {
            return -1;
        }
        return 0;
    };

    public static void main(String... args) {
        // suvienodiname skaičių formatus pagal LT lokalę (10-ainis kablelis)
        Locale.setDefault(new Locale("LT"));
        new ManualTest().execute();
    }
}
