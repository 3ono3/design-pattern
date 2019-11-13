package state.mode;

import state.mode.process.ApprovalProcess;

/**
 * 经办人审批
 */
public class OperatorApproval {
    //经办人所属公司
    private OperatorOfficeEnum operatorOffice;
    //经办人审批流程
    private ApprovalProcess approvalProcess;

    public void approval() {
        approvalProcess.audit();
    }
    public OperatorOfficeEnum getOperatorOffice() {
        return operatorOffice;
    }

    public void setOperatorOffice(OperatorOfficeEnum operatorOffice) {
        this.operatorOffice = operatorOffice;
    }

    public ApprovalProcess getApprovalProcess() {
        return approvalProcess;
    }

    public void setApprovalProcess(ApprovalProcess approvalProcess) {
        this.approvalProcess = approvalProcess;
    }
}
