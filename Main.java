public class Main {
    
    public static void main(String[] args){
    Matematik.Factorial faktoriyel= new Matematik().new Factorial();
    Matematik.Asal asal= new Matematik().new Asal();
    Matematik.Alan.DaireAlan dairealan = new Matematik().new Alan().new DaireAlan();
    
    Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scanner.nextInt();
        
        if(asal.asal_mi(sayi)){
            System.out.println("bu sayi asaldir");
        }
        else{
            System.out.println("bu sayi asal degildir");
        }
        faktoriyel.faktoriyel();
        dairealan.daire_alan(3);
    }
}
