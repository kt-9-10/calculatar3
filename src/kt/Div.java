package kt;

public class Div extends Operation implements Calculate {

    public Div(Double num1, Double num2) {
        super(num1, num2);
    }

    @Override
    public Double calculate() {
        return this.num1 / this.num2;
    }
}