//package task1;
//
//
//import task1.Composite.TeamManager;
//
//public class CompanyGeneratorMain {
//
//    public static void main(String[] args) {
//
//        CompanyGenerator company = new CompanyGenerator();
//
//        company.generateCompany(4);
//
//        for(int i=0; i < company.getCeos().size(); i++) {
//            System.out.println("CEO");
//            System.out.println(company.getCeos().get(i));
//            System.out.println("MANAGERS");
//            System.out.println(company.getCeos().get(i).getEmployees());
//            TeamManager employee1 = ((TeamManager)company.getCeos().get(i).getEmployees().get(0));
//            System.out.println(employee1.getEmployees());
//            TeamManager employee2 = ((TeamManager)company.getCeos().get(i).getEmployees().get(1));
//            System.out.println(employee2.getEmployees());
//        }
//    }
//}
