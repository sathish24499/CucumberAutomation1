package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class MyReport {
public static void generateReport(String json)
{
File f=new File("target");
Configuration con =new Configuration(f,"CucumberMyProject");
con.addClassifications("USER","SATHISH.K SOFTWARE TESTING ENGINEER");
con.addClassifications("TOOL", "ECLIPSE-PHOTON");
con.addClassifications("Java Version", "JDK-11");
List<String> li=new LinkedList<String>();
li.add(json);
ReportBuilder r=new ReportBuilder(li, con);
r.generateReports();
}
}
