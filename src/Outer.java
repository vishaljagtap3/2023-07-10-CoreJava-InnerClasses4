public class Outer {
    private int out;
    private static int sout = 90;

    public Outer(int out) {
        this.out = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public static class Inner {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }

        public void display() {
            System.out.println("in = " + in);
            System.out.println("sout = " + sout); //static inner class can access only the static members of outer class because to access static we do not need outer class object
            //Outer.this.display(); //static inner class fun will receive only one this which refers to inner class object unlike non static inner class
            //System.out.println("out = " + out); //will not work
        }
    }
}
