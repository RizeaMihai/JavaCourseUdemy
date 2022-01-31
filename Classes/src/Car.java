

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String mod){
        String validModel = mod.toLowerCase();
        if((validModel.equals("carerra")) || validModel.equals("duster")){
            this.model = mod;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }

}
