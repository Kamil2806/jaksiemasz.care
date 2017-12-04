package task1;


import task1.Service.IntroducingService;

public class CompanyGeneratorMain {

    public static void main(String[] args) {


        CompanyGenerator company = new CompanyGenerator();

        company.generateCompany(3);

        System.out.println(company.getManagers());

        for(int i =0; i < company.numOfCeo; i++) {
            System.out.println(IntroducingService.introduceCompany(company.getManagers().get(i)));
        }

    }
}
