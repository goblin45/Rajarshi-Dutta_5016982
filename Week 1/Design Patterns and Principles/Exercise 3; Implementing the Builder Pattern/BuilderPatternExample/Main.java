class Computer {
    protected int RAM, Storage; 
    protected String CPU;

    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.CPU = builder.CPU;
    }

    static class Builder {
        private int RAM, Storage; 
        private String CPU;

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public void setStorage(int Storage) {
            this.Storage = Storage;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

class Main {
    static void printComputer(Computer computer) {
        System.out.println("RAM: " + computer.RAM);
        System.out.println("Storage: " + computer.Storage);
        System.out.println("CPU: " + computer.CPU);
    }
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();
        builder.setRAM(16);
        builder.setStorage(512);
        builder.setCPU("i5");
        Computer computer = builder.build();

        printComputer(computer);
    }
}

/*

Output:

RAM: 16
Storage: 512
CPU: i5

*/