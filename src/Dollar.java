/**
 * Created by hannahsmyth-osbourne on 14/10/2016.
 */
public class Dollar {
    public double amount;

    public Dollar(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        return Double.compare(dollar.amount, amount) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }
}
