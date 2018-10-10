package pl.ciemic.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.ciemic.sfgpetclinic.model.Vet;
import pl.ciemic.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServicesMap extends AbstractMapServices<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
