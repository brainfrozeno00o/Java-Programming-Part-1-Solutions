
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money firstMoneyObject = new Money(2, 50);
        Money secondMoneyObject = new Money(2, 00);
        Money tennerMinusTwoEuros = firstMoneyObject.minus(secondMoneyObject);
        System.out.println(tennerMinusTwoEuros);
        
    }
}
