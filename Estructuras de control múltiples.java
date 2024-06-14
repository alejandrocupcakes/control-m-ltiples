public static void main(String[] args) {
        int a = 20, b = 10, c = 30;
        if ((a > b && a > c) || (b > a && b > c)) {
            System.out.println("El mayor es " + Math.max(a, b, c));
        } else if ((c > a && c > b)) {
            System.out.println("El mayor es " + Math.max(a, b, c));
        } else {
            System.out.println("Todos son iguales");
        }
    }
