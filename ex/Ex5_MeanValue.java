package ex;

public class Ex5_MeanValue {
    public static double meanValue(double[] data) {
        double sum = 0;
        for (double datum : data) { // I guess its like a for each?
            sum += datum;
        }
        return sum / data.length;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No data");
            System.exit(1);
        }
        double[] data = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Double.parseDouble(args[i]);
        }
        double mean = meanValue(data);
        System.out.printf("Mean Value = %.3f\n", mean);
    }
}
