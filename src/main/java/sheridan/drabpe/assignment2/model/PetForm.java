package sheridan.drabpe.assignment2.model;

import javax.validation.constraints.*;
import java.io.Serializable;

public class PetForm implements Serializable {

    private int id = 0;

    @NotBlank
    @Size(max = 30)
    @Pattern(regexp = "[A-Za-z]*")
    private String petName = "";

    @NotBlank
    @Size(max = 30)
    @Pattern(regexp = "(Cat|Dog|Rabbit)?")
    private String petKind = "";

    private String petGender = "female";

    private boolean vaccinated = false;

    public PetForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetKind() {
        return petKind;
    }

    public void setPetKind(String petKind) {
        this.petKind = petKind;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}

