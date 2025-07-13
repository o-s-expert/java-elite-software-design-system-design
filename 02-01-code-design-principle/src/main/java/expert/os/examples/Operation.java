package expert.os.examples;

public enum Operation {
    SUM {
        @Override
        double execute(double a, double b) {
            return 0;
        }
    }, SUBTRACT {
        @Override
        double execute(double a, double b) {
            return 0;
        }
    }, MULTIPLY {;
        @Override
        double execute(double a, double b) {
            return 0;
        }
    }, DIVIDE {
        @Override
        double execute(double a, double b) {
            return 0;
        }
    };

    abstract double execute(double a, double b);
}
