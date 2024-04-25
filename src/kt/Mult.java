package kt;

public class Mult extends Operation implements Calculate {

    public Mult(Double num1, Double num2) {
        super(num1, num2);
    }

    @Override
    public Double calculate() {
        return this.num1 * this.num2;
    }
}