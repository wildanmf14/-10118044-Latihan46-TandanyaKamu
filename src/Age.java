
public class Age {
	private int yearBirth;
    private int yearNow;
    private static final String RED = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    Age() {

    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        yearNow = 2019;
        return yearNow;
    }

    public int hitungUmur() {
        int umur = yearNow - yearBirth;
        return umur;
    }

    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <=5 ) {
        	return RED + "LAGI LUCU-LUCUNYA";
        }else if(umur > 5 && umur <= 10 ) {
        	return RED + "MASIH ANAK-ANAK";
        }else if(umur > 10 && umur <= 13 ) {
        	return RED + "MASIH REMADJA";
        }else if(umur > 13 && umur <=19 ) {
        	return RED + "ALAY";
        }else if(umur > 19 && umur <=29 ) {
        	return RED + "LAGI GALAU NYARI JODOH";
        }else if(umur > 29 && umur <=35 ) {
        	return RED + "LAGI SIBUK NYARI UANG";
        }else if(umur > 35 && umur <=150 ){
        	return RED + "SUDAH TUA";
        }else {
        	return RED + "TIDAK TERDETEKSI DI KEHIDUPAN";

        }
        

    }

}
