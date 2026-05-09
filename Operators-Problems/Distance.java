public class Distance {

    // Program to prints the Euclidean distance
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments for x and y.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double sumOfSquares = Math.pow(x, 2) + Math.pow(y, 2);
        double distance = Math.sqrt(sumOfSquares);

        System.out.println("The Euclidean distance from (" + x + ", " + y + ") to (0, 0) is: " + distance);
    }
}