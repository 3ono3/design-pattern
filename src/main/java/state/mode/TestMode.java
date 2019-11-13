package state.mode;

import org.junit.Test;

public class TestMode {
    @Test
    public void approval() {
        OperatorApproval operatorApproval = new OperatorApproval();
        operatorApproval.setOperatorOffice(OperatorOfficeEnum.COOPERATION);
        operatorApproval.setApprovalProcess(ApprovalProcessFactory.getProcess(operatorApproval.getOperatorOffice()));
        operatorApproval.approval();
    }
}
