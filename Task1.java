class Task1 {
    public static void main(String arg[]) {
        int x[] = {1, 2, 2, 3, 3, 4, 5};
        int[] y = new int[5];
        int i;
        int k = 0;
        for (i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) {
                continue;
            } else {
                y[k++] = x[i];
            }
        }
        y[k++] = x[x.length - 1]; // Add the last element of x to y
        for (k = 0; k < y.length; k++) {
            System.out.print(y[k]+" ");
        }
    }
}