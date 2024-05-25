import java.util.ArrayList;
import java.util.Scanner;

public class TestCompanyWorker {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Worker worker1 = new Worker(scanner.next(), scanner.nextDouble());

            Worker worker2 = new Worker(scanner.next(), scanner.nextDouble());

            Worker worker3 = new Worker(scanner.next(), scanner.nextDouble());

            Company company = new Company();

            company.addWorkers(worker1);
            company.addWorkers(worker2);
            company.addWorkers(worker3);

            System.out.println("姓名\t\t" + "工资");

            System.out.println("-------------------------");

            System.out.println(company.toString());

            System.out.println("工资合计" + company.earnings());
        }

    }

}

class Worker {
    private String name;
    private double sal;

    public Worker() {
    }

    public Worker(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return name + "\t\t\t" + sal;
    }

}

class Company {
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private String name;

    public Company() {

    }

    public Company(String name, ArrayList<Worker> workers) {
        this.name = name;
        this.workers = workers;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWorkers(Worker worker) {
        workers.add(worker);
    }

    public double earnings() {
        double totalSal = 0;
        for (int i = 0; i < workers.size(); i++) {
            totalSal += workers.get(i).getSal();
        }
        return totalSal;
    }

    @Override
    public String toString() {
        StringBuilder Msg = new StringBuilder();
        for (int i = 0; i < workers.size(); i++) {
            Msg.append(workers.get(i).toString() + "\n");
        }
        return Msg.toString();
    }

}
