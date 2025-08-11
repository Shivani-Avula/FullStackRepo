package com.nt.sbeans;
import java.time.LocalDate;

public class NameGenerator {
 private LocalDate mon;
 public NameGenerator()
 {
	 System.out.println("SeasonNameGenerator::0 param constructor");
 }
 public void setDate(LocalDate mon)
 {
	 System.out.println("NameGenerator.setDate()");
	 this.mon=mon;
 }
 public String showName(String name)
 {
	 System.out.println("NameGenerator.showName()");
	 LocalDate ldate = LocalDate.now();
	 int month=ldate.getMonthValue();
	 if(month>=2 && month<=5)
		 return name+" Summer  season";
	 else if(month>=6 && month<=9)
		 return name+" Rainy  season";
	 else
		 return name+" Winter  season";
		 
 }
 
}
