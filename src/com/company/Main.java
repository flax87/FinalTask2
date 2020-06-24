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

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       ServiceCompany service = new ServiceCompany();

        //create Company objects
        Company cheif = new Company(null, 40, "cheif");
        Company accounting = new Company( null, 22, "accounting");
        Company developer = new Company(cheif, 7, "lawyer");
        Company backEnd = new Company(developer, 3, "backEnd");
        Company devOps = new Company(backEnd, 3, "devOps");
        Company frontEnd = new Company(developer, 1, "frontend");
        Company lawyer = new Company(cheif, 14, "lawyer");
        Company design = new Company(frontEnd, 3, "design");

        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>
                (
                        Array.asList(
                                cheif,
                                accounting,
                                lawyer,
                                developer,
                                backEnd,
                                frontEnd,
                                devOps,
                                design
                        )
                );

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company.getName());
        }


        //  lawyer top level parent
        String lawyerTopLevelParent = service.getTopLevelParent(cheif).getName();
        System.out.println("Lawyer top level parent is: " + lawyerTopLevelParent);

        //  Accounting top level parent
        String accountingTopLevelParent = service.getTopLevelParent(accounting).getName();
        System.out.println("Accounting top level parent is: " + accountingTopLevelParent);

        // Developer top level parent
        String developerTopLevelParent = service.getTopLevelParent(cheif).getName();
        System.out.println("Developer top level parent is: " + developerTopLevelParent);

        // Back end top level parent
        String backEndTopLevelParent = service.getTopLevelParent(developer).getName();
        System.out.println("Backend top level parent is: " + backEndTopLevelParent);

        // Front end top level parent
        String frontEndTopLevelParent = service.getTopLevelParent(developer).getName();
        System.out.println("Frontend top level parent is: " + frontEndTopLevelParent);

        // DevOps top level parent
        String devOpsTopLevelParent = service.getTopLevelParent(backEnd).getName();
        System.out.println("DevOps top level parent is: " + devOpsTopLevelParent);

        // Designer top level parent
        String designTopLevelParent = service.getTopLevelParent(frontEnd).getName();
        System.out.println("Designer top level parent is: " + designTopLevelParent);

        // employee count for developer and all its children
        long EmployeesCount = service.getEmployeeCountForCompanyAndChildren(developer, companies);
        System.out.println("Employees Amount for developer and all its children: " + EmployeesCount);

        // employee count for developer and all its children
        long EmployeesCount2 = service.getEmployeeCountForCompanyAndChildren(cheif, companies);
        System.out.println("Employees Amount for cheif and all its children: " + EmployeesCount2);

    }
}
