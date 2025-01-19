package be.ephec.java.exercice.e10;

public class Programme {
    public static void main(String[] args) {
        DataReportVisualizer drv = new DRVFricEnVrac();
        String result = drv.formatData();
        System.out.println(result);
    }
}
