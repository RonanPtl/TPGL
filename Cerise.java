/**
 *
 * @author roudet
 */
public class Cerise {
    private double prix;
    private String origine;
	
    public Cerise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="France";
    }
    
    public Cerise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object ce){  //predicat pour tester si 2 Cerises sont equivalentes
        if(ce != null && getClass() == ce.getClass()){
            Cerise cer = (Cerise) ce;
            return (prix == cer.prix && origine.equals(cer.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Cerise a des pepins
        return false;
    }


    public static void main (String[] args){
        Cerise cer = new Cerise();

        System.out.println(cer.getPrix());
        System.out.println(cer.getOrigine());
	System.out.println("premier test Cerise");
   }
}
