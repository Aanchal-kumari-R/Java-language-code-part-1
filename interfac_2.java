interface sellerRaju{ 
    int amt = 7 ;   
    public abstract void purchase();  

}  
class customerSanju implements sellerRaju{  
    // amt = 9; it is final;
    public void purchase(){ 
        System.out.println("Sanju needs "+amt+ " kg rice");
    }
}
public class interfac_2 {
    public static void main(String[] args) {  
        sellerRaju r = new customerSanju();  
        r.purchase();
    }
}
