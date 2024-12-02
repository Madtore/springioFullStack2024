package com.cesur.general.general.services;

import com.cesur.general.general.models.dtos.HistoricalDTO;

public interface HistoricalService {

    void saveHistorical(HistoricalDTO historicalDTO);

    HistoricalDTO getHistoricalById(Long id);

}
