import javax.swing.JOptionPane;

public static void main(String[] args) {

     String letras = JOptionPane.showInputDialog("Ingresar letras A,B y C");
        char letras = "B";
        switch(letras) {
            case "A":
                System.out.println("Es A");
                break;
            case "B":
                System.out.println("Es B");
                break;
            case "C":
                System.out.println("Es C");
                break;
            default:
                System.out.println("No es A, B o C");
        }
    }
