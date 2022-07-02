package com.command_line;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

@Command(name="gitchat", mixinStandardHelpOptions= true, version = "gitchat 1.0", description = "Sends perpetual commit request and texts to server.")
public class Main implements Callable<Integer> {

    @Option(names = {"-cl", "--cool-down"}, description = "Cool down amount after commit (in seconds)")
    private int coolDownAmt = 0;

    @Option(names = {"-c", "--commit"}, description = "Commit amount per interval")
    private int commitAmt = 0;

    @Option(names = {"-m", "--message"}, description = "Message to add")
    private String message = "";

    public Integer call() throws Exception {
        System.out.println("coolDownAmt: " + coolDownAmt);
        System.out.println("commitAmt: " + commitAmt);x
        System.out.println("message: " + message);
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}
