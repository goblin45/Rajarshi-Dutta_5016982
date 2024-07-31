import java.util.*;

interface Stock {
    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObserver();  
}

interface Observer {
    void update();
}

class Stockmarket implements Stock {
    List<Observer> observers;

    public Stockmarket() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

class MobileApp implements Observer {
    public void update() {
        System.out.println("Mobile App Updated");
    }
}

class WebApp implements Observer {
    public void update() {
        System.out.println("Web App Updated");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Stockmarket stockmarket = new Stockmarket();
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        stockmarket.register(mobileApp);
        stockmarket.register(webApp);
        stockmarket.notifyObserver();
    }
}


/*

Output:

Mobile App Updated
Web App Updated

*/