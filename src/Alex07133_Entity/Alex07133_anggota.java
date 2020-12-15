package Alex07133_Entity;

public abstract class Alex07133_anggota {
    protected String Alex07133_id_anggota,Alex07133_nama,Alex07133_notelp;
    
    public Alex07133_anggota(String Alex07133_id_anggota,String Alex07133_nama,String Alex07133_notelp){
        this.Alex07133_id_anggota=Alex07133_id_anggota;
        this.Alex07133_nama=Alex07133_nama;
        this.Alex07133_notelp=Alex07133_notelp;
    }
    
    public Alex07133_anggota(){
        
    }
    
    public abstract String getId_Anggota();
    public void setId_Anggota(){
          this.Alex07133_id_anggota = Alex07133_id_anggota;
    }
    String getNama(){
        return this.Alex07133_nama;
    }
    String getNoTelp(){
        return this.Alex07133_notelp;
    }
}
