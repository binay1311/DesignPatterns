package SOLID_Principles.InterfaceSegregation.bad;

public class badDBDAOConnection implements badDAOInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open File not Supported");
    }

    @Override
    public void deleteRecord() {

    }
}
