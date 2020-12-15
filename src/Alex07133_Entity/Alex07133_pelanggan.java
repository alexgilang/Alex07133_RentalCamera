package Alex07133_Entity;
import java.util.Date;

public class Alex07133_pelanggan {
    String Alex07133_id_pelanggan,Alex07133_nama,Alex07133_notelp;
    Date Alex07133_tglpinjam, Alex07133_tglkembali;
    int Alex07133_indexkamera;
    int Alex07133_indexpetugas;
    
    public Alex07133_pelanggan(String Alex07133_id_pelanggan,String Alex07133_nama,String Alex07133_notelp,Date Alex07133_tglpinjam, Date Alex07133_tglkembali,int Alex07133_indexkamera,int Alex07133_indexpetugas){
        this.Alex07133_id_pelanggan=Alex07133_id_pelanggan;
        this.Alex07133_nama=Alex07133_nama;
        this.Alex07133_notelp=Alex07133_notelp;
        this.Alex07133_tglpinjam=Alex07133_tglpinjam;
        this.Alex07133_tglkembali=Alex07133_tglkembali;
        this.Alex07133_indexkamera= Alex07133_indexkamera;
        this.Alex07133_indexpetugas= Alex07133_indexpetugas;
    }
    
    String getId_Pelanggan(){
        return this.Alex07133_id_pelanggan;
    }
    String getNama(){
        return this.Alex07133_nama;
    }
    String getNoTelp(){
        return this.Alex07133_notelp;
    }
    int getIndexKamera(){
        return Alex07133_indexkamera;
    }
    Date getTglPinjam(){
        return this.Alex07133_tglpinjam;
    }
    Date getTglKembali(){
        return this.Alex07133_tglkembali;
    }
    int getIndexPetugas(){
        return Alex07133_indexpetugas;
    }
}
