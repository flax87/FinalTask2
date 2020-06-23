package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ServiceCompany service = new ServiceCompany();

        // create Company objects
        Company cheif = new Company(null, 50);
        Company accounting = new Company(null, 30);
        Company lawyer = new Company(cheif, 20);
        Company developer = new Company(cheif, 5);
        Company backEnd = new Company(developer, 4);
        Company frontEnd = new Company(developer, 4);
        Company devOps = new Company(backEnd, 2);
        Company design = new Company( frontEnd, 2);

        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>

                        ArrayList.asList(
                                cheif,
                                accounting,
                                lawyer,
                                developer,
                                backEnd,
                                frontEnd,
                                devOps,
                                design
                        )
                ;

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company.getName());
        }



        //  Accounting top
        Company accountingTopLevelParent = service.getTopLevelParent(accounting);
        System.out.println("Accounting top parent is: " + accountingTopLevelParent);

        // Designer top
        Company designTopLevelParent = service.getTopLevelParent(design);
        System.out.println("Designer top parent is: " + designTopLevelParent);

        // employee count for developer and all its children
        long EmployeesCount = service.getEmployeeCountForCompanyAndChildren(developer, companies);
        System.out.println("Employees Amount for developer and all its children: " + EmployeesCount);

        // employee count for developer and all its children
        long EmployeesCount2 = service.getEmployeeCountForCompanyAndChildren(cheif, companies);
        System.out.println("Employees Amount for cheif and all its children: " + EmployeesCount2);

        //  Designer top  parent
        String lawyerTopLevelParent = service.getTopLevelParent(lawyer);
        System.out.println("Lawyer top level parent is: " + lawyerTopLevelParent);
    }
}
    }
}
