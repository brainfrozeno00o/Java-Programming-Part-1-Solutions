
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        return new Money((this.euros() + addition.euros()), (this.cents() + addition.cents()));
    }
    
    public boolean lessThan(Money compared){
        if(this.euros() - compared.euros() == 0){
            if(this.cents() - compared.cents() >= 0){
                return false;
            } else {
                return true;
            }
        } else if (this.euros() - compared.euros() > 0){
            return false;
        } else {
            return true;
        }
    }
    
    public Money minus(Money compared){
        int calculateCents = 0;
        int calculateEuros = 0;
        if (this.cents() - compared.cents() < 0 && (this.euros() - compared.euros() > 0)){
            // carry over
            int tempEuros = this.euros - 1;
            calculateCents = 100 + this.cents() - compared.cents();
            calculateEuros = tempEuros - compared.euros();
        } else if (this.cents() - compared.cents() >= 0 && this.euros() - compared.euros() >= 0){
            calculateCents = this.cents() - compared.cents();
            calculateEuros = this.euros() - compared.euros();
        } else if (this.cents() - compared.cents() < 0 || this.euros() - compared.euros() < 0){
            calculateCents = 0;
            calculateEuros = 0;           
        }
        return new Money(calculateEuros, calculateCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
