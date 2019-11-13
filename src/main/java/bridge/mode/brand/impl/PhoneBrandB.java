package bridge.mode.brand.impl;

import bridge.mode.brand.PhoneBrand;
import bridge.mode.software.PhoneSoftware;

import java.util.LinkedList;
import java.util.List;

public class PhoneBrandB implements PhoneBrand {
    List<PhoneSoftware> softwareList = new LinkedList<PhoneSoftware>();
    PhoneBrandB() {}
    PhoneBrandB(List< PhoneSoftware > softwares) {
        softwareList = softwares;
    }
    public void addSoft(PhoneSoftware software) {
        softwareList.add(software);
    }
    public void printBrand() {
        System.out.println("手机品牌B");
        for (PhoneSoftware software : softwareList) {
            software.run();
        }
    }
}
