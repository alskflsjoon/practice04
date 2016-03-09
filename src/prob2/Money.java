package prob2;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
        int newAmount;
        newAmount = this.amount + money.amount;
        return new Money(newAmount);//더하기
    }
    public Money minus( Money money ) {
    	int newAmount;
        newAmount = this.amount - money.amount;
        return new Money(newAmount);//빼기
    }
    public Money multiply( Money money ) {
    	int newAmount;
        newAmount = this.amount * money.amount;
        return new Money(newAmount); //곱하기
    }
    public Money devide( Money money ) {
    	int newAmount;
        newAmount = this.amount / money.amount;
        return new Money(newAmount);//나누기
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
    
    

}
