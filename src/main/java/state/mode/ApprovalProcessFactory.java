package state.mode;

import state.mode.process.ApprovalProcess;
import state.mode.process.impl.BranchApprovalProcess;
import state.mode.process.impl.CooperationApprovalProcess;
import state.mode.process.impl.HeadquartersApprovalProcess;

public class ApprovalProcessFactory {

    public static String PATh  = "state.mode.process.impl.BranchApprovalProcess";
    public static ApprovalProcess getProcess(OperatorOfficeEnum officeEnum) {
        try {
            ApprovalProcess process = (ApprovalProcess) Class.forName(PATh).newInstance();
            return process;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("啊啊啊");
        /*switch (officeEnum) {
            case BRANCH:
                return new BranchApprovalProcess();
            case HEADQUARTERS:
                return new HeadquartersApprovalProcess();
            case COOPERATION:
                return new CooperationApprovalProcess();
        }
        throw new RuntimeException("啊啊啊");*/
    }
}
