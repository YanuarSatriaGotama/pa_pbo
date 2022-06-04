package top_up_game;

abstract class User {
    protected String id, username, password, otorisasi, nama, alamat, noTelp;

    // constructor
    public User (
            String id,
            String username,
            String password,
            String otorisasi,
            String nama,
            String alamat,
            String noTelp
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.otorisasi = otorisasi;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setOtorisasi(String otorisasi) {
        this.otorisasi = otorisasi;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getId(String id) {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getOtorisasi() {
        return otorisasi;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public String statusLogin(String otorisasi) {
        return "Berhasil login sebagai " + otorisasi;
    }
}