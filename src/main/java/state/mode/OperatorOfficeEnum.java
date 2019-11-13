package state.mode;

public enum OperatorOfficeEnum {
    BRANCH("分公司"),HEADQUARTERS("总部"),COOPERATION("合作分公司");

    OperatorOfficeEnum(String officeName) {
        this.officeName = officeName;
    }
    private String officeName;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
