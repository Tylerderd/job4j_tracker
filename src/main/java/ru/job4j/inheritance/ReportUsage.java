package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        HtmlReport report2 = new HtmlReport();
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2);
        System.out.println();
        JSONReport json = new JSONReport();
        String text3 = json.generate("Report's name", "Report's body");
        System.out.println(text3);
    }
}
