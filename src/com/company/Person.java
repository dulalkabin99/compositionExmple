package com.company;


public class Person {


    Education ed;
    Job j;
    public Person(){
      this.ed=  new Education();
        this.j =new Job();


    }


    public Education getEd() {
        return ed;
    }

    public void setEd(Education ed) {
        this.ed = ed;
    }

    public Job getJ() {
        return j;
    }

    public void setJ(Job j) {
        this.j = j;
    }
}
