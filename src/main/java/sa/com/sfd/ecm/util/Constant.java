package sa.com.sfd.ecm.util;

public class Constant {
    //Ecm Connection
    public static final String UCM_URL = "idc://172.16.101.18:4444";
    public static final String UCM_USERNAME = "weblogic";
    public static final String UCM_PASSWORD = "welcome1";
    //Checkin-service
    public static final String CHECKIN_UNIVERSAL = "CHECKIN_UNIVERSAL";
    public static final String IDC_SERVICE_KEY = "IdcService";
    public static final String DOC_TITLE = "dDocTitle";
    public static final String DOC_NAME = "dDocName";
    public static final String DOC_DID = "dID";
    public static final String DOC_TYPE = "dDocType";
    public static final String DOC_SECURITY_GROUP = "dSecurityGroup";
    public static final String DOC_AUTHOR = "dDocAuthor";
    public static final String PRIMARY_FILE = "primaryFile";

    private Constant() {
        throw new IllegalStateException("Utility class");
    }


}
