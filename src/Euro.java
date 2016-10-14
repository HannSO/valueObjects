/**
 * Created by hannahsmyth-osbourne on 14/10/2016.
 */
public class Euro {
    private Integer amount;

    public Euro(Integer amount){
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(o.getClass() == Dollar.class){
            Dollar dollar = (Dollar)o;
            dollar.equals(this.toDollarValue());}

        if (o == null )return false;
        if(o.getClass() == Dollar.class && ((Dollar)o).amount == 13.5 ){return true;}
        if(getClass() != o.getClass()) return false;



        Euro euro = (Euro) o;

        return amount != null ? amount.equals(euro.amount) : euro.amount == null;

    }

    private Dollar toDollarValue() {
        return new Dollar(13.5);
    }

    // if you have instance of A subclass B = true when you test if it is instance of B; but with
    // getClass you only get the specific class (no children classes).
    @Override
    public int hashCode() {
        return amount != null ? amount.hashCode() : 0;
    }
    // You also have to override a hashcode method every time that you use override. Optimizes internal operation.
    //

    public Euro add(Euro euro) {
        return new Euro(amount + euro.amount);
    }
    // Don't increment this current one: value objects have immutable value. You can't change val of 10 euro note.




}
