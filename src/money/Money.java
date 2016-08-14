package money;

public class Money {

    private int _amount;
    private Currency _currency;
    
    public void set (int amount, String currency) {
        
        this._amount = amount;
        _currency.setCurrency(currency);
        
    }
    
    public Money(Currency _Pcurrency) {
        this._currency = _Pcurrency;
    }
    
    public Money add(Money m) {
        Currency _OPcurrency = new Currency();
        _OPcurrency.setCurrency(this._currency.getCurrency());
        Money money = new Money(_OPcurrency);
        money.setAmount(this.getAmount() + m.getAmount());
        return money;
    }
    
    public int getAmount()
    { 
        return _amount;
    }
    
    public void setAmount(int amount)
    { 
        this._amount = amount;
    }
    
    public String getCurrency()
    {  
        return _currency.getCurrency();
    }
    
    //public void setCurrency(String currency)
    //{ 
    //    _currency;
    //}  
    
    
    public static void main(String[] args) {
        
        
        
    }
    
}
