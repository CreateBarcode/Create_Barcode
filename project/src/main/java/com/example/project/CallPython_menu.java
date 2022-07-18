package com.example.project;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class CallPython_menu {
    public static String main() {

        System.out.println("Python Call");

        String[] command = new String[3];
        command[0] = "python";
        command[1] = "C:\\Users\\USER\\PycharmProjects\\pythonProject1\\quiz5.py";

        try {
            return execPython(command);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static String execPython(String[] command) throws IOException {
        CommandLine commandLine = CommandLine.parse(command[0]);
        for (int i = 1, n = command.length; i < n; i++) {
            commandLine.addArgument(command[i]);
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PumpStreamHandler pumpStreamHandler = new PumpStreamHandler(outputStream);
        DefaultExecutor executor = new DefaultExecutor();
        executor.setStreamHandler(pumpStreamHandler);
        executor.execute(commandLine);

        String output = outputStream.toString();
        System.out.println("output: " + output);
        return output;

    }
}
