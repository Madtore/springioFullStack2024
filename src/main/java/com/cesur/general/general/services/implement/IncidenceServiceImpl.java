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
        IncidenceDTO incidenceDTO = getIncidenceById(id);
        if (incidenceDTO != null) {
            incidenceRepository.deleteById(id);
        }
    }

    @Override
    public IncidenceDTO getIncidenceById(Long id) {
        IncidenceDTO incidenceDTO = null;
        Optional<Incidence> incidence = incidenceRepository.findById(id);
        if (incidence.isPresent()) {
            incidenceDTO = new IncidenceDTO();
            incidenceDTO.setId(incidence.get().getId());
            incidenceDTO.setDescription(incidence.get().getDescription());
            incidenceDTO.setPriority(incidence.get().getPriority());
            incidenceDTO.setScope(incidence.get().getScope());
            incidenceDTO.setUserCreated(incidence.get().getUserCreated().getName());
        }
        return incidenceDTO;
    }

    @Override
    public List<IncidenceDTO> getIncidenceByUserName(String username) {
       List<IncidenceDTO> incidences = getIncidenceByUserName(username);
       return incidences;
    }

    @Override
    public void addIncidentence() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addIncidentence'");
    }

}
