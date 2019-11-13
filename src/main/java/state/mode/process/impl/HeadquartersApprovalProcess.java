package state.mode.process.impl;

import state.mode.process.ApprovalProcess;

public class HeadquartersApprovalProcess implements ApprovalProcess {
    public void audit() {
        System.out.println("总部投后负责人审批流程");
    }
}
