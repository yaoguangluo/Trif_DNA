package Q_A.life;

import Q_A.PP.Help_P_Issues;
import Q_A.analysis.Help_A_Issues;
import Q_A.management.Help_M_Issues;
import Q_A.operation.Help_O_Issues;

import java.util.concurrent.CopyOnWriteArrayList;

public class HelpIssues {
    public void helpDefinition() {

    }

    public void helpImplementation() {

    }

    public void helpCombination() {

    }

    public void helpExtension() {

    }

    public void helpAckquisition() {

    }

    public void philosothon(CopyOnWriteArrayList<String> read) {
        //a
        new Help_A_Issues().vpcsInitons();
        //o
        new Help_O_Issues().vpcsInitons();
        //p
        new Help_P_Issues().vpcsInitons();
        //m
        new Help_M_Issues().vpcsInitons();
    }
}
