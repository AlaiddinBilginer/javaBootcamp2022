public abstract class BaseCreditMenager implements ICreditMenager {
    public abstract void calculate();

    public void save(){
        System.out.println("Kaydedildi.");
    }
}
