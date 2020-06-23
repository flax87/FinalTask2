package com.company;

public class Company {


    private long numberOfWorkers;   //number of workers
    private Company parent;
    private String name;



    //Constructor
    public Company(Company parent, long employeesCount)
    {
        this.parent = parent;
        this.numberOfWorkers = employeesCount;
    }
    public Company()
    {

    }

    //Get & Set
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return numberOfWorkers;
    }

    public void setEmployeesCount(long employeesCount) {
        this.numberOfWorkers = employeesCount;
    }

}

