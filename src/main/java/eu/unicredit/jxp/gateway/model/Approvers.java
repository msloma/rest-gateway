package eu.unicredit.jxp.gateway.model;

public class Approvers {
    private final String userids;
    private final String mails;

    public Approvers(String userids) {
        this.userids = userids;
        this.mails = userids+"@mailasp.internal";
    }

    public String getUserids() {
        return userids;
    }

    public String getMails() {
        return mails;
    }


}
