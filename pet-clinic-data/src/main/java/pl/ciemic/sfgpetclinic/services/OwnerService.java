package pl.ciemic.sfgpetclinic.services;

import pl.ciemic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
