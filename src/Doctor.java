public class Doctor {

    private static int id= 0; // AutoIncrement
    private String name;
    private String speciality;

    Doctor(){
        this.id++;
        System.out.println("Construyendo el objeto doctor");
    }

    Doctor(String speciality){
        System.out.println("la especialidad del doctor es "+speciality);
    }
    //Comportamientos
    public void showName(){
        System.out.println(this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void showId(){
        System.out.println("ID Doctor: "+this.id);
    }

}
