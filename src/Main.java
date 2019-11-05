import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Age age = new Age();
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir anda : ");
        age.setYearBirth(masuk.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.printf("Tahun Lahir Anda \t: %d%n", age.getYearBirth());
        System.out.printf("Hari ini tahun \t\t: %d%n", age.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun%n", age.hitungUmur());
        System.out.printf("Tandanya Kamu %s%n", age.tandanyaKamu(age.hitungUmur()));
        masuk.close();
	}

}
