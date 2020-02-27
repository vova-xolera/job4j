package ru.job4j.department;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> dep = new HashSet();
        for (String str : deps) {
            String[] list = str.split("/");
            String unic = list[0];
            for (int i = 1; i < list.length; i++) {
                dep.add(unic);
                unic = unic + "/" + list[i];
            }
        }
        dep.addAll(deps);
        List<String> rsl = new ArrayList<>(dep);
        sortDesc(rsl);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(new AscDescComp());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
        sortAsc(orgs);

    }

}
