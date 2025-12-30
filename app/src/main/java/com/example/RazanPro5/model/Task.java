package com.example.RazanPro5.model;

import java.util.Date;

public class Task {

   String tName;
   Date tDateSt;
   Date tDateEnd;
   String priority;
   Boolean isDone;
   String tDesc;

    public Task (){

    }

    public Task(String tName,Date tDateSt,Date tDateEnd,String priority,Boolean isDone,String tDesc)
    {
        this.tName=tName;
        this.tDateSt=tDateSt;
        this.tDateEnd=tDateEnd;
        this.tName=tName;
        this.priority =priority;
        this.isDone=isDone;
        this.tDesc=tDesc;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date gettDateEnd() {
        return tDateEnd;
    }

    public void settDateEnd(Date tDateEnd) {
        this.tDateEnd = tDateEnd;
    }

    public Date gettDateSt() {
        return tDateSt;
    }

    public void settDateSt(Date tDateSt) {
        this.tDateSt = tDateSt;
    }

    public String gettDesc() {
        return tDesc;
    }

    public void settDesc(String tDesc) {
        this.tDesc = tDesc;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }


}
