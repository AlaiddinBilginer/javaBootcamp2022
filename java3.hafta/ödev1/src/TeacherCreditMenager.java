public class TeacherCreditMenager extends BaseCreditMenager{
    @Override
    public void calculate() {
        System.out.println("Ogertmen Kredisi Hesaplandi.");
    }

    @Override
    public void save(){
        System.out.println("Ogretmen Kredisi kaydedildi.");
    }
}
