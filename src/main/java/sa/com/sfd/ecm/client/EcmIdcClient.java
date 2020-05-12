package sa.com.sfd.ecm.client;

import oracle.stellent.ridc.IdcClient;
import oracle.stellent.ridc.IdcClientException;
import oracle.stellent.ridc.IdcClientManager;
import oracle.stellent.ridc.IdcContext;
import sa.com.sfd.ecm.util.Constant;


public class EcmIdcClient {
    private static IdcClient idcClient = null;
    private static IdcContext userContext = null;

    public IdcClient instance() throws IdcClientException {
        IdcClientManager manager = new IdcClientManager();
        idcClient = manager.createClient(Constant.UCM_URL);
        return idcClient;
    }

    public IdcContext getContext() {
        userContext = new IdcContext(Constant.UCM_USERNAME, Constant.UCM_PASSWORD);
        return userContext;
    }
}
