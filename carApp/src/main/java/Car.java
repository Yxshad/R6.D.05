public class Car {
    public static final int MINSPEED = 10;
    public static final int MAXSPEED = 120;
    private final String model;
    private final String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (Car.MAXSPEED >= this.speed + Car.MINSPEED) {
            this.speed += Car.MINSPEED;
            // afficher détails
            this.printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void printDetails() {
        System.out.println("Modèle : " + this.model);
        System.out.println("Couleur : " + this.color);
        System.out.println("Vitesse actuelle : " + this.speed);
    }

    public void slowDown() {
        if (0 <= this.speed - Car.MINSPEED) {
            this.speed -= Car.MINSPEED;
            // afficher détails
            this.printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void changeSpeed(final int nouvelleVitesse, Driver driver) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + nouvelleVitesse);
        if (this.getSpeed() >= nouvelleVitesse) {
            while (this.speed > nouvelleVitesse) {
                this.slowDown();
            }
        } else  {
            while (this.speed < nouvelleVitesse) {
                this.accelerate();
            }
        }
    }

    public static void startCar(Driver driver) {
        if (driver.estAdulte()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public static void arreterVoiture(Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }
}

