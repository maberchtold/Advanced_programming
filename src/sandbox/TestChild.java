package sandbox;

public class TestChild extends TestParent{
    private String childName;

    public TestChild(String descritption, String childName) {
        super(descritption);
        this.childName = childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "TestChild{" +
                "childName='" + childName + '\'' +
                '}';
    }
}
