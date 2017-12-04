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
    Integer numOfAllEmployees = 0;
    Integer iteratorCeo = 0;
    Integer iteratorDM = 0;
    Integer iterator = 0;


    public void generateCompany(int numOfLevels) {
        for (int i = 0; i < numOfLevels; i++) {
            if(i == 0) {
                generateRandomNumOfCeo();
            }
            else if(i > 0 && i < numOfLevels-1) {
                generateDM();
                hireEmployeesByCeo();
            }
            else {
                generateDevelopers();
                hireEmployeesByDM();
            }
        }
    }

    public List<TeamManager> getManagers() {
        return managers;
    }

    private void hireEmployeesByDM() {
        for (int i = 2; i < 5; i++){
                while (managers.get(i).canHire()) {
                    managers.get(i).hire(employees.get(0));
                    employees.remove(0);
                }
            }
        }

    private void generateDevelopers() {
        for (int i = 0; i < 8; i++) {
            employees.add(new Developer(getRandomName(), getRandomDevelopersRole()));
        }
    }

    private void hireEmployeesByCeo() {
        int k = 2;
        for (int i = 0; i < 2; i++){
            while(managers.get(i).canHire()) {
                managers.get(i).hire(managers.get(k));
                k++;
            }
        }
    }

    private void generateDM() {
        for (int i = 0; i < 4; i++) {
            Integer numOfEmployees = 2;
            managers.add(new TeamManager(getRandomName(), developmentManagerRole, numOfEmployees));
        }
    }

    private void generateRandomNumOfCeo() {
        Integer numOfEmployees = 2;
        for (int i =0; i < 2; i++){
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
