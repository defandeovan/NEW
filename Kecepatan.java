public class Kecepatan {
    private double Jarak; // Jarak yang ditempuh dalam kilometer
    private double Waktu;     // Waktu yang diperlukan dalam jam

    /**
     * Konstruktor kelas Kecepatan.
     * @param Jarak Jarak yang ditempuh dalam kilometer.
     * @param Waktu Waktu yang diperlukan dalam jam.
     */
    public Kecepatan(double Jarak, double Waktu) {
        this.Jarak = Jarak;
        this.Waktu = Waktu;
    }

    /**
     * Menghitung kecepatan rata-rata kendaraan.
     * @return Kecepatan rata-rata kendaraan dalam kilometer per jam (km/h).
     */
    public double Perhitungan() {
        if (Waktu == 0) {
            throw new IllegalArgumentException("Waktu harus lebih dari 0.");
        }
        return Jarak / Waktu;
    }

    /**
     *
     * @param jarak
     */
    public void setJarak(double jarak) {
        this.Jarak = jarak;
    }

    /**
     * Metode untuk mengatur waktu yang diperlukan.
     * @param waktu Waktu yang diperlukan dalam jam.
     */
    public void setWaktu(double waktu) {
        this.Waktu = waktu;
    }

    /**
     * Metode untuk mendapatkan jarak yang ditempuh.
     * @return Jarak yang ditempuh dalam kilometer.
     */
    public double getJarak() {
        return Jarak;
    }

    /**
     * Metode untuk mendapatkan waktu yang diperlukan.
     * @return Waktu yang diperlukan dalam jam.
     */
    public double getWaktu() {
        return Waktu;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas VehicleSpeedCalculator
        Kecepatan Kendaraan = new Kecepatan(100.0, 2.5);

        // Menghitung dan mencetak kecepatan rata-rata kendaraan
        double HitungKecepatan = Kendaraan.Perhitungan();
        System.out.println("Kecepatan rata-rata kendaraan: " + HitungKecepatan + " km/h");
    }
}
