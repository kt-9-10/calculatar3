package kt;

public class Add extends Operation implements Calculate {

    public Add(Double num1, Double num2) {
        super(num1, num2);
    }

    @Override
    public Double calculate() {
        return this.num1 + this.num2;
    }
}