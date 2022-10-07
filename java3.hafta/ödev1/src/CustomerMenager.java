public class CustomerMenager {
    private Customer customer;
    private ICreditMenager creditMenager;

    public CustomerMenager(Customer customer, ICreditMenager creditMenager){
        this.customer = customer;
        this.creditMenager = creditMenager;
    }
    public void save(){
        System.out.println("Musteri kaydedildi.");
    }

    public void delete(){
        System.out.println("Musteri silindi.");
    }

    public void giveCredit(){
        creditMenager.calculate();
        creditMenager.save();
        System.out.println("Kredi verildi.");
    }
}
