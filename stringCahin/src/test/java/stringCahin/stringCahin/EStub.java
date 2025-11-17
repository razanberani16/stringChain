package stringCahin.stringCahin;

public class EStub extends E {
    private boolean fail;
    public EStub(boolean fail) { this.fail = fail; }

    @Override
    public String process(String prefix) {
        if (fail) throw new IllegalArgumentException("קלט קצר מדי");
        return super.process(prefix);
    }
}
