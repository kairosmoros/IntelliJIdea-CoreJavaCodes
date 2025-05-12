package LooseAndTightCouplingDemo;
/* 
In tight coupling, one class is directly dependent on another. Changes in one class often requires changes in the other.

 */
class Engine
{
    public void start()
    {
        System.out.println("Engine Started ");
    }
}
//Car class is tightly coupled with Engine
class Car
{
    Engine engine= new Engine();//Direct dependency
    public void startCar()
    {
        engine.start();
    }
}

class tightcouplingsimpledemo
{
    public static void main(String[] args) {
        Car car= new Car();
        car.startCar();
    }
}
/*
    Problem:
    If we want to change the engine type (eg., ElectricEngine), we must change the Car class.
    It's not flexible or scalable
 */