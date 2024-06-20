package satish;

import java.util.Scanner;

class Hillstation {
	public void location() {
        System.out.println("Where the Hill Stations are situated.");
    }

    public void famousfor() {
        System.out.println("It is known for its scenic beauty.\n");
    }
}

class Manali extends Hillstation {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }

    @Override
    public void famousfor() {
        System.out.println("Manali is famous for streams and birdsong, forests, orchards and grandess of snow-capped mountains.\n");
    }
}

class Mussoorie extends Hillstation {
    @Override
    public void location() {
        System.out.println("Mussoorie is situated in Uttarakhand.");
    }

    @Override
    public void famousfor() {
        System.out.println("Mussoorie is Gateway to the 'Gangotri' and 'Yamunotri' shrines.\n");
    }
}

class Gulmarg extends Hillstation {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir.");
    }

    @Override
    public void famousfor() {
        System.out.println("Gulmarg is famous the scenic beauty of the Himalayan Mountains in the back drop.\n");
    }
}

public class HillStations {
    public static void main(String[] args) {
        Hillstation genericHillstation = new Hillstation();
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        genericHillstation.location();
        genericHillstation.famousfor();

        manali.location();
        manali.famousfor();

        mussoorie.location();
        mussoorie.famousfor();

        gulmarg.location();
        gulmarg.famousfor();
    }
}    