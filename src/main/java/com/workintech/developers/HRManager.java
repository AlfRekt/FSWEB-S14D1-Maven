package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary){
        super(id,name,salary);
    }

    public HRManager(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers,MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers){
        super(id,name,salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper, int index){
        if(juniorDevelopers.length < index || juniorDevelopers[index] != null ){
            System.out.println("Index is taken or out of range please try another index.");
        }else {
            juniorDevelopers[index] = juniorDeveloper;
        }
    }

    public void addEmployee(MidDeveloper midDeveloper, int index){
        if(midDevelopers.length < index || midDevelopers[index] != null ){
            System.out.println("Index is taken or out of range please try another index.");
        }else {
            midDevelopers[index] = midDeveloper;
        }
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper, int index){
        if(seniorDevelopers.length < index || seniorDevelopers[index] != null ){
            System.out.println("Index is taken or out of range please try another index.");
        }else {
            seniorDevelopers[index] = seniorDeveloper;
        }
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }
}
