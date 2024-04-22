package sandbox;

public class TestParent {
    protected String descritption;

    public TestParent(String descritption) {
        this.descritption = descritption;
    }

    public String getDescritption() {
        return descritption;
    }

    public void setDescritption(String descritption) {

        this.descritption = descritption;
    }

    @Override
    public String toString() {
        return "TestParent{" +
                "descritption='" + descritption + '\'' +
                '}';
    }
}
