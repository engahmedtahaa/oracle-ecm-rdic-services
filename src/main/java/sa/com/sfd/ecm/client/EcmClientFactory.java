package sa.com.sfd.ecm.client;

public class EcmClientFactory {
    private static EcmIdcClient ecmIdcClient;

    public static synchronized EcmIdcClient getEcmIdcClientInstance() {
        if (ecmIdcClient == null)
            ecmIdcClient = new EcmIdcClient();
        return ecmIdcClient;
    }
}
