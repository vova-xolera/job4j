package ru.job4j.condition;




public class TruckerJob {
    public static void main(String[] args) {
         Driver steve = new  Driver();
        java.lang.System.out.println("Steve wants the trucker job.");
        steve.passExamOn('A');
        if (!steve.hasLicense()) {
            java.lang.System.out.println("Steve need to get a license!");
            steve.passExamOn('C');
        }
        if (steve.canDrive('C')) {
            java.lang.System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) {
            java.lang.System.out.println("Steve works in taxi.");
        } else {
            java.lang.System.out.println("Steve does not have a job, but ride on motorbike!");

        }
    }


}