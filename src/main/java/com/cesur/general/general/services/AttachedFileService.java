package com.cesur.general.general.services;

public interface AttachedFileService {

    void storeFile(Long incidentId, String fileName, String contentType, byte[] data);

    void deleteFile(Long incidentId, String fileName);

    byte[] getFile(Long incidentId, String fileName);

}
