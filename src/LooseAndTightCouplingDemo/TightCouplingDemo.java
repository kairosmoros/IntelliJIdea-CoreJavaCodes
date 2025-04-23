package LooseAndTightCouplingDemo;
class Station123
{
    int numberOfPlatforms=4;
}
class Train1123
{
    Station123 station;
    Train1123(Station123 station)
    {
        this.station=station;
    }
    void showInfo()
    {
        System.out.println("Number of platforms: " +station.numberOfPlatforms);//This code works fine but you can't interact with individual platforms, assign trains, or modify their status etc.
    }

}
class TightCouplingDemo
{
    public static void main(String[] args) {
        Station123 s= new Station123();
        Train1123 t= new Train1123(s);
        t.showInfo();
    }
}
