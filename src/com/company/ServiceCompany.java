package com.company;

public class ServiceCompany {



    public Company getTopLevelParent(Company child)
    {
        if (child.getParent() == null )
        {
            return child;
        }

        Company company = child;

        while (company.getParent() != null)
        {
            company = company.getParent();
        }
        return company;
    }


    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies)
    {
        long count = company.getEmployeesCount();


        List<Company> children = company.();

        while (children.size() != 0) {

            Company currentChild = children.get(0);

            if (currentChild.getChildren().size() > 0)
            {
                // add companies to children list
                children.addAll(currentChild.getChildren());
            }
            count += currentChild.getEmployeesCount();
            children.remove(currentChild);

            for (Company child : children)
            {
                // get children's children
                count += this.getEmployeeCountForCompanyAndChildren(child, companies);
            }
        }
        return count;
    }
}

