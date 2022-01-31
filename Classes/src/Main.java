public class Main {
    public static void main (String[] args) {
        Car porsche = new Car();
        Car dacia = new Car();
        porsche.setModel("911");
        dacia.setModel("Duster");
        System.out.println("Model for Porsche is " + porsche.getModel());
        System.out.println("Model for Dacia is " + dacia.getModel());
    }
}
