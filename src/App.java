public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota Faiq = new Anggota("Faiq", "16");
        Faiq.display();
        System.out.println("#################################");
        // b. 1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua Rani = new Ketua("Rani", "30", "2022 / 2023");
        Rani.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia Adel = new KetuaPanitia("Adel", "01", "2023 / 2024");
        Adel.display();
    }
}