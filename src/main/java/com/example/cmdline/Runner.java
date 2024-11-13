// ChatGPT

package com.example.cmdline;

import com.example.Greeting;
import org.apache.commons.cli.*;

public class Runner {
    public static void main(String[] args) {
        // Define command-line options
        Options options = new Options();
        options.addOption("g", "greet", false, "Display a greeting message");
        options.addOption("n", "name", true, "Specify the name for the greeting");
        options.addOption("v", "verbose", false, "Enable verbose mode");

        // Parse command-line arguments
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            // Check if the greet option is set
            if (cmd.hasOption("g")) {
                Greeting.sayHi();
            }

            // Check if the name option is set
            if (cmd.hasOption("n")) {
                String name = cmd.getOptionValue("n");
                System.out.println("Hello, " + name + "!");
            }

            // Check if verbose mode is enabled
            if (cmd.hasOption("v")) {
                System.out.println("Verbose mode enabled. Additional information will be shown.");
            }

            // If no options are provided, display usage information
            if (!cmd.hasOption("g") && !cmd.hasOption("n") && !cmd.hasOption("v")) {
                System.out.println("No options provided. Use -g for greeting, -n to specify name, and -v for verbose mode.");
            }

        } catch (ParseException pe) {
            System.err.println("Failed to parse args: " + pe.getMessage());
            new HelpFormatter().printHelp("Runner", options);
        }
    }
}