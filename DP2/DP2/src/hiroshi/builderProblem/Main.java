package hiroshi.builderProblem;
public class Main {
    public static void main(String[] args) {
        //if (args.length != 1) {
        //    usage();
        //    System.exit(0);
        //}
        if (args.length != 1 || args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + " is created.");
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain -> Creating Plain file");
        System.out.println("Usage: java Main html  -> Creating HTML");     
    }
}
