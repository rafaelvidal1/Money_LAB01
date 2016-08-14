package money;

import java.util.ArrayList;

public class MoneyBag {
    
    private String _currency;
    private int _amount;
    private ArrayList<Money> Mbag = new ArrayList<Money>();
    
    public void newMoney(Money m){
        
        Mbag.add(m);
        
    }
    
    public void addAmount(Money Am){
       String currencyID;
       int index=0;
       boolean flag = false;
       
       currencyID = Am.getCurrency();
       
       for(int i = 0 ; i < Mbag.size() ; i++){
           if(Mbag.get(i).getCurrency()==currencyID){
               index = i;
               flag=true;
           }
       }
       
       if(flag){
           Currency Caux = new Currency();
           Money Maux = new Money(Caux);
           
           Maux = Mbag.get(index);
           Maux.setAmount(Maux.getAmount()+Am.getAmount());
           
           Mbag.remove(index);
           Mbag.add(index,Maux);
       }
       
       else{
           Mbag.add(Am);
           
       }
       
    }
    
    
}
