package sa.com.sfd.ecm.model;

import lombok.Data;

import java.io.File;

@Data
public class DocumentCheckinNewRequestModel {
    private String dDocTitle;
    private String dDocName;
    private String dDocType;
    private String dSecurityGroup;
    private File primaryFile;
    private String dDocAuthor;
}
