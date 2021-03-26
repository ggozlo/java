package com.ggozlo;

import java.util.Scanner;

class Sung18{
   String name, nj;
   int kor, eng, mat, tot;
   double avg;
   char hak;
   
   public String getNj() {
      return nj;
   }
   public void setNj(String nj) {
      this.nj = nj;
   }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getKor() {
      return kor;
   }
   public void setKor(int kor) {
      this.kor = kor;
   }
   public int getEng() {
      return eng;
   }
   public void setEng(int eng) {
      this.eng = eng;
   }
   public int getMat() {
      return mat;
   }
   public void setMat(int mat) {
      this.mat = mat;
   }
   
   void pars(){
      name = nj.substring(0,4);
      kor = Integer.parseInt(nj.substring(4,7));
      eng = Integer.parseInt(nj.substring(7,10));
      mat = Integer.parseInt(nj.substring(10,13));
   }
   
   int cal() {
      return kor+eng+mat;
      }
      
   double cal2() {
      return (double)cal()/3;
   }
      
   char cal3() {
      if(cal2()>=90) hak='A';
      else if(cal2()>=80)  hak='B';
      else if(cal2()>=70)  hak='C';
      else if(cal2()>=60)  hak='D';
      else hak='F';
      return hak;
   }
   
   
   void out() {
      cal();
      System.out.println("이름 :"+name);
      System.out.println("국어 :"+kor+"영어 :"+eng+"수학 "
            + ":"+mat+"총점: "+tot+"평균: "+ avg+"학점: "+hak);
   }
   
   
   
}
public class Sample3{

   public static void main(String[] args) {
      Sung18 ingwon = new Sung18();
      
      System.out.println("홍길동099088077");
      Scanner sc = new Scanner(System.in);
      ingwon.setNj(sc.next());
      
      ingwon.pars();
      ingwon.cal();
      ingwon.cal2();
      ingwon.cal3();
      ingwon.out();
      
      sc.close();
   }

}