//package task1;
//
//import com.google.common.collect.Lists;
//import task1.Component.Employee;
//import task1.Composite.TeamManager;
//import task1.Enum.EnumRole;
//import task1.Leaf.Developer;
//
//import java.util.List;
//import java.util.Random;
//
//public class CompanyGenerator {
//
//    private Random random = new Random();
//    private List<TeamManager> ceos = Lists.newLinkedList();
//    private List<TeamManager> dms = Lists.newLinkedList();
//    private List<Employee> employees = Lists.newArrayList();
//    private List<String> names = Lists.newArrayList("Mcaciek", "Bogdan", "Stefan", "Remigiusz", "Magdalena");
//    private List<EnumRole> developersRoles = Lists.newArrayList(EnumRole.DEVELOPER,
//            EnumRole.TEAM_LEADER, EnumRole.TESTER, EnumRole.CONTRIBUTOR);
//    private EnumRole ceoRole = EnumRole.CEO;
//    private EnumRole developmentManagerRole = EnumRole.DEVELOPMENT_MANAGER;
//    Integer numOfManagers = 0;
//
//
//    public void generateCompany(int numOfLevels) {
//        for (int i = 1; i <= numOfLevels; i++) {
//            if(i == 1) {
//                generateRandomNumOfCeo();
//            }
//            if(i > 1) {
//                if(i == 2) {
//                    generateDM();
//                    hireDMByCeo();
//                }
//                else if(i > 2 && numOfLevels > 3 && i != numOfLevels) {
//                    generateDM();
//                    hireDMByDM();
//                    removeEmployees();
//                }
//            }
//            if(i == numOfLevels && numOfLevels > 2) {
//                generateDevelopers();
//                hireEmployeesByDM();
//            }
//        }
//    }
//
//    private void hireEmployeesByDM() {
//        int k = 0;
//        int numOfHiring = numOfManagers;
//        for (int i = 0; i < numOfHiring; i++){
//            while (dms.get(i).canHire()) {
//                dms.get(i).hire(employees.get(k));
//                k++;
//            }
//        }
//    }
//
//    public List<TeamManager> getCeos() {
//        return ceos;
//    }
//
//    private void generateDevelopers() {
//        for (int i = 0; i < dms.size()*2; i++) {
//            employees.add(new Developer(getRandomName(), getRandomDevelopersRole()));
//        }
//    }
//
//    private void removeEmployees() {
//        for(int i = 0; i < numOfManagers/2; i++) {
//            dms.remove(i);
//        }
//    }
//
//    private void hireDMByDM() {
//        int numOfHiring = numOfManagers / 2;
//        int k = numOfHiring;
//        for (int i = 0; i < numOfHiring; i++){
//            while (dms.get(i).canHire()) {
//                dms.get(i).hire(dms.get(k));
//                k++;
//            }
//        }
//    }
//
//    private void hireDMByCeo() {
//        int k = 0;
//        int numOfHiring = numOfManagers / 2;
//        for (int i = 0; i < numOfHiring; i++) {
//                while (ceos.get(i).canHire() && k < dms.size()) {
//                    ceos.get(i).hire(dms.get(k));
//                    k++;
//                }
//            }
//        }
//
//    private void generateDM() {
//        numOfManagers = numOfManagers*2;
//        for (int i = 0; i < numOfManagers; i++) {
//            Integer numOfEmployees = 2;
//            dms.add(new TeamManager(getRandomName(), developmentManagerRole, numOfEmployees));
//        }
//    }
//
//    private void generateRandomNumOfCeo() {
//        Integer numOfEmployees = 2;
//        numOfManagers = random.nextInt(3)+1;
//        for (int i =0; i < numOfManagers; i++){
//            ceos.add(new TeamManager(getRandomName(), ceoRole, numOfEmployees));
//        }
//    }
//
//
//    private String getRandomName() {
//        return names.get(random.nextInt(5));
//    }
//
//    public EnumRole getRandomDevelopersRole() {
//        return developersRoles.get(random.nextInt(4));
//    }
//}
