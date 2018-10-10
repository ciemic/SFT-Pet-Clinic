package pl.ciemic.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.ciemic.sfgpetclinic.model.Owner;
import pl.ciemic.sfgpetclinic.model.Vet;
import pl.ciemic.sfgpetclinic.services.OwnerService;
import pl.ciemic.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Gleance");

        ownerService.save(owner2);

        Owner owner3 = new Owner();

        owner3.setFirstName("Sam");
        owner3.setLastName("Axe");

        ownerService.save(owner3);

        System.out.println("Loaded owners .....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Mich");
        vet1.setLastName("Wichdd");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Micdhaels");
        vet2.setLastName("dfseq");

        vetService.save(vet2);

        Vet vet3 = new Vet();

        vet3.setFirstName("sscxc");
        vet3.setLastName("Westvfdson");
        vetService.save(vet3);

        System.out.println("Loaded vets .....");
    }
}
