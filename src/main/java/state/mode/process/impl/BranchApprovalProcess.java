package state.mode.process.impl;

import state.mode.process.ApprovalProcess;

public class BranchApprovalProcess implements ApprovalProcess {
    public void audit() {
        System.out.println("分公司审批流程");
    }
}
