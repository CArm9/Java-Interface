package figure1;
public class DogToy extends Dog implements Animal{
    public String eat;
    DogToy() {
        this.eat = "Battery";
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
