public class AppleWeightIndicator implements ApplePrettyPrint {


    @Override
    public String print(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
