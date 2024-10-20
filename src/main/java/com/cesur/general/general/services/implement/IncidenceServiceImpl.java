package com.cesur.general.general.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.general.general.models.Incidence;
import com.cesur.general.general.models.dtos.IncidenceDTO;
import com.cesur.general.general.repositories.IncidenceRepository;
import com.cesur.general.general.services.IncidenceService;

public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    private IncidenceRepository repository;

    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Incidence incidence = new Incidence();
        incidence.setDescription(datos.getDescription());
        incidence.setPriority(datos.getPriority());
        incidence.setScope(datos.getScope());
        incidence.setUserCreated(null);

        repository.save(incidence);

    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public IncidenceDTO getIncidenceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceById'");
    }

    @Override
    public List<IncidenceDTO> getIncidenceByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUserName'");
    }

    @Override
    public void addIncidentence(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addIncidentence'");
    }

}
