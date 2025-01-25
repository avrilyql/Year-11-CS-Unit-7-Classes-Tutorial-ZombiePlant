public class ZombiePlant {
    //properties
    private int potency;
    private int treatments;

    //constructor
    public ZombiePlant(int potency, int treatments) {
        this.potency = potency;
        this.treatments = treatments;
    }

    //behaviours
    public int getPotency() {
        return this.potency;
    }

    public int treatmentsNeeded() {
        return this.treatments;
    }

    public boolean isDangerous() {
        return this.treatments>0;
    }

    public void treat(int treatmentPotency) {
        if (treatmentPotency>0) {
            if (treatmentPotency<=this.potency && this.treatments>0) {
                this.treatments--;
            }
            else if (treatmentPotency>this.potency) {
                this.treatments++;
            }
        }
    }
}