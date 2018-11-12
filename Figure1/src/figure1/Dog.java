package figure1;
public class Dog implements Animal{
    public String roar;
    public String eat;
    Dog() {
        this.roar = "Bok Bok";
        this.eat = "Food";   
    }
    public void setRoar(String roar){
        this.roar = roar;
    }
    public String getRoar() {
        return this.roar;
    }
    public void setEat(String eat){
        this.eat = eat;
    }
    public String getEat() {
        return this.eat;
    }
    
    public void animalcall(){
        System.out.println("Dog roar = " + this.roar);
        System.out.println("Dog eat = " + this.eat);
    }
}
