/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 *
 * @version 23.06.20
 *
 *
 * Final course task
 *
 * The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.

IMPLEMENT THE FOLLOWING INTERFACE.

public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;
}

public interface ICompanyService {

     * @param child - company for which we are searching the top level parent
     *                  (parent of parent of ...)
     * @return top level paren

Company getTopLevelParent(Company child);


         *
         * @param company  - company for which we are searching the count of employees
         *                 (count of this company employees +
         *                 count employees of all children and their children employees )
         * @param companies  - list of all available companies
         *
         * @return count of employees


        }
 */

package com.company;

import java.util.ArrayList;

public class Company
{
    private Company parent;
    private long employeesCount;
    private String name;
    private ArrayList<Company> children;

    public Company(Company parent, long employeesCount, String name)
    {
        this.parent = parent;
        this.employeesCount = employeesCount;
        this.name = name;
    }

    public Company(ArrayList<Company> children) {
        this.children = children;
    }

    public Company()
    {

    }

    //Getters and Setters
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public ArrayList<Company> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Company> children) {
        this.children = children;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}