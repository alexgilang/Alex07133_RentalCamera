package Alex07133_Entity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Alex07133_RentalCamera {
    static ArrayList<Alex07133_anggota>dataPetugas = new ArrayList();
    static ArrayList<Alex07133_pelanggan>dataPelanggan = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Data Rental");
        viewMenu();
    }
    
    static void viewMenu(){
        int pil;
        DataPetugas();
        do{
            System.out.println("Pilihan : ");
            System.out.println("1. Input Data  ");
            System.out.println("2. Lihat Data ");
            System.out.println("3. Ubah Data ");
            System.out.println("4. Hapus Data  ");
            System.out.println("5. Exit");
            System.out.print("Pilih : ");
            pil=input.nextInt();
            
            switch(pil){
                case 1:
                    addPelanggan();
                    System.out.print("");
                    break;
                case 2:
                    viewListPelanggan();
                    System.out.print("");
                    break;
                case 3:
                    if(dataPelanggan.size()>0){
                        for(int i=0; i<dataPelanggan.size(); i++){
                            System.out.println(i+". ID Pelanggan : "+dataPelanggan.get(i).getId_Pelanggan());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
                        
                        editPelanggan(selectIndex);
                    }else{
                        System.out.println("Data Kosong");
                    }
                    break;
                case 4:
                    if(dataPelanggan.size()>0){
                        for(int i=0; i<dataPelanggan.size(); i++){
                            System.out.println(i+". ID Pelanggan : "+dataPelanggan.get(i).getId_Pelanggan());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
                        
                        deletePelanggan(selectIndex);
                    }else{
                        System.out.println("Data Petugas Kosong");
                    }
                    break;
            }
        }while(pil!=5);
        
    }
    
    static void addPelanggan(){
        System.out.print("Input ID Pelanggan : ");
        String Alex07133_id_pelanggan = input.next();
        System.out.print("Input Nama Pelanggan : ");
        String Alex07133_nama = input.next();
        System.out.print("Input Notelp Pelanggan : ");
        String Alex07133_notelp = input.next();
        System.out.print("Input Tanggal Peminjaman Kamera (mm/dd/yyyy) = ");
        Date Alex07133_tglpinjam = new Date(input.next());
        System.out.print("Input Tanggal Pengembalian Kamera (mm/dd/yyyy) = ");
        Date Alex07133_tglkembali = new Date(input.next());
        
        for(int i=0; i<Alex07133_camera.Alex07133_CAMERA_CANON.length;i++){
        System.out.println(i+". "+Alex07133_camera.Alex07133_CAMERA_CANON[i]);
        }
        System.out.print("Pilih Kamera = ");
        int Alex07133_indexkamera = input.nextInt();
        
        for(int i=0; i<dataPetugas.size();i++){
        System.out.println(i+"."+dataPetugas.get(i).Alex07133_nama);
        }        
        System.out.print("Petugas Rental = ");
        int Alex07133_indexpetugas = input.nextInt();
        
        dataPelanggan.add(new Alex07133_pelanggan(Alex07133_id_pelanggan,Alex07133_nama,Alex07133_notelp,Alex07133_tglpinjam,Alex07133_tglkembali,Alex07133_indexkamera,Alex07133_indexpetugas));
        System.out.println("Data berhasil disimpan");
        System.out.println("");
    }
    
    static void viewListPelanggan(){
        if(dataPelanggan.size()>0){
            for(int i=0; i<dataPelanggan.size(); i++){
                System.out.print(" DATA KE ");
                System.out.println(i+"");
                System.out.println(" ID = "+dataPelanggan.get(i).getId_Pelanggan());
                System.out.println(" Nama = "+dataPelanggan.get(i).getNama());
                System.out.println(" Notelp = "+dataPelanggan.get(i).getNoTelp());
                System.out.println(" Kamera yang Dipinjam = "+Alex07133_camera.Alex07133_CAMERA_CANON[dataPelanggan.get(i).Alex07133_indexkamera]);
                System.out.println(" Tanggal Peminjaman Kamera (dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(dataPelanggan.get(i).getTglPinjam()));
                System.out.println(" Tanggal Pengembalian Kamera (dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(dataPelanggan.get(i).getTglKembali()));
                System.out.println(" Petugas Rental = "+dataPetugas.get(dataPelanggan.get(i).Alex07133_indexpetugas).getNama());
                System.out.println(" ");
            }
        }else{
            System.out.println("Data kosong");
        }
    }
    
    static void editPelanggan(int index){
        System.out.print("Input ID Pelanggan : ");
        String Alex07133_id_pelanggan = input.next();
        System.out.print("Input Nama Pelanggan : ");
        String Alex07133_nama = input.next();
        System.out.print("Input Notelp Pelanggan : ");
        String Alex07133_notelp = input.next();
        System.out.print("Input Tanggal Peminjaman Kamera (mm/dd/yyyy) = ");
        Date Alex07133_tglpinjam = new Date(input.next());
        System.out.print("Input Tanggal Pengembalian Kamera (mm/dd/yyyy) = ");
        Date Alex07133_tglkembali = new Date(input.next());
        
        for(int i=0; i<Alex07133_camera.Alex07133_CAMERA_CANON.length;i++){
        System.out.println(i+". "+Alex07133_camera.Alex07133_CAMERA_CANON[i]);
        }
        System.out.print("Pilih Kamera = ");
        int Alex07133_indexkamera = input.nextInt();
        
        for(int i=0; i<dataPetugas.size();i++){
        System.out.println(i+"."+dataPetugas.get(i).Alex07133_nama);
        }        
        System.out.print("Petugas Rental = ");
        int Alex07133_indexpetugas = input.nextInt();
        
        dataPelanggan.set(index,new Alex07133_pelanggan(Alex07133_id_pelanggan,Alex07133_nama,Alex07133_notelp,Alex07133_tglpinjam,Alex07133_tglkembali,Alex07133_indexkamera,Alex07133_indexpetugas));
        System.out.println("Data berhasil diubah");
        System.out.println("");
    }
    
    static void deletePelanggan(int index){
        dataPelanggan.remove(index);
        System.out.println("Data berhasil dihapus");
    }
    
    static void DataPetugas(){
    String Alex07133_id_petugas [] = {"01","02","03"};
    String Alex07133_nama [] = {"ASTRID","SABRINA","ALEX"};
    String Alex07133_notelp [] = {"01","02","03"};
    for(int i=0;i<Alex07133_id_petugas.length;i++){
    dataPetugas.add(new Alex07133_anggota(Alex07133_id_petugas[i],Alex07133_nama[i],Alex07133_notelp[i]));
        }
    }
}
