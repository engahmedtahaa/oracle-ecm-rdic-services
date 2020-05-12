package sa.com.sfd.ecm.service;

import oracle.stellent.ridc.IdcClientException;
import sa.com.sfd.ecm.model.DocumentCheckinNewRequestModel;

import java.io.IOException;

public interface EcmOperationService {

    String checkinDocument(DocumentCheckinNewRequestModel documentCheckinNewRequestModel) throws IdcClientException, IOException;
    DocumentCheckinNewRequestModel getDocumentById(String id);

}
