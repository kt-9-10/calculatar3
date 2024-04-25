package kt;

public class Calculator {
    String operator;
    Double num1;
    Double num2;

    public Calculator(String operator, Double num1, Double num2) {
        this.operator = operator;
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double performOperation() {
        switch (this.operator) {
            case "+":
                Add add = new Add(this.num1, this.num2);
                return add.calculate();
            case "-":
                Sub sub = new Sub(this.num1, this.num2);
                return sub.calculate();
            case "*":
                Mult mult = new Mult(this.num1, this.num2);
                return mult.calculate();
            case "/":
                if (this.num2 != 0) {
                    Div div = new Div(this.num1, this.num2);
                    return div.calculate();
                } else {
                    System.out.println("0で除算することはできません");
                    return 0.0;
                }
            default:
                System.out.println("無効な演算子です");

                return 0.0;
        }
    }
}
