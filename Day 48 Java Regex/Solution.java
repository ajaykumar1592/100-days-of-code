import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {

  public static MyRegex myRegex;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    myRegex = new MyRegex();

    while(sc.hasNext()){
      myRegex.setStringPattern(sc.nextLine());
      System.out.println(myRegex.pattern());
    }
    
    sc.close();
  }
}

class MyRegex {
  public String stringPattern;

  public MyRegex() {
    getStringPattern();
  }

  public void setStringPattern(String string){
    this.stringPattern = string;
  }

  public String getStringPattern(){
    return stringPattern;
  }


  public boolean pattern(){
    final Pattern pattern = Pattern.compile("\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b");

    final Matcher matcher = pattern.matcher(getStringPattern());
    return matcher.matches();
  }
}
