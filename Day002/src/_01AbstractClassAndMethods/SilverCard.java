package _01AbstractClassAndMethods;

public class SilverCard extends Card{
    @Override
    public void pay() {
        System.out.println("银卡打8.5折");
    }
}
