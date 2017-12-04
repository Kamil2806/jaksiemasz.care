package task1;

import com.google.common.collect.Lists;
import task1.Component.Employee;
import task1.Composite.TeamManager;
import task1.Enum.EnumRole;
import task1.Leaf.Developer;

import java.util.List;
import java.util.Random;

public class CompanyGenerator {

    private Random random = new Random();
    private List<TeamManager> managers = Lists.newLinkedList();
    private List<Employee> employees = Lists.newArrayList();
    private List<String> names = Lists.newArrayList("Mcaciek", "Bogdan", "Stefan", "Remigiusz", "Magdalena");
    private List<EnumRole> developersRoles = Lists.newArrayList(EnumRole.DEVELOPER,
            EnumRole.TEAM_LEADER, EnumRole.TESTER, EnumRole.CONTRIBUTOR);
    private EnumRole ceoRole = EnumRole.CEO;
    private EnumRole developmentManagerRole = EnumRole.DEVELOPMENT_MANAGER;
    Integer numOfCeo = 0;


    public void generateCompany(int numOfLevels) {
        for (int i = 0; i < numOfLevels; i++) {
            if(i == 0) {
                generateRandomNumOfCeo();
            }
            else if(i > 0 && i < numOfLevels-1) {
                generateDM();
                if(i == 2) hireDMByCeo();
                else hireDMByDM();
            }
            else {
                generateDevelopers();
                hireEmployeesByDM();
            }
        }
    }

    private void hireDMByDM() {
        int k = numOfCeo;
        for (int i = 0; i < numOfCeo; i++){
            while(managers.get(i).canHire()) {
                managers.get(i).hire(managers.get(k));
                k++;
            }
        }
    }

    public List<TeamManager> getManagers() {
        return managers;
    }

    private void hireEmployeesByDM() {
        for (int i = numOfCeo; i < managers.size(); i++){
                while (managers.get(i).canHire()) {
                    managers.get(i).hire(employees.get(0));
                    employees.remove(0);
                }
            }
        }

    private void generateDevelopers() {
        for (int i = 0; i < (managers.size()-numOfCeo)*2; i++) {
            employees.add(new Developer(getRandomName(), getRandomDevelopersRole()));
        }
    }

    private void hireDMByCeo() {
        int k = numOfCeo;
        for (int i = 0; i < numOfCeo; i++){
            while(managers.get(i).canHire()) {
                managers.get(i).hire(managers.get(k));
                k++;
            }
        }
    }

    private void generateDM() {
        for (int i = 0; i < numOfCeo*2; i++) {
            Integer numOfEmployees = 2;
            managers.add(new TeamManager(getRandomName(), developmentManagerRole, numOfEmployees));
        }
    }

    private void generateRandomNumOfCeo() {
        Integer numOfEmployees = 2;
        numOfCeo = random.nextInt(3)+1;
        for (int i =0; i < numOfCeo; i++){
            managers.add(new TeamManager(getRandomName(), ceoRole, numOfEmployees));
        }
    }


    private String getRandomName() {
        return names.get(random.nextInt(5));
    }

    public EnumRole getRandomDevelopersRole() {
        return developersRoles.get(random.nextInt(4));
    }
}
