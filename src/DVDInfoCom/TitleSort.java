package DVDInfoCom;

import java.util.*;
class DVDInfoCom {
String title;
String genre;
String leadActor;
DVDInfoCom(String t, String g, String a) {
title = t; genre = g; leadActor = a;
}
public String toString() {
return title + " " + genre + " " + leadActor + "\n";
}
public String getTitle() {
return title;
}
public static <TitleSort> void main(String...args){
List<DVDInfoCom> dvd=new ArrayList<DVDInfoCom>();
dvd.add(new DVDInfoCom("Inception","Sci-fic","Leo"));
dvd.add(new DVDInfoCom("IndianJones","Action","Harry"));
dvd.add(new DVDInfoCom("Fast&Furious","Action","Vin"));
TitleSort sort=new TitleSort();
Collections.sort(dvd,sort);
for(DVDInfoCom element : dvd)
System.out.println(element);
}
}

}
