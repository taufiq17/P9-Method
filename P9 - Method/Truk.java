public class Truk {

    double muatan;
    double muatanmaks;

    public Truk(double beratmaks){
        muatanmaks=beratmaks;
    }

    public double getMuatan(){

        return muatan;
    }

    public double getMuatanMaks(){

        return muatanmaks;
    }

    //opsi1
    public void tambahMuatan(double berat){
        muatan += berat;//muatan=muatan+berat

        if(muatan >= muatanmaks){
            muatan-=berat;//muatan=muatan-berat
        }
    }

    //opsi2
    public void tambahMuatan1(double berat){
        if((muatan+berat) <= muatanmaks){
            muatan += berat;//muatan=muatan+berat
        } 
    }


}