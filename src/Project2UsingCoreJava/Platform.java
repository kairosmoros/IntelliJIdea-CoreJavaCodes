package Project2UsingCoreJava;

public class Platform
{
    private int platformNumber;
    private Train train;
//here not making constructor for the Train since Train is not required here because its always not the case that trains are standing on the platform
//In reality they come and go and remember trains come after platform creation
    public Platform(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNumber=" + platformNumber +
                ", train=" + train +
                '}';
    }
}
