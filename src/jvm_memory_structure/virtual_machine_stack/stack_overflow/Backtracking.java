package src.jvm_memory_structure.virtual_machine_stack.stack_overflow;

public class Backtracking {
    public static void main(String[] args) {
        method(1);
    }
    static int method(int num){

        System.out.println(num++);
        return method(num);
    }
}
