package calculator;

public class MemoryRecalOperation implements Operation {

    private Memory memory;

    public MemoryRecalOperation(Memory memory) {

        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {
    }

    @Override
    public int getResult() {
        return memory.recall();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
