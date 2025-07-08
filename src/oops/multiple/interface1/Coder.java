package oops.multiple.interface1;
// Interface Before JAVA 8 -- we can only declare method
public interface Coder {
    void writeCode();
}


interface Tester{
    void testCode();
}

class DevOpsEngineer implements Coder,Tester{
    @Override
    public void writeCode() {
        System.out.println("DevOps Engineer writes automation scripts");
    }

    @Override
    public void testCode() {
        System.out.println("DevOps Engineer tests deployment pipelines");
    }

    public void deploy(){
        System.out.println("DevOps Engineer deploys code to cloud");
    }
}

class Main{
    public static void main(String[] args) {
        DevOpsEngineer devOpsEngineer=new DevOpsEngineer();
        devOpsEngineer.writeCode();
        devOpsEngineer.testCode();
        devOpsEngineer.deploy();
    }
}