package SOLID_Principles.InterfaceSegregation.bad;

public class badFileDAOConnection implements badDAOInterface{
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("Cant open a connection");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
