package com.cesur.general.general.services.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.general.general.models.Incidence;
import com.cesur.general.general.models.User;
import com.cesur.general.general.models.dtos.IncidenceDTO;
import com.cesur.general.general.repositories.IncidenceRepository;
import com.cesur.general.general.repositories.UserRepository;
import com.cesur.general.general.services.IncidenceService;

@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    private IncidenceRepository incidenceRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Optional<User> user = userRepository.findById(Long.parseLong(datos.getUserCreated()));
        if (user.isPresent()) {
            Incidence incidence = new Incidence();
            incidence.setDescription(datos.getDescription());
            incidence.setPriority(datos.getPriority());
            incidence.setScope(datos.getScope());
            incidence.setUserCreated(user.get());
            incidenceRepository.save(incidence);
        }
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
