package sa.com.sfd.ecm.service;

import oracle.stellent.ridc.IdcClient;
import oracle.stellent.ridc.IdcClientException;
import oracle.stellent.ridc.model.DataBinder;
import oracle.stellent.ridc.model.TransferFile;
import oracle.stellent.ridc.protocol.ServiceResponse;
import sa.com.sfd.ecm.client.EcmClientFactory;
import sa.com.sfd.ecm.client.EcmIdcClient;
import sa.com.sfd.ecm.model.DocumentCheckinNewRequestModel;
import sa.com.sfd.ecm.util.Constant;

import java.io.IOException;

public class EcmOperationServiceImpl implements EcmOperationService {

    public String checkinDocument(DocumentCheckinNewRequestModel documentCheckinNewRequestModel) throws IdcClientException, IOException {
        EcmIdcClient ecmIdcClient = EcmClientFactory.getEcmIdcClientInstance();
        IdcClient idcClient = ecmIdcClient.instance();
        DataBinder checkinBinder = idcClient.createBinder();

        checkinBinder.putLocal(Constant.IDC_SERVICE_KEY, Constant.CHECKIN_UNIVERSAL);
        checkinBinder.putLocal(Constant.DOC_TITLE, documentCheckinNewRequestModel.getDDocTitle());
        checkinBinder.putLocal(Constant.DOC_NAME, documentCheckinNewRequestModel.getDDocName());
        checkinBinder.putLocal(Constant.DOC_TYPE, documentCheckinNewRequestModel.getDDocType());
        checkinBinder.putLocal(Constant.DOC_SECURITY_GROUP, documentCheckinNewRequestModel.getDSecurityGroup());
        checkinBinder.putLocal(Constant.DOC_AUTHOR, documentCheckinNewRequestModel.getDSecurityGroup());
        checkinBinder.addFile(Constant.PRIMARY_FILE, new TransferFile(documentCheckinNewRequestModel.getPrimaryFile()));
        ServiceResponse checkInResponse = idcClient.sendRequest(EcmClientFactory.getEcmIdcClientInstance().getContext(), checkinBinder);
        DataBinder dataBinder = checkInResponse.getResponseAsBinder();
        return dataBinder.getLocal("dID");
    }

    public DocumentCheckinNewRequestModel getDocumentById(String id) {
        return null;
    }
}
